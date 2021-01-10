package edu.nulp.diploma.pageobject.menu.cas;

import edu.nulp.diploma.pageobject.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CasServicesPage extends BasePage {

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[text()='Послуги ЦНАП']")
    private WebElement casServiceHeader;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='/services/directory-services/reiestratsiini-dii']")
    private WebElement registrationActionsLink;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='/services/directory-services/zhytlo']")
    private WebElement apartmentsLink;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='/services/directory-services/arkhitektura-ta-mistobuduvannia']")
    private WebElement architectureLink;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='/services/directory-services/zemlia']")
    private WebElement landLink;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='/services/directory-services/sotsialni-posluhy']")
    private WebElement socialServicesLink;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='/services/directory-services/komunalne-maino']")
    private WebElement communalPropertyLink;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='/services/directory-services/infrastruktura']")
    private WebElement infrastructureLink;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='/services/directory-services/arkhiv']")
    private WebElement archiveLink;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='/services/directory-services/reklama-ekonomika-pratsia']")
    private WebElement advertisementLink;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='/services/directory-services/simia-i-molod']")
    private WebElement familyLink;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='/services/directory-services/dozvilni-posluhy']")
    private WebElement natureResourcesLink;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='/services/directory-services/pasport']")
    private WebElement passportLink;

    public WebElement getCasServiceHeader() {
        return casServiceHeader;
    }

    public WebElement getRegistrationActionsLink() {
        return registrationActionsLink;
    }

    public WebElement getApartmentsLink() {
        return apartmentsLink;
    }

    public WebElement getArchitectureLink() {
        return architectureLink;
    }

    public WebElement getLandLink() {
        return landLink;
    }

    public WebElement getSocialServicesLink() {
        return socialServicesLink;
    }

    public WebElement getCommunalPropertyLink() {
        return communalPropertyLink;
    }

    public WebElement getInfrastructureLink() {
        return infrastructureLink;
    }

    public WebElement getArchiveLink() {
        return archiveLink;
    }

    public WebElement getAdvertisementLink() {
        return advertisementLink;
    }

    public WebElement getFamilyLink() {
        return familyLink;
    }

    public WebElement getNatureResourcesLink() {
        return natureResourcesLink;
    }

    public WebElement getPassportLink() {
        return passportLink;
    }
}
