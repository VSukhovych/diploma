package edu.nulp.diploma.businesslogic;

import edu.nulp.diploma.pageobject.menu.PressCenterMenuPage;
import io.qameta.allure.Step;

public class PressCenterMenuLogic {

    private PressCenterMenuPage pressCenterMenuPage;

    public PressCenterMenuLogic() {
        pressCenterMenuPage = new PressCenterMenuPage();
    }

    @Step("Get Press Service header text")
    public String gePressServiceHeaderText() {
        return pressCenterMenuPage.getPressHeader().getText();
    }

    @Step("Get News link text")
    public String getNewsLinkText() {
        return pressCenterMenuPage.getNewsLink().getText();
    }

    @Step("Get Announcement link text")
    public String getAnnouncementLinkText() {
        return pressCenterMenuPage.getAnnouncementLink().getText();
    }

    @Step("Get Photo link text")
    public String getPhotoLinkText() {
        return pressCenterMenuPage.getPhotosLink().getText();
    }

    @Step("Get Video link text")
    public String getVideoLinkText() {
        return pressCenterMenuPage.getVideoLink().getText();
    }

    @Step("Get Events link text")
    public String getEventsLinkText() {
        return pressCenterMenuPage.getEventsLink().getText();
    }

    @Step("Get Consultation link text")
    public String getConsultationLinkText() {
        return pressCenterMenuPage.getConsultationLink().getText();
    }

    @Step("Get Public hearings link text")
    public String getPublicHearingsLinkText() {
        return pressCenterMenuPage.getAnnouncementLink().getText();
    }
}
