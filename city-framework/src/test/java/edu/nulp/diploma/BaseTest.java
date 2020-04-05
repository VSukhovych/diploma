package edu.nulp.diploma;

import edu.nulp.diploma.logger.LogListener;
import edu.nulp.diploma.logger.RetryAnalyzer;
import edu.nulp.diploma.webdriver.DriverRepository;
import org.openqa.selenium.remote.BrowserType;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.annotations.*;

@Listeners(LogListener.class)
public class BaseTest {

    private final DriverRepository driverRepository = new DriverRepository();

    @BeforeSuite(alwaysRun = true)
    public void beforeSuite(ITestContext context) {
        for (ITestNGMethod method : context.getAllTestMethods()) {
            method.setRetryAnalyzerClass(RetryAnalyzer.class);
        }
        driverRepository.downloadWebDriver();
    }

    @BeforeClass(alwaysRun = true)
    public void instantiateBrowser() {
        driverRepository.instantiateBrowser();
    }

    @BeforeMethod(alwaysRun = true)
    public void setWebDriverAttribute(ITestResult testResult) {
        testResult.setAttribute("WebDriver", DriverRepository.DRIVERS.get());
    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        if (DriverRepository.getBrowserType().equals(BrowserType.CHROME)) {
            DriverRepository.DRIVERS.get().manage().deleteAllCookies();
        }
        if (DriverRepository.getBrowserType().equals("edge")) {
            DriverRepository.DRIVERS.get().executeScript("Object.defineProperty(BeforeUnloadEvent.prototype, 'returnValue', { get:function(){}, set:function(){} });");
        }
        DriverRepository.DRIVERS.get().quit();
    }
}
