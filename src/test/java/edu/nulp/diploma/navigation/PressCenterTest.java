package edu.nulp.diploma.navigation;

import edu.nulp.diploma.BaseTest;
import edu.nulp.diploma.pageobject.NavigationPO;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class PressCenterTest extends BaseTest {

    @Story("Login")
    @Test(description = "Test for login functionality", groups = "regression")
    public void basicHomePageTest() {
        new NavigationPO().navigateToUrl("https://city-adm.lviv.ua/");
        // open login page
        // login in private cabinet
    }
}
