package edu.nulp.diploma.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static edu.nulp.diploma.constant.TestDataValues.WAIT_VALUE;

public class DriverWait {

    private WebDriverWait wait;

    private static final String LOADING_VIEW_XPATH = ".//*[@class='dpo8-loading-view']";

    public DriverWait() {
        RemoteWebDriver driver = DriverRepository.DRIVERS.get();
        wait = (WebDriverWait) new WebDriverWait(driver, Duration.ofSeconds(WAIT_VALUE))
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1));
    }

    public DriverWait(WebDriverWait wait) {
        this.wait = wait;
    }

    public WebDriverWait getWait() {
        return wait;
    }

    public void waitPopUpLoading() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOADING_VIEW_XPATH)));
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(LOADING_VIEW_XPATH)));
        } catch (TimeoutException ex) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='dpo8-modal-ex-popup']")));
        }
    }

    public void waitLoading() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOADING_VIEW_XPATH)));
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(LOADING_VIEW_XPATH)));
        } catch (TimeoutException ex) {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(LOADING_VIEW_XPATH)));
        }
    }

    public void waitLoading(String xpath) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOADING_VIEW_XPATH)));
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(LOADING_VIEW_XPATH)));
        } catch (TimeoutException ex) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        }
    }

    public void waitLoading(WebElement element) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOADING_VIEW_XPATH)));
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(LOADING_VIEW_XPATH)));
        } catch (TimeoutException ex) {
            wait.until(ExpectedConditions.visibilityOf(element));
        }
    }

    public void waitProjectLoading() {
        WebDriverWait longWait = new WebDriverWait(DriverRepository.DRIVERS.get(), Duration.ofSeconds(15));
        try {
            longWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOADING_VIEW_XPATH)));
            longWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(LOADING_VIEW_XPATH)));
        } catch (TimeoutException ex) {
            longWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(LOADING_VIEW_XPATH)));
        }
    }

    public void longWaitLoading() {
        WebDriverWait longWait = new WebDriverWait(DriverRepository.DRIVERS.get(), Duration.ofSeconds(60));
        try {
            longWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOADING_VIEW_XPATH)));
            longWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(LOADING_VIEW_XPATH)));
        } catch (TimeoutException ex) {
            longWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(LOADING_VIEW_XPATH)));
        }
    }

    public void waitClosingTab() {
        WebDriverWait wait = (WebDriverWait) new WebDriverWait(DriverRepository.DRIVERS.get(), Duration.ofSeconds(WAIT_VALUE))
                .withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(TimeoutException.class);
        var driverUtil = new DriverUtil();
        wait.until((ExpectedCondition<Boolean>) driver ->
                driverUtil.switchToWindow(0).size() == 1);
    }

}
