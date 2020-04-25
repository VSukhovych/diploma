package edu.nulp.diploma.businesslogic.menu.citycouncil;

import edu.nulp.diploma.pageobject.menu.citycouncil.IntegrityPolicyPage;
import io.qameta.allure.Step;

public class IntegrityPolicyLogic {

    private IntegrityPolicyPage integrityPolicyPage;

    public IntegrityPolicyLogic() {
        integrityPolicyPage = new IntegrityPolicyPage();
    }

    @Step("Get Integrity Policy header text")
    public String getIntegrityPolicyHeaderText() {
        return integrityPolicyPage.getIntegrityPolicyHeader().getText();
    }

    @Step("Get Corruption Signal link text")
    public String getLinkText() {
        return integrityPolicyPage.getCorruptionSignalLink().getText();
    }
}
