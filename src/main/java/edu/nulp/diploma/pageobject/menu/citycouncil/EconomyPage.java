package edu.nulp.diploma.pageobject.menu.citycouncil;

import edu.nulp.diploma.pageobject.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EconomyPage extends BasePage {

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[text()='Економіка']")
    private WebElement economyHeader;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/lmr/tsentr-pidtrymky-pidpryiemnytstva']")
    private WebElement supportCenterLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/lmr/business']")
    private WebElement businessLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/public-information/tenders']")
    private WebElement tendersLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/lmr/elektronni-zakupivli']")
    private WebElement eProcurementLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/lmr/analiz-zakupivel']")
    private WebElement procurementAnalysisLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/lmr/plany-zakupivel']")
    private WebElement procurementPlanLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/lmr/innovaciji']")
    private WebElement innovationsLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='http://bit.ly/30WKj16']")
    private WebElement forInvestorsLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/lmr/regulatory-policy']")
    private WebElement regulatoryPolicyLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/lmr/strategija']")
    private WebElement strategyLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/lmr/promislovist']")
    private WebElement industryLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/lmr/foreign-advertisement']")
    private WebElement foreignAdvertisementLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/lmr/work']")
    private WebElement workLink;

    public WebElement getEconomyHeader() {
        return economyHeader;
    }

    public WebElement getSupportCenterLink() {
        return supportCenterLink;
    }

    public WebElement getBusinessLink() {
        return businessLink;
    }

    public WebElement getTendersLink() {
        return tendersLink;
    }

    public WebElement getProcurementLink() {
        return eProcurementLink;
    }

    public WebElement getProcurementAnalysisLink() {
        return procurementAnalysisLink;
    }

    public WebElement getProcurementPlanLink() {
        return procurementPlanLink;
    }

    public WebElement getInnovationsLink() {
        return innovationsLink;
    }

    public WebElement getForInvestorsLink() {
        return forInvestorsLink;
    }

    public WebElement getRegulatoryPolicyLink() {
        return regulatoryPolicyLink;
    }

    public WebElement getStrategyLink() {
        return strategyLink;
    }

    public WebElement getIndustryLink() {
        return industryLink;
    }

    public WebElement getForeignAdvertisementLink() {
        return foreignAdvertisementLink;
    }

    public WebElement getWorkLink() {
        return workLink;
    }
}
