package edu.nulp.diploma.webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static edu.nulp.diploma.constant.TestConstantValues.WAIT_VALUE;

public class DriverAlert {

    private RemoteWebDriver driver;

    public DriverAlert() {
        this.driver = DriverRepository.DRIVERS.get();
    }

    public String accept() {
        String text = "";
        if (isAlertPresent()) {
            new WebDriverWait(driver, Duration.ofSeconds(WAIT_VALUE)).until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            text = alert.getText();
            alert.accept();
        }
        return text;
    }

    public void dismiss() {
        if (isAlertPresent()) {
            new WebDriverWait(driver, Duration.ofSeconds(WAIT_VALUE)).until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            alert.getText();
            alert.dismiss();
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException ex) {
            return false;
        }
    }
}
