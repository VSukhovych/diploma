package edu.nulp.diploma.pageobject;

import edu.nulp.diploma.constant.TestConstantValues;
import edu.nulp.diploma.webdriver.DriverRepository;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected RemoteWebDriver driver;
    protected WebDriverWait wait;

    public BasePage() {
        driver = DriverRepository.DRIVERS.get();
        wait = new WebDriverWait(driver, Duration.ofSeconds(TestConstantValues.WAIT_VALUE));

        wait.until(webDriver -> driver.executeScript("return document.readyState").equals("complete"));
        if (!driver.findElements(By.id("IPEbgCover790")).isEmpty()) {
            driver.findElement(By.xpath(".//*[@name='bOff790']")).click();
        }
        PageFactory.initElements(driver, this);
    }
}
