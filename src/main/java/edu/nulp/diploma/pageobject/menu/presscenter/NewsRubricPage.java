package edu.nulp.diploma.pageobject.menu.presscenter;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewsRubricPage {

    @FindBy(xpath = ".//*[@id='tm-panel-news']/div/div/following-sibling::div//*[@class='uk-h3']")
    private WebElement newRubricHeader;

    @FindBy(xpath = ".//*[@href='/news/actual']")
    private WebElement actualNewsLink;

    @FindBy(xpath = ".//*[@href='/news/government']")
    private WebElement governmentNewsLink;

    @FindBy(xpath = ".//*[@href='/news/city/osbb']")
    private WebElement osbbNewsLink;

    @FindBy(xpath = ".//*[@href='/news/city/tsnap']")
    private WebElement tsnapNewsLink;

    @FindBy(xpath = ".//*[@href='/news/city/lviv-changes']")
    private WebElement cityChangesNewsLink;

    @FindBy(xpath = ".//*[@href='/news/city/land-policy']")
    private WebElement landPolicyNewsLink;

    @FindBy(xpath = ".//*[@href='/news/city/housing-and-utilities']")
    private WebElement housingNewsLink;

    @FindBy(xpath = ".//*[@href='/news/city/municipal-property']")
    private WebElement municipalPropertyNewsLink;

    @FindBy(xpath = ".//*[@href='/news/city/transport']")
    private WebElement transportNewsLink;

    public WebElement getNewRubricHeader() {
        return newRubricHeader;
    }

    public WebElement getActualNewsLink() {
        return actualNewsLink;
    }

    public WebElement getGovernmentNewsLink() {
        return governmentNewsLink;
    }

    public WebElement getOsbbNewsLink() {
        return osbbNewsLink;
    }

    public WebElement getTsnapNewsLink() {
        return tsnapNewsLink;
    }

    public WebElement getCityChangesNewsLink() {
        return cityChangesNewsLink;
    }

    public WebElement getLandPolicyNewsLink() {
        return landPolicyNewsLink;
    }

    public WebElement getHousingNewsLink() {
        return housingNewsLink;
    }

    public WebElement getMunicipalPropertyNewsLink() {
        return municipalPropertyNewsLink;
    }

    public WebElement getTransportNewsLink() {
        return transportNewsLink;
    }
}
