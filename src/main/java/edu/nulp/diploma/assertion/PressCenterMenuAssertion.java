package edu.nulp.diploma.assertion;

import edu.nulp.diploma.businesslogic.PressCenterMenuLogic;
import org.testng.asserts.SoftAssert;

public final class PressCenterMenuAssertion {

    private PressCenterMenuAssertion() {
    }

    public static void pressServiceTextCheck(PressCenterMenuLogic pressCenterMenuLogic) {
        var softAssert = new SoftAssert();

        softAssert.assertEquals(pressCenterMenuLogic.gePressServiceHeaderText(), "ПРЕС-СЛУЖБА", "Error - Press service link text is not correct");
        softAssert.assertEquals(pressCenterMenuLogic.getNewsLinkText(), "Новини", "Error - News link text is not correct");
        softAssert.assertEquals(pressCenterMenuLogic.getAnnouncementLinkText(), "Анонси Львіської міської ради", "Error - Announcement link text is not correct");
        softAssert.assertEquals(pressCenterMenuLogic.getPhotoLinkText(), "Фоторепортажі", "Error - Photos link text is not correct");
        softAssert.assertEquals(pressCenterMenuLogic.getVideoLinkText(), "Відео", "Error - Video link text is not correct");
        softAssert.assertEquals(pressCenterMenuLogic.getEventsLinkText(), "Оголошення", "Error - Events link text is not correct");
        softAssert.assertEquals(pressCenterMenuLogic.getConsultationLinkText(), "Консультації з громадськістю", "Error - Consultation link text is not correct");
        softAssert.assertEquals(pressCenterMenuLogic.getPublicHearingsLinkText(), "Громадські слухання", "Error - Public hearings link text is not correct");

        softAssert.assertAll();
    }
}
