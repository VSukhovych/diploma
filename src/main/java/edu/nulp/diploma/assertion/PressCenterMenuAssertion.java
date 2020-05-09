package edu.nulp.diploma.assertion;

import edu.nulp.diploma.businesslogic.menu.presscenter.NewsRubricLogic;
import edu.nulp.diploma.businesslogic.menu.presscenter.PressCenterLogic;
import edu.nulp.diploma.businesslogic.menu.presscenter.PressServiceLogic;
import org.testng.asserts.SoftAssert;

public final class PressCenterMenuAssertion {

    private static final String LINK_ERROR = "Error - link text is not correct";

    private PressCenterMenuAssertion() {
    }

    public static void pressServiceTextCheck(PressServiceLogic pressServiceLogic) {
        var softAssert = new SoftAssert();

        softAssert.assertEquals(pressServiceLogic.getPressServiceHeaderText(), "ПРЕС-СЛУЖБА", "Error - Press service header text is not correct");
        softAssert.assertEquals(pressServiceLogic.getNewsLinkText(), "Новини", "Error - News link text is not correct");
        softAssert.assertEquals(pressServiceLogic.getEventsLinkText(), "Анонси Львівської міської ради", "Error - Announcement link text is not correct");
        softAssert.assertEquals(pressServiceLogic.getPhotoLinkText(), "Фоторепортажі", "Error - Photos link text is not correct");
        softAssert.assertEquals(pressServiceLogic.getVideoLinkText(), "Відео", "Error - Video link text is not correct");
        softAssert.assertEquals(pressServiceLogic.getAnnouncementLinkText(), "Оголошення", "Error - Events link text is not correct");
        softAssert.assertEquals(pressServiceLogic.getConsultationLinkText(), "Консультації з громадськістю", "Error - Consultation link text is not correct");
        softAssert.assertEquals(pressServiceLogic.getPublicHearingsLinkText(), "Громадські слухання", "Error - Public hearings link text is not correct");

        softAssert.assertAll();
    }

    public static void newsRubricsTextCheck(NewsRubricLogic newsRubricLogic) {
        var softAssert = new SoftAssert();

        softAssert.assertEquals(newsRubricLogic.getNewsRubricHeaderText(), "РУБРИКИ НОВИН", "Error - News Rubric header text is not correct");
        softAssert.assertEquals(newsRubricLogic.getActualLinkText(), "Актуально", LINK_ERROR);
        softAssert.assertEquals(newsRubricLogic.getGovernmentLinkText(), "Влада", LINK_ERROR);
        softAssert.assertEquals(newsRubricLogic.getCityLinkText(), "Місто", LINK_ERROR);
        softAssert.assertEquals(newsRubricLogic.getOsbbLinkText(), "ОСББ", LINK_ERROR);
        softAssert.assertEquals(newsRubricLogic.getTsnapLinkText(), "ЦНАП", LINK_ERROR);
        softAssert.assertEquals(newsRubricLogic.getCityChangesLinkText(), "Львів змінюється", LINK_ERROR);
        softAssert.assertEquals(newsRubricLogic.getLandPolicyLinkText(), "Земельна політика", LINK_ERROR);
        softAssert.assertEquals(newsRubricLogic.getHousingLinkText(), "ЖКГ", LINK_ERROR);
        softAssert.assertEquals(newsRubricLogic.getMunicipalPropertyLinkText(), "Комунальна власність", LINK_ERROR);
        softAssert.assertEquals(newsRubricLogic.getTransportLinkText(), "Транспорт", LINK_ERROR);

        softAssert.assertAll();
    }

    public static void pressCenterTextCheck(PressCenterLogic pressCenterLogic) {
        var softAssert = new SoftAssert();

        softAssert.assertEquals(pressCenterLogic.getPressCenterHeaderText(), "ПРЕС-ЦЕНТР", "Error - Press center header text is not correct");
        softAssert.assertEquals(pressCenterLogic.getPressCenterLmrLinkText(), "Прес-центр ЛМР", LINK_ERROR);
        softAssert.assertEquals(pressCenterLogic.getOfficialPageLinkText(), "Офіційна сторінка Прес-служби", LINK_ERROR);
        softAssert.assertEquals(pressCenterLogic.getLvivInternationalLinkText(), "Львів міжнародний", LINK_ERROR);
        softAssert.assertEquals(pressCenterLogic.getSocietyLinkText(), "Суспільство", LINK_ERROR);
        softAssert.assertEquals(pressCenterLogic.getPolicyLinkText(), "Політика", LINK_ERROR);
        softAssert.assertEquals(pressCenterLogic.getEducationLinkText(), "Освіта", LINK_ERROR);
        softAssert.assertEquals(pressCenterLogic.getYouthPolicyLinkText(), "Молодіжна політика", LINK_ERROR);
        softAssert.assertEquals(pressCenterLogic.getEmergencyLinkText(), "Надзвичайні ситуації", LINK_ERROR);
        softAssert.assertEquals(pressCenterLogic.getCitizenCenterLinkText(), "Громадський сектор", LINK_ERROR);
        softAssert.assertEquals(pressCenterLogic.getSocialSphereLinkText(), "Соціальна сфера", LINK_ERROR);
        softAssert.assertEquals(pressCenterLogic.getReligionLinkText(), "Релігія", LINK_ERROR);
        softAssert.assertEquals(pressCenterLogic.getScienceAndHealthLinkText(), "Наука та здоров'я", LINK_ERROR);
        softAssert.assertEquals(pressCenterLogic.getScienceLinkText(), "Наука", LINK_ERROR);
        softAssert.assertEquals(pressCenterLogic.getMedicineLinkText(), "Медицина", LINK_ERROR);
        softAssert.assertEquals(pressCenterLogic.getEcologyLinkText(), "Екологія", LINK_ERROR);
        softAssert.assertEquals(pressCenterLogic.getEconomyLinkText(), "Економіка", LINK_ERROR);
        softAssert.assertEquals(pressCenterLogic.getCultureLinkText(), "Культура", LINK_ERROR);
        softAssert.assertEquals(pressCenterLogic.getArchitectureLinkText(), "Архітектура та історична спадщина", LINK_ERROR);
        softAssert.assertEquals(pressCenterLogic.getTourismLinkText(), "Туризм", LINK_ERROR);
        softAssert.assertEquals(pressCenterLogic.getSportLinkText(), "Спорт", LINK_ERROR);

        softAssert.assertAll();
    }
}
