package edu.nulp.diploma.businesslogic.menu.city;

import edu.nulp.diploma.pageobject.menu.city.SocialProtectionPage;
import io.qameta.allure.Step;

public class SocialProtectionLogic {

    private SocialProtectionPage socialProtectionPage;

    public SocialProtectionLogic() {
        socialProtectionPage = new SocialProtectionPage();
    }

    @Step("Get Social Protection header text")
    public String getSocialProtectionHeaderText() {
        return socialProtectionPage.getSocialProtectionHeader().getText();
    }

    @Step("Get Comitet link text")
    public String getComitetLinkText() {
        return socialProtectionPage.getComitetLink().getText();
    }

    @Step("Get Family link text")
    public String getFamilyLinkText() {
        return socialProtectionPage.getFamilyLink().getText();
    }

    @Step("Get Baby Needs link text")
    public String getBabyNeedsLinkText() {
        return socialProtectionPage.getBabyNeedsLink().getText();
    }

    @Step("Get Lviv Social link text")
    public String getLvivSocialLinkText() {
        return socialProtectionPage.getLvivSocialLink().getText();
    }

    @Step("Get Social Service link text")
    public String getSocialServiceLinkText() {
        return socialProtectionPage.getSocialServiceLink().getText();
    }
}
