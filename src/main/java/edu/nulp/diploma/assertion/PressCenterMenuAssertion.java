package edu.nulp.diploma.assertion;

import edu.nulp.diploma.businesslogic.menu.presscenter.NewsRubricLogic;
import edu.nulp.diploma.businesslogic.menu.presscenter.PressServiceLogic;
import org.testng.asserts.SoftAssert;

public final class PressCenterMenuAssertion {

    private PressCenterMenuAssertion() {
    }

    public static void pressServiceTextCheck(PressServiceLogic pressServiceLogic) {
        var softAssert = new SoftAssert();

        softAssert.assertEquals(pressServiceLogic.getPressServiceHeaderText(), "ПРЕС-СЛУЖБА", "Error - Press service header text is not correct");
        softAssert.assertEquals(pressServiceLogic.getNewsLinkText(), "Новини", "Error - News link text is not correct");
        softAssert.assertEquals(pressServiceLogic.getAnnouncementLinkText(), "Анонси Львіської міської ради", "Error - Announcement link text is not correct");
        softAssert.assertEquals(pressServiceLogic.getPhotoLinkText(), "Фоторепортажі", "Error - Photos link text is not correct");
        softAssert.assertEquals(pressServiceLogic.getVideoLinkText(), "Відео", "Error - Video link text is not correct");
        softAssert.assertEquals(pressServiceLogic.getEventsLinkText(), "Оголошення", "Error - Events link text is not correct");
        softAssert.assertEquals(pressServiceLogic.getConsultationLinkText(), "Консультації з громадськістю", "Error - Consultation link text is not correct");
        softAssert.assertEquals(pressServiceLogic.getPublicHearingsLinkText(), "Громадські слухання", "Error - Public hearings link text is not correct");

        softAssert.assertAll();
    }

    public static void newsRubricsTextCheck(NewsRubricLogic newsRubricLogic) {
        var softAssert = new SoftAssert();

        softAssert.assertEquals(newsRubricLogic.getPressServiceHeaderText(), "Рубрики новин", "Error - News Rubric header text is not correct");
        softAssert.assertEquals(newsRubricLogic.getPressServiceHeaderText(), "", "Error - link text is not correct");
        softAssert.assertEquals(newsRubricLogic.getPressServiceHeaderText(), "", "Error - link text is not correct");
        softAssert.assertEquals(newsRubricLogic.getPressServiceHeaderText(), "", "Error - link text is not correct");
        softAssert.assertEquals(newsRubricLogic.getPressServiceHeaderText(), "", "Error - link text is not correct");
        softAssert.assertEquals(newsRubricLogic.getPressServiceHeaderText(), "", "Error - link text is not correct");
        softAssert.assertEquals(newsRubricLogic.getPressServiceHeaderText(), "", "Error - link text is not correct");
        softAssert.assertEquals(newsRubricLogic.getPressServiceHeaderText(), "", "Error - link text is not correct");
        softAssert.assertEquals(newsRubricLogic.getPressServiceHeaderText(), "", "Error - link text is not correct");
        softAssert.assertEquals(newsRubricLogic.getPressServiceHeaderText(), "", "Error - link text is not correct");
        softAssert.assertEquals(newsRubricLogic.getPressServiceHeaderText(), "", "Error - link text is not correct");

        softAssert.assertAll();
    }
}
