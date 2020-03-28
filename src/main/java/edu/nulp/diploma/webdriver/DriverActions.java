package edu.nulp.diploma.webdriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverActions {

    private Actions actions;

    public DriverActions() {
        RemoteWebDriver driver = DriverRepository.DRIVERS.get();
        this.actions = new Actions(driver);
    }

    public void moveToElementClick(WebElement webElement) {
        actions.moveToElement(webElement).click(webElement).build().perform();
    }

    public void moveToElementDoubleClick(WebElement webElement) {
        actions.moveToElement(webElement).doubleClick(webElement).build().perform();
    }

    public void moveToElement(WebElement webElement) {
        actions.moveToElement(webElement).perform();
    }
}
