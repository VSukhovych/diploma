package edu.nulp.diploma.pageobject.menu.presscenter;

import edu.nulp.diploma.pageobject.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PressServicePage extends BasePage {

    @FindBy(xpath = ".//*[@href='/news']/../../../../*")
    private WebElement pressHeader;

    @FindBy(xpath = ".//*[@id='tm-panel-news']//*[@href='/news']")
    private WebElement newsLink;

    @FindBy(xpath = ".//*[@id='tm-panel-news']//*[@href='/events']")
    private WebElement eventsLink;

    @FindBy(xpath = ".//*[@id='tm-panel-news']//*[@href='/photos']")
    private WebElement photosLink;

    @FindBy(xpath = ".//*[@id='tm-panel-news']//*[@href='/video']")
    private WebElement videoLink;

    @FindBy(xpath = ".//*[@id='tm-panel-news']//*[@href='/announcement']")
    private WebElement announcementLink;

    @FindBy(xpath = ".//*[@id='tm-panel-news']//*[@href='/public-consultation']")
    private WebElement consultationLink;

    @FindBy(xpath = ".//*[@id='tm-panel-news']//*[@href='/public-hearings']")
    private WebElement publicHearingsLink;

    public WebElement getPressHeader() {
        wait.until(ExpectedConditions.visibilityOf(pressHeader));
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
