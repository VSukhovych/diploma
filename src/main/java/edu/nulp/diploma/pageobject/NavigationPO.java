package edu.nulp.diploma.pageobject;

import edu.nulp.diploma.constant.LvivCityUrls;
import edu.nulp.diploma.logger.LogListener;
import edu.nulp.diploma.webdriver.DriverAlert;
import edu.nulp.diploma.webdriver.DriverRepository;
import edu.nulp.diploma.constant.TestConstantValues;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static edu.nulp.diploma.constant.TestConstantValues.BROWSER_WINDOW_HEIGHT;
import static java.util.stream.Collectors.joining;

public class NavigationPO {

    private RemoteWebDriver driver;
    private WebDriverWait wait;

    public NavigationPO() {
        this.driver = DriverRepository.DRIVERS.get();
        this.wait = (WebDriverWait) new WebDriverWait(driver, Duration.ofSeconds(TestConstantValues.WAIT_VALUE))
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1));
    }

    public void navigateToUrl(String url) {
        LogListener.log.info("Navigate to url: {}", url);
        try {
            driver.get(url);
            new DriverAlert().dismiss();
        } catch (UnhandledAlertException | NoAlertPresentException ex) {
            driver.get(url);
        }
        setBrowseWindowSize();
    }

    public void navigateLvivCityHomePage() {
        LogListener.log.info("Navigate to url: {" + LvivCityUrls.LVIV_CITY_BASE_URL + "}");
        try {
            driver.get(LvivCityUrls.LVIV_CITY_BASE_URL);
            new DriverAlert().dismiss();
        } catch (UnhandledAlertException | NoAlertPresentException ex) {
            driver.get(LvivCityUrls.LVIV_CITY_BASE_URL);
        }
        setBrowseWindowSize();
    }

    private void setBrowseWindowSize() {
        driver.manage().window().setSize(new Dimension(TestConstantValues.BROWSER_WINDOW_WIDTH, TestConstantValues.BROWSER_WINDOW_HEIGHT));
    }
}
