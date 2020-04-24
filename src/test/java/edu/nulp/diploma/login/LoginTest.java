package edu.nulp.diploma.login;

import edu.nulp.diploma.pageobject.NavigationPO;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class LoginTest {

    @Story("Login")
    @Test(description = "Test for login functionality", groups = "regression")
    public void basicHomePageTest() {
        new NavigationPO().navigateToUrl("https://city-adm.lviv.ua/");
        // open login page
        // login in private cabinet
        // verify that login is successful
    }
}
