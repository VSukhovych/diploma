package edu.nulp.diploma.businesslogic.menu.citycouncil;

import edu.nulp.diploma.pageobject.menu.citycouncil.PublicInformationPage;
import io.qameta.allure.Step;

public class PublicInformationLogic {

    private PublicInformationPage publicInformationPage;

    public PublicInformationLogic() {
        publicInformationPage = new PublicInformationPage();
    }

    @Step("Get Public Information header text")
    public String getPublicInformationHeaderText() {
        return publicInformationPage.getPublicInformationHeader().getText();
    }

    @Step("Get Public Information link text")
    public String getPublicInformationLinkText() {
        return publicInformationPage.getPublicInformationLink().getText();
    }

    @Step("Get Open Data link text")
    public String getOpenDataLinkText() {
        return publicInformationPage.getOpenDataLink().getText();
    }

    @Step("Get Geo Portal link text")
    public String getGeoPortalLinkText() {
        return publicInformationPage.getGeoPortalLink().getText();
    }

    @Step("Get City Panel link text")
    public String getCityPanelLinkText() {
        return publicInformationPage.getCityPanelLink().getText();
    }

    @Step("Get Request link text")
    public String getRequestLinkText() {
        return publicInformationPage.getRequestLink().getText();
    }

    @Step("Get Instructions link text")
    public String getInstructionsLinkText() {
        return publicInformationPage.getInstructionsLink().getText();
    }
}
