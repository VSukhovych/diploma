package edu.nulp.diploma.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PressCenterMenuPage extends BasePage {

    @FindBy(xpath = ".//*[@href='/news']")
    private WebElement newsLink;

    @FindBy(xpath = ".//*[@href='/events']")
    private WebElement eventsLink;

    @FindBy(xpath = ".//*[@href='/photos']")
    private WebElement photosLink;

    @FindBy(xpath = ".//*[@href='/video']")
    private WebElement videoLink;

    @FindBy(xpath = ".//*[@href='/announcement']")
    private WebElement announcementLink;

    @FindBy(xpath = ".//*[@href='/public-consultation']")
    private WebElement consultationLink;

    @FindBy(xpath = ".//*[@href='/public-hearings']")
    private WebElement publicHearingsLink;

}
