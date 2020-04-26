package edu.nulp.diploma.businesslogic.menu.cas;

import edu.nulp.diploma.pageobject.menu.cas.AdministrativeServicesPage;
import io.qameta.allure.Step;

public class AdministrativeServicesLogic {

    private AdministrativeServicesPage administrativeServicesPage;

    public AdministrativeServicesLogic() {
        administrativeServicesPage = new AdministrativeServicesPage();
    }

    @Step("Get Admin Services header text")
    public String getAdminServicesHeaderText() {
        return administrativeServicesPage.getAdminServicesHeader().getText();
    }

    @Step("Get Cas link text")
    public String getCasLinkText() {
        return administrativeServicesPage.getCasLink().getText();
    }

    @Step("Get Contacts link text")
    public String getContactsLinkText() {
        return administrativeServicesPage.getContactsLink().getText();
    }

    @Step("Get Write To Cas link text")
    public String getWriteToCasLinkText() {
        return administrativeServicesPage.getWriteToCasLink().getText();
    }

    @Step("Get Results link text")
    public String getResultsLinkText() {
        return administrativeServicesPage.getResultsLink().getText();
    }
}
