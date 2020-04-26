package edu.nulp.diploma.businesslogic.menu.cas;

import edu.nulp.diploma.pageobject.menu.cas.OtherServicesPage;
import io.qameta.allure.Step;

public class OtherServicesLogic {

    private OtherServicesPage otherServicesPage;

    public OtherServicesLogic() {
        otherServicesPage = new OtherServicesPage();
    }

    @Step("Get Other Services header text")
    public String getOtherServicesHeaderText() {
        return otherServicesPage.getOtherServicesHeader().getText();
    }

    @Step("Get Fast Service link text")
    public String getFastServiceLinkText() {
        return otherServicesPage.getFastServiceLink().getText();
    }

    @Step("Get Service link text")
    public String getServiceLinkText() {
        return otherServicesPage.getServiceLink().getText();
    }

    @Step("Get Services Pay link text")
    public String getServicesPayLinkText() {
        return otherServicesPage.getServicesPayLink().getText();
    }

    @Step("Get Resident Office link text")
    public String getResidentOfficeLinkText() {
        return otherServicesPage.getResidentOfficeLink().getText();
    }
}
