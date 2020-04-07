package edu.nulp.diploma.pageobject.menu.city;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OSSBPage {

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[text()='ОСББ та майно']")
    private WebElement ossbHeader;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='/portal/osbb']")
    private WebElement osbbLink;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='/public-information/offices/upravlinnia-komunalnoi-vlasnosti/nerukhome-maino']")
    private WebElement propertyLink;

    public WebElement getOssbHeader() {
        return ossbHeader;
    }

    public WebElement getOsbbLink() {
        return osbbLink;
    }

    public WebElement getPropertyLink() {
        return propertyLink;
    }
}
