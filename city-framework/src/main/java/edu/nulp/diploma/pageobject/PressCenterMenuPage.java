package edu.nulp.diploma.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PressCenterMenuPage extends BasePage {

    @FindBy(xpath = ".//*[@href='/news']/../../../../*")
    private WebElement pressHeader;

    @FindBy(xpath = ".//*[alt='Логотип Львівської міської ради']/../..//*[@href='/news']")
    private WebElement newsLink;

    @FindBy(xpath = ".//*[alt='Логотип Львівської міської ради']/../..//*[@href='/events']")
    private WebElement eventsLink;

    @FindBy(xpath = ".//*[alt='Логотип Львівської міської ради']/../..//*[@href='/photos']")
    private WebElement photosLink;

    @FindBy(xpath = ".//*[alt='Логотип Львівської міської ради']/../..//*[@href='/video']")
    private WebElement videoLink;

    @FindBy(xpath = ".//*[alt='Логотип Львівської міської ради']/../..//*[@href='/announcement']")
    private WebElement announcementLink;

    @FindBy(xpath = ".//*[alt='Логотип Львівської міської ради']/../..//*[@href='/public-consultation']")
    private WebElement consultationLink;

    @FindBy(xpath = ".//*[alt='Логотип Львівської міської ради']/../..//*[@href='/public-hearings']")
    private WebElement publicHearingsLink;

    public WebElement getPressHeader() {
        return pressHeader;
    }

    public WebElement getNewsLink() {
        return newsLink;
    }

    public WebElement getEventsLink() {
        return eventsLink;
    }

    public WebElement getPhotosLink() {
        return photosLink;
    }

    public WebElement getVideoLink() {
        return videoLink;
    }

    public WebElement getAnnouncementLink() {
        return announcementLink;
    }

    public WebElement getConsultationLink() {
        return consultationLink;
    }

    public WebElement getPublicHearingsLink() {
        return publicHearingsLink;
    }
}
