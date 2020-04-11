package edu.nulp.diploma.pageobject.menu.cas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OtherServicesPage {

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[text()='Інші послуги']")
    private WebElement otherServicesHeader;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='/services/directory-services/shvydki-posluhy']")
    private WebElement fastServiceLink;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='/services/elektronni-posluhy']")
    private WebElement eServiceLink;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='/services/pay']")
    private WebElement servicesPayLink;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='http://egov.city-adm.lviv.ua/']")
    private WebElement residentOfficeLink;


    public WebElement getOtherServicesHeader() {
        return otherServicesHeader;
    }

    public WebElement getFastServiceLink() {
        return fastServiceLink;
    }

    public WebElement geteServiceLink() {
        return eServiceLink;
    }

    public WebElement getServicesPayLink() {
        return servicesPayLink;
    }

    public WebElement getResidentOfficeLink() {
        return residentOfficeLink;
    }
}
