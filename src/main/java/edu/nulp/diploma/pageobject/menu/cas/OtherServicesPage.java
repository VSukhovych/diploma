package edu.nulp.diploma.pageobject.menu.cas;

import edu.nulp.diploma.pageobject.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OtherServicesPage extends BasePage {

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[text()='Інші послуги']")
    private WebElement otherServicesHeader;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='/services/directory-services/shvydki-posluhy']")
    private WebElement fastServiceLink;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='/services/elektronni-posluhy']")
    private WebElement serviceLink;

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

    public WebElement getServiceLink() {
        return serviceLink;
    }

    public WebElement getServicesPayLink() {
        return servicesPayLink;
    }

    public WebElement getResidentOfficeLink() {
        return residentOfficeLink;
    }
}
