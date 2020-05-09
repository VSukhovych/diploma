package edu.nulp.diploma.webdriver;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static edu.nulp.diploma.constant.TestConstantValues.WAIT_VALUE;

public class DriverWait {

    private WebDriverWait wait;

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
}
