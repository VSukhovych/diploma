package edu.nulp.diploma.businesslogic.menu.cas;

import edu.nulp.diploma.pageobject.menu.cas.CasServicesPage;
import io.qameta.allure.Step;

public class CasServicesLogic {

    private CasServicesPage casServicesPage;

    public CasServicesLogic() {
        casServicesPage = new CasServicesPage();
    }

    @Step("Get Cas Services header text")
    public String getCasServiceHeaderText() {
        return casServicesPage.getCasServiceHeader().getText();
    }

    @Step("Get Registration Actions link text")
    public String getRegistrationActionsLinkText() {
        return casServicesPage.getRegistrationActionsLink().getText();
    }

    @Step("Get Apartments link text")
    public String getApartmentsLinkText() {
        return casServicesPage.getApartmentsLink().getText();
    }

    @Step("Get Architecture link text")
    public String getArchitectureLinkText() {
        return casServicesPage.getArchitectureLink().getText();
    }

    @Step("Get Land link text")
    public String getLandLinkText() {
        return casServicesPage.getLandLink().getText();
    }

    @Step("Get Social Services link text")
    public String getSocialServicesLinkText() {
        return casServicesPage.getSocialServicesLink().getText();
    }

    @Step("Get Communal Property link text")
    public String getCommunalPropertyLinkText() {
        return casServicesPage.getCommunalPropertyLink().getText();
    }

    @Step("Get Infrastructure link text")
    public String getInfrastructureLinkText() {
        return casServicesPage.getInfrastructureLink().getText();
    }

    @Step("Get Archive link text")
    public String getArchiveLinkText() {
        return casServicesPage.getArchiveLink().getText();
    }

    @Step("Get Advertisement link text")
    public String getAdvertisementLinkText() {
        return casServicesPage.getAdvertisementLink().getText();
    }

    @Step("Get Family link text")
    public String getFamilyLinkText() {
        return casServicesPage.getFamilyLink().getText();
    }

    @Step("Get Nature Resources link text")
    public String getNatureResourcesLinkText() {
        return casServicesPage.getNatureResourcesLink().getText();
    }

    @Step("Get Passport link text")
    public String getPassportLinkText() {
        return casServicesPage.getPassportLink().getText();
    }
}
