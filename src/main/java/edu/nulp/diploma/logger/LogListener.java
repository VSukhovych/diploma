package edu.nulp.diploma.logger;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.FileAppender;
import edu.nulp.diploma.webdriver.DriverRepository;
import io.qameta.allure.Attachment;
import io.restassured.RestAssured;
import io.restassured.filter.log.ErrorLoggingFilter;
import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.slf4j.LoggerFactory;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class LogListener implements ITestListener {

    public static Logger log;

    private static final String TARGET_LOGS = "target/logs/";
    private static final String THREAD = "Thread";
    private static final String ALLURE_APPENDER = "allureAppender";

    @Override
    public void onStart(ITestContext context) {
        Class testClass = context.getAllTestMethods()[0].getRealClass();
        log = (Logger) LoggerFactory.getLogger(testClass);

        PrintStream customPrintStream = new CustomPrintStream().getPrintStream();

        RestAssured.filters(new RequestLoggingFilter(LogDetail.URI, customPrintStream),
                new RequestLoggingFilter(LogDetail.METHOD, customPrintStream),
                new RequestLoggingFilter(LogDetail.BODY, customPrintStream),
                new RequestLoggingFilter(LogDetail.COOKIES, customPrintStream),
                new ResponseLoggingFilter(LogDetail.STATUS, customPrintStream),
                new ErrorLoggingFilter(customPrintStream));
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        log.info(("\n\n " + "*********** Test succeeded " + result.getMethod().getMethodName() + "*********** \n\n"));
        String filename = TARGET_LOGS + result.getName() + THREAD + Thread.currentThread().getId() + ".log";
        attachTextLog(filename);
        log.detachAppender(ALLURE_APPENDER + result.getName() + THREAD + Thread.currentThread().getId());
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        if (iTestResult.getMethod().getRetryAnalyzer(iTestResult) != null) {
            RetryAnalyzer retryAnalyzer = (RetryAnalyzer) iTestResult.getMethod().getRetryAnalyzer(iTestResult);

            if (retryAnalyzer.isRetryAvailable()) {
                iTestResult.setStatus(ITestResult.SKIP);
            } else {
                iTestResult.setStatus(ITestResult.FAILURE);
            }
            Reporter.setCurrentTestResult(iTestResult);
        }

        log.info(("\n\n " + "*********** Test failed " + iTestResult.getMethod().getMethodName() + "***********" + " \n\n"));

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        iTestResult.getThrowable().printStackTrace(pw);
        String stackTrace = sw.toString();

        log.error(stackTrace);
        String filename = TARGET_LOGS + iTestResult.getName() + THREAD + Thread.currentThread().getId() + ".log";

        attachTextLog(filename);
        Object webDriverAttribute = iTestResult.getAttribute("WebDriver");
        if (webDriverAttribute instanceof WebDriver) {
            saveScreenshot(DriverRepository.DRIVERS.get().getScreenshotAs(OutputType.BYTES));
        }

        log.detachAppender(ALLURE_APPENDER + iTestResult.getName() + THREAD + Thread.currentThread().getId());
    }

    @Override
    public void onTestStart(ITestResult result) {
        String filename = TARGET_LOGS + result.getName() + THREAD + Thread.currentThread().getId() + ".log";

        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        PatternLayoutEncoder ple = new PatternLayoutEncoder();
        ple.setPattern("%d{\"HH:mm:ss,SSS\"} %5p %C{1.}:%M:%L - %m%n");
        ple.setContext(lc);
        ple.start();
        FileAppender<ILoggingEvent> fileAppender = new FileAppender<>();

        fileAppender.setFile(filename);
        fileAppender.setEncoder(ple);
        fileAppender.setContext(lc);
        fileAppender.setAppend(true);
        fileAppender.addFilter(new ThreadLoggingFilter(Thread.currentThread().getName()));
        fileAppender.start();

        ch.qos.logback.classic.Logger logbackLogger =
                (ch.qos.logback.classic.Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
        logbackLogger.addAppender(fileAppender);

        log.info("\n\n" + "*********** Test started " + result.getMethod().getMethodName() + "***********" + " \n\n");
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        log.info((" \n\n " + "*********** Test skipped " + iTestResult.getMethod().getMethodName() + "*********** \n\n"));
        String filename = TARGET_LOGS + iTestResult.getName() + THREAD + Thread.currentThread().getId() + ".log";
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        iTestResult.getThrowable().printStackTrace(pw);
        String stackTrace = sw.toString();

        log.error(stackTrace);
        attachTextLog(filename);
        log.detachAppender(ALLURE_APPENDER + iTestResult.getName() + THREAD + Thread.currentThread().getId());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }

    @Attachment(value = "log", type = "text/plain")
    private String attachTextLog(String filename) {
        try {
            File file = new File(filename);
            return FileUtils.readFileToString(file, StandardCharsets.UTF_8);
        } catch (IOException e) {
            log.info("Can not attach log file", e);
        }
        return "";
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    private byte[] saveScreenshot(byte[] screenShot) {
        return screenShot;
    }
}
