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

    @Step("Get Brand Book link text")
    public String getBrandBookLinkText() {
        return aboutLvivPage.getBrandBookLink().getText();
    }

    @Step("Get Tourism link text")
    public String getTourismLinkText() {
        return aboutLvivPage.getTravelLink().getText();
    }

    @Step("Get History link text")
    public String getHistoryLinkText() {
        return aboutLvivPage.getLvivHistoryLink().getText();
    }

    @Step("Get Researchers link text")
    public String getResearchersLinkText() {
        return aboutLvivPage.getScientistsLink().getText();
    }

    @Step("Get Lviv Catalog link text")
    public String getLvivCatalogLinkText() {
        return aboutLvivPage.getCatalogLink().getText();
    }

    @Step("Get Statistic link text")
    public String getStatisticLinkText() {
        return aboutLvivPage.getUkrStatLink().getText();
    }
}
