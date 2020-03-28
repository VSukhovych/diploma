package edu.nulp.diploma.utils;

import edu.nulp.diploma.webdriver.DriverRepository;
import io.restassured.http.Cookies;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CookieManager {

    private RemoteWebDriver driver;

    public CookieManager() {
        this.driver = DriverRepository.DRIVERS.get();
    }

    public Cookies convertCookieFromWebDriverToRest() {
        Set<Cookie> seleniumCookies = driver.manage().getCookies();

        List<io.restassured.http.Cookie> restAssuredCookies = new ArrayList<>();

        for (Cookie cookie : seleniumCookies) {
            restAssuredCookies.add(new io.restassured.http.Cookie.Builder(cookie.getName(), cookie.getValue()).build());
        }

        return new Cookies(restAssuredCookies);
    }

    public void addCookieFromRestToWebDriver(Cookies restCookies) {
        for (io.restassured.http.Cookie cookie : restCookies) {
            driver.manage().addCookie(new Cookie.Builder(cookie.getName(), cookie.getValue()).domain(".avery.com").build());
        }
    }

    public void addCookieFromRestToWebDriverCa(Cookies restCookies) {
        for (io.restassured.http.Cookie cookie : restCookies) {
            driver.manage().addCookie(new Cookie.Builder(cookie.getName(), cookie.getValue()).domain(".avery.ca").build());
        }
    }
}
