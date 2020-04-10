package edu.nulp.diploma.pageobject.menu.citycouncil;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LmrDocumentsPage {

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[text()='Документи ЛМР']")
    private WebElement documentsLmrHeader;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/lmr/docs-search']")
    private WebElement docsSearchLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/lmr/docs-decision']")
    private WebElement decisionLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/lmr/docs-orders']")
    private WebElement ordersLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/lmr/docs-rulings']")
    private WebElement docsRulingsLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/lmr/docs-decisions-by-session']")
    private WebElement docsDecisionsLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/lmr/docs-draft-decisions']")
    private WebElement docsDraftLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/lmr/doc-plenary-executive-committee']")
    private WebElement plenaryCommitteeLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/lmr/doc-minutes-of-meetings']")
    private WebElement meetingsLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/lmr/regulatory-policy/projets']")
    private WebElement projectsLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/lmr/docs-plenary']")
    private WebElement plenaryLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/lmr/docs-results-polls']")
    private WebElement docsResultsLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/lmr/docs-protocols']")
    private WebElement protocolsLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/lmr/docs-appeal']")
    private WebElement docsAppealLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/lmr/docs-meetings-of-the-public-housing-commission']")
    private WebElement commissionLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/lmr/docs-minutes-of-meetings-of-the-public-housing-commission']")
    private WebElement publicHousingCommissionLink;

    public WebElement getDocumentsLmrHeader() {
        return documentsLmrHeader;
    }

    public WebElement getDocsSearchLink() {
        return docsSearchLink;
    }

    public WebElement getDecisionLink() {
        return decisionLink;
    }

    public WebElement getOrdersLink() {
        return ordersLink;
    }

    public WebElement getDocsRulingsLink() {
        return docsRulingsLink;
    }

    public WebElement getDocsDecisionsLink() {
        return docsDecisionsLink;
    }

    public WebElement getDocsDraftLink() {
        return docsDraftLink;
    }

    public WebElement getPlenaryCommitteeLink() {
        return plenaryCommitteeLink;
    }

    public WebElement getMeetingsLink() {
        return meetingsLink;
    }

    public WebElement getProjectsLink() {
        return projectsLink;
    }

    public WebElement getPlenaryLink() {
        return plenaryLink;
    }

    public WebElement getDocsResultsLink() {
        return docsResultsLink;
    }

    public WebElement getProtocolsLink() {
        return protocolsLink;
    }

    public WebElement getDocsAppealLink() {
        return docsAppealLink;
    }

    public WebElement getCommissionLink() {
        return commissionLink;
    }

    public WebElement getPublicHousingCommissionLink() {
        return publicHousingCommissionLink;
    }
}
