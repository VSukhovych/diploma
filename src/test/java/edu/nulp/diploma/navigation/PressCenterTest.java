package edu.nulp.diploma.navigation;

import edu.nulp.diploma.BaseTest;
import edu.nulp.diploma.assertion.PressCenterMenuAssertion;
import edu.nulp.diploma.businesslogic.HomeLogic;
import edu.nulp.diploma.pageobject.NavigationPO;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class PressCenterTest extends BaseTest {

    @Story("Home page")
    @Test(description = "Test for home page header", groups = "regression")
    public void basicHomePageTest() {
        new NavigationPO().navigateToUrl("https://city-adm.lviv.ua/");
        var pressCenterMenuLogic = new HomeLogic().openPressCenterMenu();
        PressCenterMenuAssertion.pressServiceTextCheck(pressCenterMenuLogic);
    }
}
