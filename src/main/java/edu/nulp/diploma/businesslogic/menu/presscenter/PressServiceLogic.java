package edu.nulp.diploma.businesslogic.menu.presscenter;

import edu.nulp.diploma.pageobject.menu.presscenter.PressServicePage;
import io.qameta.allure.Step;

public class PressServiceLogic {

    private PressServicePage pressServicePage;

    public PressServiceLogic() {
        pressServicePage = new PressServicePage();
    }

    @Step("Get Press Service header text")
    public String getPressServiceHeaderText() {
        return pressServicePage.getPressHeader().getText();
    }

    @Step("Get News link text")
    public String getNewsLinkText() {
        return pressServicePage.getNewsLink().getText();
    }

    @Step("Get Announcement link text")
    public String getAnnouncementLinkText() {
        return pressServicePage.getAnnouncementLink().getText();
    }

    @Step("Get Photo link text")
    public String getPhotoLinkText() {
        return pressServicePage.getPhotosLink().getText();
    }

    @Step("Get Video link text")
    public String getVideoLinkText() {
        return pressServicePage.getVideoLink().getText();
    }

    @Step("Get Events link text")
    public String getEventsLinkText() {
        return pressServicePage.getEventsLink().getText();
    }

    @Step("Get Consultation link text")
    public String getConsultationLinkText() {
        return pressServicePage.getConsultationLink().getText();
    }

    @Step("Get Public hearings link text")
    public String getPublicHearingsLinkText() {
        return pressServicePage.getPublicHearingsLink().getText();
    }
}
