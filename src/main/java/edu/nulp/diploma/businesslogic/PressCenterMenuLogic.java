package edu.nulp.diploma.businesslogic;

import edu.nulp.diploma.pageobject.menu.presscenter.PressCenterPage;
import io.qameta.allure.Step;

public class PressCenterMenuLogic {

    private PressCenterPage pressCenterPage;

    public PressCenterMenuLogic() {
        pressCenterPage = new PressCenterPage();
    }

    @Step("Get Press Service header text")
    public String gePressServiceHeaderText() {
        return pressCenterPage.getPressHeader().getText();
    }

    @Step("Get News link text")
    public String getNewsLinkText() {
        return pressCenterPage.getNewsLink().getText();
    }

    @Step("Get Announcement link text")
    public String getAnnouncementLinkText() {
        return pressCenterPage.getAnnouncementLink().getText();
    }

    @Step("Get Photo link text")
    public String getPhotoLinkText() {
        return pressCenterPage.getPhotosLink().getText();
    }

    @Step("Get Video link text")
    public String getVideoLinkText() {
        return pressCenterPage.getVideoLink().getText();
    }

    @Step("Get Events link text")
    public String getEventsLinkText() {
        return pressCenterPage.getEventsLink().getText();
    }

    @Step("Get Consultation link text")
    public String getConsultationLinkText() {
        return pressCenterPage.getConsultationLink().getText();
    }

    @Step("Get Public hearings link text")
    public String getPublicHearingsLinkText() {
        return pressCenterPage.getAnnouncementLink().getText();
    }
}
