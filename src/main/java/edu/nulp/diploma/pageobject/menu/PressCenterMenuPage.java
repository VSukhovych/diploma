package edu.nulp.diploma.pageobject.menu;

import edu.nulp.diploma.pageobject.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PressCenterMenuPage extends BasePage {

    @FindBy(xpath = ".//*[@href='/news']/../../../../*")
    private WebElement pressHeader;

    @FindBy(xpath = ".//*[@alt='Логотип Львівської міської ради']/../..//*[@href='/news']")
    private WebElement newsLink;

    @FindBy(xpath = ".//*[@alt='Логотип Львівської міської ради']/../..//*[@href='/events']")
    private WebElement eventsLink;

    @FindBy(xpath = ".//*[@alt='Логотип Львівської міської ради']/../..//*[@href='/photos']")
    private WebElement photosLink;

    @FindBy(xpath = ".//*[@alt='Логотип Львівської міської ради']/../..//*[@href='/video']")
    private WebElement videoLink;

    @FindBy(xpath = ".//*[@alt='Логотип Львівської міської ради']/../..//*[@href='/announcement']")
    private WebElement announcementLink;

    @FindBy(xpath = ".//*[@alt='Логотип Львівської міської ради']/../..//*[@href='/public-consultation']")
    private WebElement consultationLink;

    @FindBy(xpath = ".//*[@alt='Логотип Львівської міської ради']/../..//*[@href='/public-hearings']")
    private WebElement publicHearingsLink;

    @FindBy(xpath = ".//*[@id='tm-panel-news']/div/div/following-sibling::div//*[@class='uk-h3']")
    private WebElement newRubricHeader;

    @FindBy(xpath = ".//*[@href='/news/actual']")
    private WebElement actualNewsLink;

    @FindBy(xpath = ".//*[@href='/news/government']")
    private WebElement governmentNewsLink;

    @FindBy(xpath = ".//*[@href='/news/city/osbb']")
    private WebElement osbbNewsLink;

    @FindBy(xpath = ".//*[@href='/news/city/tsnap']")
    private WebElement tsnapNewsLink;

    @FindBy(xpath = ".//*[@href='/news/city/lviv-changes']")
    private WebElement cityChangesNewsLink;

    @FindBy(xpath = ".//*[@href='/news/city/land-policy']")
    private WebElement landPolicyNewsLink;

    @FindBy(xpath = ".//*[@href='/news/city/housing-and-utilities']")
    private WebElement housingNewsLink;

    @FindBy(xpath = ".//*[@href='/news/city/municipal-property']")
    private WebElement municipalPropertyNewsLink;

    @FindBy(xpath = ".//*[@href='/news/city/transport']")
    private WebElement transportNewsLink;

    @FindBy(xpath = ".//*[@id='tm-panel-news']/div/following-sibling::div/div/following-sibling::div//*[@class='uk-h3']")
    private WebElement pressCenterHeader;

    @FindBy(xpath = ".//*[@id='tm-panel-news']/div/following-sibling::div/div/following-sibling::div//*[@class='/press']")
    private WebElement pressCenterLink;

    @FindBy(xpath = ".//*[@href='/lmr/office/upravlinnia-informatsiinoi-polityky-ta-zovnishnikh-vidnosyn']")
    private WebElement officialPressServiceLink;

    @FindBy(xpath = ".//*[@href='/news/city/lviv-international']")
    private WebElement lvivInternationaNewslLink;

    @FindBy(xpath = ".//*[@href='/news/society']")
    private WebElement societyNewsLink;

    @FindBy(xpath = ".//*[@href='/news/society/politics']")
    private WebElement politicsNewsLink;

    @FindBy(xpath = ".//*[@href='/news/society/education']")
    private WebElement educationNewsLink;

    @FindBy(xpath = ".//*[@href='/news/society/youth-policy']")
    private WebElement youthPolicyNewsLink;

    @FindBy(xpath = ".//*[@href='/news/society/emergency']")
    private WebElement emergencyNewsLink;

    @FindBy(xpath = ".//*[@href='/news/society/public-sector']")
    private WebElement PublicSectorNewsLink;

    @FindBy(xpath = ".//*[@href='']")
    private WebElement Link;

    @FindBy(xpath = ".//*[@href='']")
    private WebElement Link;

    @FindBy(xpath = ".//*[@href='']")
    private WebElement Link;

    @FindBy(xpath = ".//*[@href='']")
    private WebElement Link;

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
