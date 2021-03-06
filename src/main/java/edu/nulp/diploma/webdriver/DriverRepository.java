package edu.nulp.diploma.webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverRepository {

    public static final ThreadLocal<RemoteWebDriver> DRIVERS = new ThreadLocal<>();

    public static String getBrowserType() {
        return System.getProperty(LogType.BROWSER, BrowserType.CHROME);
    }

    public void downloadWebDriver() {
        String browserType = getBrowserType();
        switch (browserType) {
            case BrowserType.CHROME:
                WebDriverManager.chromedriver().setup();
                break;
            case BrowserType.FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                break;
            default:
                WebDriverManager.chromedriver().setup();
                break;
        }
    }

    public void instantiateBrowser() {
        String browserType = getBrowserType();
        RemoteWebDriver driver;
        switch (browserType) {
            case BrowserType.CHROME:
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.setHeadless(true);
                chromeOptions.addArguments("--disable-gpu");
                chromeOptions.addArguments("--disable-browser-side-navigation");
                chromeOptions.addArguments("--no-sandbox");
                chromeOptions.addArguments("--disable-dev-shm-usage");
                System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
                driver = new ChromeDriver(chromeOptions);
                break;
            case BrowserType.FIREFOX:
                FirefoxOptions options = new FirefoxOptions();
                options.setHeadless(true);
                options.addPreference("dom.disable_beforeunload", true);
                System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
                System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
                driver = new FirefoxDriver(options);
                break;
            default:
                driver = new ChromeDriver();
        }
        DRIVERS.set(driver);
    }
}
