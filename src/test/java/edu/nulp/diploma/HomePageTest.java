package edu.nulp.diploma;

import edu.nulp.diploma.assertion.HomePageAssertion;
import edu.nulp.diploma.businesslogic.HomeLogic;
import edu.nulp.diploma.constant.LvivCityUrls;
import edu.nulp.diploma.pageobject.NavigationPO;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Story("Home page")
    @Test(description = "Test for home page header", groups = "regression")
    public void basicHomePageTest() {
        new NavigationPO().navigateToUrl(LvivCityUrls.LVIV_CITY_BASE_URL);
        var homeLogic = new HomeLogic();
        HomePageAssertion.basicCheckForHomePageHeader(homeLogic);
    }
}