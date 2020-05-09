package edu.nulp.diploma.pageobject.menu.presscenter;

import edu.nulp.diploma.pageobject.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PressCenterPage extends BasePage {

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

    @FindBy(xpath = ".//*[@href='/news/society/social-sphere']")
    private WebElement socialSphereLink;

    @FindBy(xpath = ".//*[@href='/news/society/religion']")
    private WebElement religionLink;

    @FindBy(xpath = ".//*[@href='/news/science-and-health']")
    private WebElement scienceAndHealthLink;

    @FindBy(xpath = ".//*[@href='/news/science-and-health/science']")
    private WebElement scienceLink;

    @FindBy(xpath = ".//*[@href='/news/science-and-health/medicine']")
    private WebElement medicineLink;

    @FindBy(xpath = ".//*[@href='/news/science-and-health/ecology']")
    private WebElement ecologyLink;

    @FindBy(xpath = ".//*[@href='/news/economy']")
    private WebElement economyLink;

    @FindBy(xpath = ".//*[@href='/news/culture']")
    private WebElement cultureLink;

    @FindBy(xpath = ".//*[@href='/news/culture/architecture-and-historic-heritage']")
    private WebElement architectureLink;

    @FindBy(xpath = ".//*[@href='/news/tourism']")
    private WebElement tourismLink;

    @FindBy(xpath = ".//*[@href='/news/sport']")
    private WebElement sportLink;

    public WebElement getPressCenterHeader() {
        return pressCenterHeader;
    }

    public WebElement getPressCenterLink() {
        return pressCenterLink;
    }

    public WebElement getOfficialPressServiceLink() {
        return officialPressServiceLink;
    }

    public WebElement getLvivInternationaNewslLink() {
        return lvivInternationaNewslLink;
    }

    public WebElement getSocietyNewsLink() {
        return societyNewsLink;
    }

    public WebElement getPoliticsNewsLink() {
        return politicsNewsLink;
    }

    public WebElement getEducationNewsLink() {
        return educationNewsLink;
    }

    public WebElement getYouthPolicyNewsLink() {
        return youthPolicyNewsLink;
    }

    public WebElement getEmergencyNewsLink() {
        return emergencyNewsLink;
    }

    public WebElement getPublicSectorNewsLink() {
        return PublicSectorNewsLink;
    }

    public WebElement getSocialSphereLink() {
        return socialSphereLink;
    }

    public WebElement getReligionLink() {
        return religionLink;
    }

    public WebElement getScienceAndHealthLink() {
        return scienceAndHealthLink;
    }

    public WebElement getScienceLink() {
        return scienceLink;
    }

    public WebElement getMedicineLink() {
        return medicineLink;
    }

    public WebElement getEcologyLink() {
        return ecologyLink;
    }

    public WebElement getEconomyLink() {
        return economyLink;
    }

    public WebElement getCultureLink() {
        return cultureLink;
    }

    public WebElement getArchitectureLink() {
        return architectureLink;
    }

    public WebElement getTourismLink() {
        return tourismLink;
    }

    public WebElement getSportLink() {
        return sportLink;
    }
}
