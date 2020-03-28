package edu.nulp.diploma.webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.HashMap;
import java.util.Map;

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
            case "edge":
                WebDriverManager.edgedriver().setup();
                break;
            case "ie":
                WebDriverManager.iedriver().setup();
                break;
            default:
                WebDriverManager.chromedriver().setup();
        }
    }

    public void instantiateBrowser() {
        String browserType = getBrowserType();
        RemoteWebDriver driver;
        switch (browserType) {
            case BrowserType.CHROME:
                ChromeOptions chromeOptions = new ChromeOptions();
//                chromeOptions.setHeadless(true);
                chromeOptions.addArguments("--disable-gpu");
                chromeOptions.addArguments("--disable-browser-side-navigation");
                chromeOptions.addArguments("--no-sandbox");
                chromeOptions.addArguments("--disable-dev-shm-usage");
                System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
                driver = new ChromeDriver(chromeOptions);
                break;
            case "mobileChrome":
                Map<String, Object> mobileEmulation = new HashMap<>();
                mobileEmulation.put("deviceName", "Nexus 5");
                ChromeOptions mobileChromeOptions = new ChromeOptions();
                mobileChromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
                driver = new ChromeDriver(mobileChromeOptions);
                break;
            case BrowserType.FIREFOX:
                FirefoxOptions options = new FirefoxOptions();
                options.setHeadless(true);
                options.addPreference("dom.disable_beforeunload", true);
                System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
                System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
                driver = new FirefoxDriver(options);
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            case "safari":
                driver = new SafariDriver();
                break;
            case "ie":
                InternetExplorerOptions internetExplorerOptions = new InternetExplorerOptions();
                internetExplorerOptions.disableNativeEvents();
                internetExplorerOptions.setCapability(InternetExplorerDriver.UNEXPECTED_ALERT_BEHAVIOR, "dismiss");
                internetExplorerOptions.introduceFlakinessByIgnoringSecurityDomains();
                internetExplorerOptions.setCapability("disable-popup-blocking", true);
                internetExplorerOptions.enablePersistentHovering();
                internetExplorerOptions.destructivelyEnsureCleanSession();
                driver = new InternetExplorerDriver(internetExplorerOptions);
                break;
            default:
                driver = new ChromeDriver();
        }
        DRIVERS.set(driver);
    }
}
