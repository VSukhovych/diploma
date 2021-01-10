package edu.nulp.diploma.pageobject.menu.citycouncil;

import edu.nulp.diploma.pageobject.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IntegrityPolicyPage extends BasePage {

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[text()='Політика доброчесності']")
    private WebElement integrityPolicyHeader;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/corruption-signal']")
    private WebElement corruptionSignalLink;

    public WebElement getIntegrityPolicyHeader() {
        return integrityPolicyHeader;
    }

    public WebElement getCorruptionSignalLink() {
        return corruptionSignalLink;
    }
}
