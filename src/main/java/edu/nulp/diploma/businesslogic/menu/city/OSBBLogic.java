package edu.nulp.diploma.businesslogic.menu.city;

import edu.nulp.diploma.pageobject.menu.city.OSBBPage;
import io.qameta.allure.Step;

public class OSBBLogic {

    private OSBBPage osbbPage;

    public OSBBLogic() {
        osbbPage = new OSBBPage();
    }

    @Step("Get Osbb header text")
    public String getOsbbHeaderText() {
        return osbbPage.getOsbbHeader().getText();
    }

    @Step("Get Osbb link text")
    public String getOsbbLinkText() {
        return osbbPage.getOsbbLink().getText();
    }

    @Step("Get Property link text")
    public String getPropertyLinkText() {
        return osbbPage.getPropertyLink().getText();
    }
}
