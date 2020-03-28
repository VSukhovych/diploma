package edu.nulp.diploma.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    @FindBy(id = "tm-hotline-link")
    public WebElement hotLineLink;

    @FindBy(className = "tm-live-tv")
    public WebElement liveTvLink;

    @FindBy(className = "tm-live-radio")
    public WebElement liveRadioLink;

    @FindBy(xpath = ".//*[@href='/public-information']")
    public WebElement publicInformationLink;

    public HomePage() {
        wait.until(ExpectedConditions.visibilityOf(hotLineLink));
    }

    public WebElement getHotLineLink() {
        return hotLineLink;
    }

    public WebElement getLiveTvLink() {
        return liveTvLink;
    }

    public WebElement getLiveRadioLink() {
        return liveRadioLink;
    }

    public WebElement getPublicInformationLink() {
        return publicInformationLink;
    }
}
