package edu.nulp.diploma.pageobject.menu.city;

import edu.nulp.diploma.pageobject.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CityServicesPage extends BasePage {

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[text()='Міські сервіси']")
    private WebElement cityServicesHeader;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='/services/card']")
    private WebElement cardLink;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='/lmr/apartments']")
    private WebElement apartmentsLink;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='/services/pay-taxes']")
    private WebElement payTaxesLink;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='/lmr/more']")
    private WebElement moreLink;

    public WebElement getCityServicesHeader() {
        return cityServicesHeader;
    }

    public WebElement getCardLink() {
        return cardLink;
    }

    public WebElement getApartmentsLink() {
        return apartmentsLink;
    }

    public WebElement getPayTaxesLink() {
        return payTaxesLink;
    }

    public WebElement getMoreLink() {
        return moreLink;
    }
}
