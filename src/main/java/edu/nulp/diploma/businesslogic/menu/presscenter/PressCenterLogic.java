package edu.nulp.diploma.businesslogic.menu.presscenter;

import edu.nulp.diploma.pageobject.menu.presscenter.PressCenterPage;
import io.qameta.allure.Step;

public class PressCenterLogic {

    private PressCenterPage pressCenterPage;

    public PressCenterLogic() {
        pressCenterPage = new PressCenterPage();
    }

    @Step("Get Press Center header text")
    public String getPressCenterHeaderText() {
        return pressCenterPage.getPressCenterHeader().getText();
    }

    @Step("Get Press center lmr link text")
    public String getPressCenterLmrLinkText() {
        return pressCenterPage.getPressCenterLink().getText();
    }

    @Step("Get Official page link text")
    public String getOfficialPageLinkText() {
        return pressCenterPage.getOfficialPressServiceLink().getText();
    }

    @Step("Get Lviv international link text")
    public String getLvivInternationalLinkText() {
        return pressCenterPage.getLvivInternationaNewslLink().getText();
    }

    @Step("Get Cociety link text")
    public String getSocietyLinkText() {
        return pressCenterPage.getSocietyNewsLink().getText();
    }

    @Step("Get Policy link text")
    public String getPolicyLinkText() {
        return pressCenterPage.getPoliticsNewsLink().getText();
    }

    @Step("Get Education link text")
    public String getEducationLinkText() {
        return pressCenterPage.getEducationNewsLink().getText();
    }

    @Step("Get Youth policy link text")
    public String getYouthPolicyLinkText() {
        return pressCenterPage.getYouthPolicyNewsLink().getText();
    }

    @Step("Get Emergency link text")
    public String getEmergencyLinkText() {
        return pressCenterPage.getEmergencyNewsLink().getText();
    }

    @Step("Get Citizen center link text")
    public String getCitizenCenterLinkText() {
        return pressCenterPage.getPublicSectorNewsLink().getText();
    }

    @Step("Get Social sphere link text")
    public String getSocialSphereLinkText() {
        return pressCenterPage.getSocialSphereLink().getText();
    }

    @Step("Get Religion link text")
    public String getReligionLinkText() {
        return pressCenterPage.getReligionLink().getText();
    }

    @Step("Get Science and health link text")
    public String getScienceAndHealthLinkText() {
        return pressCenterPage.getScienceAndHealthLink().getText();
    }

    @Step("Get Science link text")
    public String getScienceLinkText() {
        return pressCenterPage.getScienceLink().getText();
    }

    @Step("Get Medicine link text")
    public String getMedicineLinkText() {
        return pressCenterPage.getMedicineLink().getText();
    }

    @Step("Get Ecology link text")
    public String getEcologyLinkText() {
        return pressCenterPage.getEcologyLink().getText();
    }

    @Step("Get Economy link text")
    public String getEconomyLinkText() {
        return pressCenterPage.getEconomyLink().getText();
    }

    @Step("Get Culture link text")
    public String getCultureLinkText() {
        return pressCenterPage.getCultureLink().getText();
    }

    @Step("Get Architecture link text")
    public String getArchitectureLinkText() {
        return pressCenterPage.getArchitectureLink().getText();
    }

    @Step("Get Tourism link text")
    public String getTourismLinkText() {
        return pressCenterPage.getTourismLink().getText();
    }

    @Step("Get Sport link text")
    public String getSportLinkText() {
        return pressCenterPage.getSportLink().getText();
    }
}
