package edu.nulp.diploma.businesslogic.menu.presscenter;

import edu.nulp.diploma.pageobject.menu.presscenter.NewsRubricPage;
import io.qameta.allure.Step;

public class NewsRubricLogic {

    private NewsRubricPage newsRubricPage;

    public NewsRubricLogic() {
        newsRubricPage = new NewsRubricPage();
    }

    @Step("Get News Rubric header text")
    public String getPressServiceHeaderText() {
        return newsRubricPage.getNewRubricHeader().getText();
    }

    @Step("Get Actual News link text")
    public String getActualLinkText() {
        return newsRubricPage.getActualNewsLink().getText();
    }

    @Step("Get Government News link text")
    public String getGovernmentLinkText() {
        return newsRubricPage.getGovernmentNewsLink().getText();
    }

    @Step("Get City link text")
    public String getCityLinkText() {
        return newsRubricPage.getCityChangesNewsLink().getText();
    }

    @Step("Get OSBB News link text")
    public String getOsbbLinkText() {
        return newsRubricPage.getOsbbNewsLink().getText();
    }

    @Step("Get TsNAP News link text")
    public String getTsnapLinkText() {
        return newsRubricPage.getTsnapNewsLink().getText();
    }

    @Step("Get City Changes News link text")
    public String getCityChangesLinkText() {
        return newsRubricPage.getCityChangesNewsLink().getText();
    }

    @Step("Get Land Policy News link text")
    public String getLandPolicyLinkText() {
        return newsRubricPage.getLandPolicyNewsLink().getText();
    }

    @Step("Get Municipal Property News link text")
    public String getMunicipalPropertyLinkText() {
        return newsRubricPage.getMunicipalPropertyNewsLink().getText();
    }

    @Step("Get Housing News link text")
    public String getHousingLinkText() {
        return newsRubricPage.getHousingNewsLink().getText();
    }

    @Step("Get Transport News link text")
    public String getTransportLinkText() {
        return newsRubricPage.getTransportNewsLink().getText();
    }
}
