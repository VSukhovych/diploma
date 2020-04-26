package edu.nulp.diploma.businesslogic.menu.citycouncil;

import edu.nulp.diploma.pageobject.menu.citycouncil.CitizensApplicationPage;
import io.qameta.allure.Step;

public class CitizensApplicationLogic {

    private CitizensApplicationPage citizensApplicationPage;

    public CitizensApplicationLogic() {
        citizensApplicationPage = new CitizensApplicationPage();
    }

    @Step("Get Citizens Application header text")
    public String getCitizensApplicationHeaderText() {
        return citizensApplicationPage.getCitizensApplicationHeader().getText();
    }

    @Step("Get Hot Line link text")
    public String getHotLineLinkText() {
        return citizensApplicationPage.getHotLineLink().getText();
    }

    @Step("Get Application link text")
    public String getApplicationLinkText() {
        return citizensApplicationPage.getApplicationLink().getText();
    }

    @Step("Get Docs Checker link text")
    public String getDocsCheckerLinkText() {
        return citizensApplicationPage.getDocsCheckerLink().getText();
    }

    @Step("Get Online Petitions link text")
    public String getOnlinePetitionsLinkText() {
        return citizensApplicationPage.getOnlinePetitionsLink().getText();
    }
}
