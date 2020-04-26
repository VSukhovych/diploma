package edu.nulp.diploma.businesslogic.menu.city;

import edu.nulp.diploma.pageobject.menu.city.ArchitecturePage;
import io.qameta.allure.Step;

public class ArchitectureLogic {

    private ArchitecturePage architecturePage;

    public ArchitectureLogic() {
        architecturePage = new ArchitecturePage();
    }

    @Step("Get Architecture header text")
    public String getArchitectureHeaderText() {
        return architecturePage.getArchitectureHeader().getText();
    }

    @Step("Get Lviv Map link text")
    public String getLvivMapLinkText() {
        return architecturePage.getLvivMapLink().getText();
    }

    @Step("Get General Plan link text")
    public String getGeneralPlanLinkText() {
        return architecturePage.getGeneralPlanLink().getText();
    }

    @Step("Get Detal Project link text")
    public String getDetalProjectLinkText() {
        return architecturePage.getDetalProjectLink().getText();
    }

    @Step("Get Conditions Map link text")
    public String getConditionsMapLinkText() {
        return architecturePage.getConditionsMapLink().getText();
    }

    @Step("Get Seo Doc link text")
    public String getSeoDocLinkText() {
        return architecturePage.getSeoDocLink().getText();
    }

    @Step("Get Illegal Build link text")
    public String getIllegalBuildLinkText() {
        return architecturePage.getIllegalBuildLink().getText();
    }

    @Step("Get JoinGardening link text")
    public String getJoinGardeningLinkText() {
        return architecturePage.getJoinGardeningLink().getText();
    }

    @Step("Get Registry link text")
    public String getRegistryLinkText() {
        return architecturePage.getRegistryLink().getText();
    }

    @Step("Get Planning link text")
    public String getPlanningLinkText() {
        return architecturePage.getPlanningLink().getText();
    }
}
