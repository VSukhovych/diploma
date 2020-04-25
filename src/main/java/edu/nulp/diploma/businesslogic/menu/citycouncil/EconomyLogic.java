package edu.nulp.diploma.businesslogic.menu.citycouncil;

import edu.nulp.diploma.pageobject.menu.citycouncil.EconomyPage;
import io.qameta.allure.Step;

public class EconomyLogic {

    private EconomyPage economyPage;

    public EconomyLogic() {
        economyPage = new EconomyPage();
    }

    @Step("Get Economy header text")
    public String getEconomyHeaderText() {
        return economyPage.getEconomyHeader().getText();
    }

    @Step("Get Support Center link text")
    public String getSupportCenterLinkText() {
        return economyPage.getSupportCenterLink().getText();
    }

    @Step("Get Business link text")
    public String getBusinessLinkText() {
        return economyPage.getBusinessLink().getText();
    }

    @Step("Get Tenders link text")
    public String getTendersLinkText() {
        return economyPage.getTendersLink().getText();
    }

    @Step("Get Procurement link text")
    public String getProcurementLinkText() {
        return economyPage.getProcurementLink().getText();
    }

    @Step("Get Procurement Analysis link text")
    public String getProcurementAnalysisLinkText() {
        return economyPage.getProcurementAnalysisLink().getText();
    }

    @Step("Get Procurement Plan link text")
    public String getProcurementPlanLinkText() {
        return economyPage.getProcurementPlanLink().getText();
    }

    @Step("Get Innovations link text")
    public String getInnovationsLinkText() {
        return economyPage.getInnovationsLink().getText();
    }

    @Step("Get For Investors link text")
    public String getForInvestorsLinkText() {
        return economyPage.getForInvestorsLink().getText();
    }

    @Step("Get Regulatory Policy link text")
    public String getRegulatoryPolicyLinkText() {
        return economyPage.getRegulatoryPolicyLink().getText();
    }

    @Step("Get Strategy link text")
    public String getStrategyLinkText() {
        return economyPage.getStrategyLink().getText();
    }

    @Step("Get Industry link text")
    public String getIndustryLinkText() {
        return economyPage.getIndustryLink().getText();
    }

    @Step("Get Foreign Advertisement link text")
    public String getForeignAdvertisementLinkText() {
        return economyPage.getForeignAdvertisementLink().getText();
    }

    @Step("Get Work link text")
    public String getWorkLinkText() {
        return economyPage.getWorkLink().getText();
    }
}
