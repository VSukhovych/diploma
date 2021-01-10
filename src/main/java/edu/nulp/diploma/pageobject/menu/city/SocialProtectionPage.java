package edu.nulp.diploma.pageobject.menu.city;

import edu.nulp.diploma.pageobject.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SocialProtectionPage extends BasePage {

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[text()='Соціальний захист']")
    private WebElement socialProtectionHeader;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='/lmr/komitety/komitet-z-dostupnosti-miskoho-seredovyshcha-u-mlvovi']")
    private WebElement comitetLink;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='/lmr/patronatna-simia']")
    private WebElement familyLink;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='/lmr/di-lviv']")
    private WebElement babyNeedsLink;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='https://social.lviv.ua/']")
    private WebElement lvivSocialLink;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='https://city-adm.lviv.ua/clubseniors/']")
    private WebElement socialServiceLink;

    public WebElement getSocialProtectionHeader() {
        return socialProtectionHeader;
    }

    public WebElement getComitetLink() {
        return comitetLink;
    }

    public WebElement getFamilyLink() {
        return familyLink;
    }

    public WebElement getBabyNeedsLink() {
        return babyNeedsLink;
    }

    public WebElement getLvivSocialLink() {
        return lvivSocialLink;
    }

    public WebElement getSocialServiceLink() {
        return socialServiceLink;
    }
}
