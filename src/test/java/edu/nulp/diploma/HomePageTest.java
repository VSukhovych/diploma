package edu.nulp.diploma;

import edu.nulp.diploma.assertion.HomePageAssertion;
import edu.nulp.diploma.businesslogic.HomeLogic;
import edu.nulp.diploma.pageobject.NavigationPO;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Story("Home page")
    @Test(description = "Test for home page header", groups = {"regression", "smoke"})
    public void basicHomePageTest() {
        new NavigationPO().navigateToUrl("https://city-adm.lviv.ua/");
        var homeLogic = new HomeLogic();
        HomePageAssertion.basicCheckForHomePageHeader(homeLogic);
    }
}
