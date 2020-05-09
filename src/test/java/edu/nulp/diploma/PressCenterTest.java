package edu.nulp.diploma;

import edu.nulp.diploma.assertion.PressCenterMenuAssertion;
import edu.nulp.diploma.businesslogic.HomeLogic;
import edu.nulp.diploma.businesslogic.menu.presscenter.NewsRubricLogic;
import edu.nulp.diploma.businesslogic.menu.presscenter.PressCenterLogic;
import edu.nulp.diploma.businesslogic.menu.presscenter.PressServiceLogic;
import edu.nulp.diploma.pageobject.NavigationPO;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class PressCenterTest extends BaseTest {

    @Story("Home page")
    @Test(description = "Test for press center menu", groups = "regression")
    public void pressCenterMenuTest() {
        new NavigationPO().navigateToUrl("https://city-adm.lviv.ua/");
        new HomeLogic().openPressCenterMenu();
        PressCenterMenuAssertion.pressServiceTextCheck(new PressServiceLogic());
        PressCenterMenuAssertion.newsRubricsTextCheck(new NewsRubricLogic());
        PressCenterMenuAssertion.pressCenterTextCheck(new PressCenterLogic());
    }
}
