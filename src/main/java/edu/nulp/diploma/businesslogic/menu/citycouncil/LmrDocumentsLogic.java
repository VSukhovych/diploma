package edu.nulp.diploma.businesslogic.menu.citycouncil;

import edu.nulp.diploma.pageobject.menu.citycouncil.LmrDocumentsPage;
import io.qameta.allure.Step;

public class LmrDocumentsLogic {

    private LmrDocumentsPage lmrDocumentsPage;

    public LmrDocumentsLogic() {
        lmrDocumentsPage = new LmrDocumentsPage();
    }

    @Step("Get Documents Lmr header text")
    public String getDocumentsLmrHeaderText() {
        return lmrDocumentsPage.getDocumentsLmrHeader().getText();
    }

    @Step("Get Docs Search link text")
    public String getDocsSearchLinkText() {
        return lmrDocumentsPage.getDocsSearchLink().getText();
    }

    @Step("Get Decisions link text")
    public String getDecisionsLinkText() {
        return lmrDocumentsPage.getDecisionLink().getText();
    }

    @Step("Get Orders link text")
    public String getOrdersLinkText() {
        return lmrDocumentsPage.getOrdersLink().getText();
    }

    @Step("Get Docs Rulings link text")
    public String getDocsRulingsLinkText() {
        return lmrDocumentsPage.getDocsRulingsLink().getText();
    }

    @Step("Get Decision link text")
    public String getDecisionLinkText() {
        return lmrDocumentsPage.getDecisionLink().getText();
    }

    @Step("Get Docs Draft link text")
    public String getDocsDraftLinkText() {
        return lmrDocumentsPage.getDocsDraftLink().getText();
    }

    @Step("Get Plenary Committee link text")
    public String getPlenaryCommitteeLinkText() {
        return lmrDocumentsPage.getPlenaryCommitteeLink().getText();
    }

    @Step("Get Meetings link text")
    public String getMeetingsLinkText() {
        return lmrDocumentsPage.getMeetingsLink().getText();
    }

    @Step("Get Projects link text")
    public String getProjectsLinkText() {
        return lmrDocumentsPage.getProjectsLink().getText();
    }

    @Step("Get Plenary link text")
    public String getPlenaryLinkText() {
        return lmrDocumentsPage.getPlenaryLink().getText();
    }

    @Step("Get Docs Results link text")
    public String getDocsResultsLinkText() {
        return lmrDocumentsPage.getDocsResultsLink().getText();
    }

    @Step("Get Protocols link text")
    public String getProtocolsLinkText() {
        return lmrDocumentsPage.getProtocolsLink().getText();
    }

    @Step("Get Docs Appeal link text")
    public String getDocsAppealLinkText() {
        return lmrDocumentsPage.getDocsAppealLink().getText();
    }

    @Step("Get Commission link text")
    public String getCommissionLinkText() {
        return lmrDocumentsPage.getCommissionLink().getText();
    }

    @Step("Get Public Housing Commission link text")
    public String getPublicHousingCommissionLinkText() {
        return lmrDocumentsPage.getPublicHousingCommissionLink().getText();
    }
}
