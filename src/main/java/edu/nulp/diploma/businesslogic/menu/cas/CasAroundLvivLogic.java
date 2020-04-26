package edu.nulp.diploma.businesslogic.menu.cas;

import edu.nulp.diploma.pageobject.menu.cas.CasAroundLvivPage;
import io.qameta.allure.Step;

public class CasAroundLvivLogic {

    private CasAroundLvivPage casAroundLvivPage;

    public CasAroundLvivLogic() {
        casAroundLvivPage = new CasAroundLvivPage();
    }

    @Step("Get Cas Around Lviv header text")
    public String getCasAroundLvivHeaderText() {
        return casAroundLvivPage.getCasAroundLvivHeader().getText();
    }

    @Step("Get Cas Rudne link text")
    public String getCasRudneLinkText() {
        return casAroundLvivPage.getCasRudneLink().getText();
    }
}
