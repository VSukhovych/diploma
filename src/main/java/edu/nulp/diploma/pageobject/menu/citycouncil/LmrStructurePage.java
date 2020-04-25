package edu.nulp.diploma.pageobject.menu.citycouncil;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LmrStructurePage {

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[text()='Структура ЛМР']")
    private WebElement lmrStructureHeader;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/lmr/regulations-lmr']")
    private WebElement reglamentLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/lmr/profiles/andrii-sadovyi']")
    private WebElement lvivMayorLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/lmr/vice-mayor']")
    private WebElement viceMayorLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/lmr/radnyky-miskoho-holovy']")
    private WebElement mayorAdvicersLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/lmr/']")
    private WebElement lmrUnitsLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/lmr/executive-committee/view']")
    private WebElement executiveCommitteeLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/lmr/aparat-vykonkomu/view']")
    private WebElement executiveApparatusLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/lmr/departments']")
    private WebElement departmentsLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/lmr/inspection']")
    private WebElement inspectionLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/lmr/komitety']")
    private WebElement committeeLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/lmr/office']")
    private WebElement managementLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/lmr/district-administration']")
    private WebElement districtAdministrationsLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/lmr/utilities']")
    private WebElement utilitiesLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='https://www.lvivrada.gov.ua/']")
    private WebElement deputiesLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/lmr/hr']")
    private WebElement hrLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/lmr/job']")
    private WebElement jobLink;

    public WebElement getLmrStructureHeader() {
        return lmrStructureHeader;
    }

    public WebElement getReglamentLink() {
        return reglamentLink;
    }

    public WebElement getLvivMayorLink() {
        return lvivMayorLink;
    }

    public WebElement getViceMayorLink() {
        return viceMayorLink;
    }

    public WebElement getMayorAdvicersLink() {
        return mayorAdvicersLink;
    }

    public WebElement getLmrUnitsLink() {
        return lmrUnitsLink;
    }

    public WebElement getExecutiveCommitteeLink() {
        return executiveCommitteeLink;
    }

    public WebElement getExecutiveApparatusLink() {
        return executiveApparatusLink;
    }

    public WebElement getDepartmentsLink() {
        return departmentsLink;
    }

    public WebElement getInspectionLink() {
        return inspectionLink;
    }

    public WebElement getCommitteeLink() {
        return committeeLink;
    }

    public WebElement getManagementLink() {
        return managementLink;
    }

    public WebElement getDistrictAdministrationsLink() {
        return districtAdministrationsLink;
    }

    public WebElement getUtilitiesLink() {
        return utilitiesLink;
    }

    public WebElement getDeputiesLink() {
        return deputiesLink;
    }

    public WebElement getHrLink() {
        return hrLink;
    }

    public WebElement getJobLink() {
        return jobLink;
    }
}
