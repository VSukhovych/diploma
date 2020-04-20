package edu.nulp.diploma.businesslogic.menu.city;

import edu.nulp.diploma.pageobject.menu.city.AboutLvivPage;
import io.qameta.allure.Step;

public class AboutLvivLogic {

    private AboutLvivPage aboutLvivPage;

    public AboutLvivLogic() {
        aboutLvivPage = new AboutLvivPage();
    }

    @Step("Get About Lviv header text")
    public String getAboutLvivHeaderText() {
        return aboutLvivPage.getAboutLvivHeader().getText();
    }

    @Step("Get Statut link text")
    public String getStatutLinkText() {
        return aboutLvivPage.getUkrStatLink().getText();
    }

    @Step("Get Strategy link text")
    public String getStrategyLinkText() {
        return aboutLvivPage.getStrategyLink().getText();
    }

    @Step("Get  link text")
    public String getLinkText() {
        return aboutLvivPage.getText();
    }

    @Step("Get  link text")
    public String getLinkText() {
        return aboutLvivPage.getText();
    }

    @Step("Get  link text")
    public String getLinkText() {
        return aboutLvivPage.getText();
    }

    @Step("Get  link text")
    public String getLinkText() {
        return aboutLvivPage.getText();
    }

    @Step("Get  link text")
    public String getLinkText() {
        return aboutLvivPage.getText();
    }

    @Step("Get  link text")
    public String getLinkText() {
        return aboutLvivPage.getText();
    }
}
