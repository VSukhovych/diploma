package edu.nulp.diploma.businesslogic.menu.city;

import edu.nulp.diploma.pageobject.menu.city.EcologyPage;
import io.qameta.allure.Step;

public class EcologyLogic {

    private EcologyPage ecologyPage;

    public EcologyLogic() {
        ecologyPage = new EcologyPage();
    }

    @Step("Get Ecology header text")
    public String getEcologyHeaderText() {
        return ecologyPage.getEcologyHeader().getText();
    }

    @Step("Get Eco Bus link text")
    public String getEcoBusLinkText() {
        return ecologyPage.getEcoBusLink().getText();
    }

    @Step("Get Ecology Situation link text")
    public String getEcologySituationLinkText() {
        return ecologyPage.getEcologySituationLink().getText();
    }

    @Step("Get Radiation Control link text")
    public String getRadiationControlLinkText() {
        return ecologyPage.getRadiationControlLink().getText();
    }

    @Step("Get Battery link text")
    public String getBatteryLinkText() {
        return ecologyPage.getBatteryLink().getText();
    }

    @Step("Get Join Gardening link text")
    public String getJoinGardeningLinkText() {
        return ecologyPage.getJoinGardeningLink().getText();
    }
}
