package edu.nulp.diploma.pageobject.menu.city;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EcologyPage {

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[text()='Екологія']")
    private WebElement ecologyHeader;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='/lmr/eko-bus']")
    private WebElement ecoBusLink;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='/lmr/ecology']")
    private WebElement ecologySituationLink;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='https://meteo.gov.ua/ua/33136/racpc/racpc_month_review/']")
    private WebElement radiationControlLink;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='/public-information/offices/upravlinnia-ekolohii-ta-blahoustroiu/790/download?cf_id=36']")
    private WebElement baterryLink;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='/lmr/gardening-of-the-city']")
    private WebElement joinGardeningLink;

    public WebElement getEcologyHeader() {
        return ecologyHeader;
    }

    public WebElement getEcoBusLink() {
        return ecoBusLink;
    }

    public WebElement getEcologySituationLink() {
        return ecologySituationLink;
    }

    public WebElement getRadiationControlLink() {
        return radiationControlLink;
    }

    public WebElement getBatteryLink() {
        return baterryLink;
    }

    public WebElement getJoinGardeningLink() {
        return joinGardeningLink;
    }
}
