package edu.nulp.diploma.login;

import edu.nulp.diploma.pageobject.NavigationPO;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class LoginNegativeTest {

    @Story("Login")
    @Test(enabled = false, description = "Test for invalid login", groups = "regression")
    public void basicHomePageTest() {
        new NavigationPO().navigateToUrl("https://city-adm.lviv.ua/");
        // open login page
        // login in with invalid credentials
        // verify error message
    }
}
