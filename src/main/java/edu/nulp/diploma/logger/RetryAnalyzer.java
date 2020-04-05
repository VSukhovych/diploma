package edu.nulp.diploma.logger;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;

public class RetryAnalyzer implements IRetryAnalyzer {
    private static int maxRetryCount = 2;

    private AtomicInteger count = new AtomicInteger(maxRetryCount);

    public boolean isRetryAvailable() {
        return (count.intValue() > 0);
    }

    public boolean retry(ITestResult result) {
        boolean retry = false;
        if (isRetryAvailable()) {
            LogListener.log.info("Going to retry test case: " + result.getMethod() + ", " + (maxRetryCount - count.intValue() + 1) + " out of " + maxRetryCount);
            retry = true;
            count.decrementAndGet();
        }
        return retry;
    }

    private boolean hasServerError(ITestResult testResult) {
        Throwable throwable = testResult.getThrowable();
        Pattern pattern = Pattern.compile("^.*(4|5)\\d\\d.*$", Pattern.DOTALL);
        while (throwable != null) {
            if (pattern.matcher(throwable.getMessage()).find()) {
                return true;
            }
            throwable = throwable.getCause();
        }
        return false;
    }

    private boolean hasSeleniumError(ITestResult testResult) {
        Throwable throwable = testResult.getThrowable();
        Pattern pattern = Pattern.compile("^.*(selenium)*$", Pattern.DOTALL);
        while (throwable != null) {
            if (pattern.matcher(throwable.getMessage()).find()) {
                return true;
            }
            throwable = throwable.getCause();
        }
        return false;
    }
}
