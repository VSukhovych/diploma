package edu.nulp.diploma.pageobject.menu.citycouncil;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PublicInformationPage {

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[text()='Публічна інформація']")
    private WebElement publicInformationHeader;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/public-information']")
    private WebElement publicInformationLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='https://opendata.city-adm.lviv.ua/']")
    private WebElement openDataLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='https://map.city-adm.lviv.ua/']")
    private WebElement geoPortalLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='https://dashboard.city-adm.lviv.ua/']")
    private WebElement cityPanelLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/public-information/request']")
    private WebElement requestLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/lmr/servises-docs']")
    private WebElement instructionsLink;

    public WebElement getPublicInformationHeader() {
        return publicInformationHeader;
    }

    public WebElement getPublicInformationLink() {
        return publicInformationLink;
    }

    public WebElement getOpenDataLink() {
        return openDataLink;
    }

    public WebElement getGeoPortalLink() {
        return geoPortalLink;
    }

    public WebElement getCityPanelLink() {
        return cityPanelLink;
    }

    public WebElement getRequestLink() {
        return requestLink;
    }

    public WebElement getInstructionsLink() {
        return instructionsLink;
    }
}
