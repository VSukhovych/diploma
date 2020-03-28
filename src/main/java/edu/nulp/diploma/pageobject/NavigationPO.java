package edu.nulp.diploma.pageobject;

import edu.nulp.diploma.constant.EndpointConstants;
import edu.nulp.diploma.logger.LogListener;
import edu.nulp.diploma.webdriver.DriverRepository;
import edu.nulp.diploma.constant.TestDataValues;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.util.stream.Collectors.joining;

public class NavigationPO {

    private RemoteWebDriver driver;
    private WebDriverWait wait;

    public NavigationPO() {
        this.driver = DriverRepository.DRIVERS.get();
        this.wait = (WebDriverWait) new WebDriverWait(driver, Duration.ofSeconds(TestDataValues.WAIT_VALUE))
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1));
    }

    public void navigateToUrl(String url) {
        LogListener.log.info("Navigate to url: {}", url);
        try {
            driver.get(url);
        } catch (UnhandledAlertException | NoAlertPresentException ex) {
            driver.get(url);
        }
        driver.manage().window().setSize(new Dimension(1440, 900));
    }

//    public void navigateToAveryHomePage(String page) {
//        String url = EndpointConstants.getCMSUrl() + page;
//        LogListener.log.info("Navigate to link: {}", url);
//        try {
//            driver.get(url);
//        } catch (UnhandledAlertException | NoAlertPresentException ex) {
//            driver.get(url);
//        }
//        driver.manage().window().setSize(new Dimension(1440, 900));
//    }
}
