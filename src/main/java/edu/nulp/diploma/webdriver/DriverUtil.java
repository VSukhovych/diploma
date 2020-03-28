package edu.nulp.diploma.webdriver;

import edu.nulp.diploma.utils.AttributesUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.Color;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static edu.nulp.diploma.webdriver.DriverRepository.getBrowserType;

public class DriverUtil {

    private static final String JS = "arguments[0].style.height='auto'; arguments[0].style.visibility='visible';";
    private RemoteWebDriver driver;

    public DriverUtil() {
        this.driver = DriverRepository.DRIVERS.get();
    }

    public DriverUtil(RemoteWebDriver driver) {
        this.driver = driver;
    }

    public void clickOnElementJS(WebElement webElement) {
        driver.executeScript("arguments[0].click();", webElement);
    }

    public void clickOnElementJS(String xpath) {
        driver.executeScript("arguments[0].click();", driver.findElement(By.xpath(xpath)));
    }

    public void doubleClickOnElementJS(WebElement webElement) {
        driver.executeScript("var evt = document.createEvent('MouseEvents');"
                + "evt.initMouseEvent('dblclick', true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0, null);"
                + "arguments[0].dispatchEvent(evt);", webElement);
    }

    public void refreshPage() {
        try {
            if (getBrowserType().equals("edge")) {
                driver.executeScript("Object.defineProperty(BeforeUnloadEvent.prototype, 'returnValue', { get:function(){}, set:function(){} });");
            }
            driver.navigate().refresh();
            new DriverAlert().accept();

        } catch (UnhandledAlertException ex) {
            driver.navigate().refresh();
        }
    }

    public void clearCookies() {
        driver.manage().deleteAllCookies();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public String getArtworkFromCurrentUrl() {
        String url = driver.getCurrentUrl();
        String constString = "artworkId=";
        return url.substring(url.indexOf(constString) + constString.length(), url.indexOf("/view"));
    }

    public List<String> switchToWindow(int windowIndex) {
        List<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(windowIndex));
        new DriverWait().waitLoading();
        return windows;
    }

    public void closeWindow(List<String> windows) {
        driver.close();
        driver.switchTo().window(windows.get(0));
    }

    public void openNewTab() {
        executeJS("window.open('_blank');");
    }

    public void closeOpenedTab() {
        List<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));
        closeWindow(windows);
    }

    public boolean isElementExisted(String xpath) {
        return !driver.findElements(By.xpath(xpath)).isEmpty();
    }

    public void switchToFrame(WebElement frame) {
        driver.switchTo().frame(frame);
    }

    public void switchToDefaultContent() {
        driver.switchTo().defaultContent();
    }

    public void uploadFileUsingJS(String pathToFile, WebElement webElement) {
        executeJavaScript(JS, webElement);
        String path = new File(pathToFile).getAbsolutePath();
        webElement.sendKeys(path);
    }

    public void executeJavaScript(String javaScript, WebElement webElement) {
        driver.executeScript(javaScript, webElement);
    }

    public Object executeJS(String javaScript) {
        return driver.executeScript(javaScript);
    }

    public String getBackgroundColorFromElement(WebElement webElement) {
        return Color.fromString(webElement.getCssValue(AttributesUtil.BACKGROUND_COLOR)).asHex();
    }

    public void navigateBack() {
        driver.navigate().back();
    }
}
