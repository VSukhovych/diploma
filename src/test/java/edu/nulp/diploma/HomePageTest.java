package edu.nulp.diploma;

import edu.nulp.diploma.assertion.HomePageAssertion;
import edu.nulp.diploma.assertion.PressCenterMenuAssertion;
import edu.nulp.diploma.businesslogic.HomeLogic;
import edu.nulp.diploma.businesslogic.menu.presscenter.NewsRubricLogic;
import edu.nulp.diploma.businesslogic.menu.presscenter.PressServiceLogic;
import edu.nulp.diploma.constant.LvivCityUrls;
import edu.nulp.diploma.pageobject.NavigationPO;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    boolean a = false;
    boolean b = true;

    @Story("Home page")
    @Test(description = "Test for home page header", groups = {"regression", "smoke"})
    public void basicHomePageTest() {
        new NavigationPO().navigateToUrl(LvivCityUrls.LVIV_CITY_BASE_URL);
        var homeLogic = new HomeLogic();
        HomePageAssertion.basicCheckForHomePageHeader(homeLogic);
    }

    @Story("Home page")
    @Test(description = "Test for press center menu", groups = "regression")
    public void pressCenterMenuTest() {
        new NavigationPO().navigateToUrl("https://city-adm.lviv.ua/");
        new HomeLogic().openPressCenterMenu();
        PressCenterMenuAssertion.pressServiceTextCheck(new PressServiceLogic());
        PressCenterMenuAssertion.newsRubricsTextCheck(new NewsRubricLogic());
//        PressCenterMenuAssertion.pressCenterTextCheck(new PressCenterLogic());
    }
}
