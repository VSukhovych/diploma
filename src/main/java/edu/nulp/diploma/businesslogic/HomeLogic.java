package edu.nulp.diploma.businesslogic;

import edu.nulp.diploma.businesslogic.menu.presscenter.PressServiceLogic;
import edu.nulp.diploma.pageobject.HomePage;
import io.qameta.allure.Step;

public class HomeLogic {

    private HomePage homePage;

    public HomeLogic() {
        homePage = new HomePage();
    }

    @Step("Get Hot Line link text")
    public String getHotLineLinkText() {
        return homePage.getHotLineLink().getText();
    }

    @Step("Get Live TV link text")
    public String getLiveTvLinkText() {
        return homePage.getLiveTvLink().getText();
    }

    @Step("Get Live Radio link text")
    public String getLiveRadioLinkText() {
        return homePage.getLiveRadioLink().getText();
    }

    @Step("Get Public information link text")
    public String getPublicInfoLinkText() {
        return homePage.getPublicInformationLink().getText();
    }

    @Step("Open Press center menu")
    public PressServiceLogic openPressCenterMenu() {
        homePage.getPressCenterMenuButton().click();
        return new PressServiceLogic();
    }
}
