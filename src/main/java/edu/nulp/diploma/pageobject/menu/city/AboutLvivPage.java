package edu.nulp.diploma.pageobject.menu.city;

import edu.nulp.diploma.pageobject.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutLvivPage extends BasePage {

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[text()='Про Львів']")
    private WebElement aboutLvivHeader;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='/lmr/regulations']")
    private WebElement regulationsLink;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='/lmr/strategy-of-lviv']")
    private WebElement strategyLink;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='https://drive.google.com/drive/folders/1Thf1aqXWGq2tmbOy9UBJ0TonKwuMUEQJ']")
    private WebElement brandBookLink;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='http://lviv.travel/']")
    private WebElement travelLink;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='/portal/history-of-lviv']")
    private WebElement lvivHistoryLink;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='https://scientist.lvivcity.gov.ua/']")
    private WebElement scientistsLink;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='/portal/catalog']")
    private WebElement catalogLink;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='http://lv.ukrstat.gov.ua/ukr/themes/99/theme_99.php']")
    private WebElement ukrStatLink;


    public WebElement getAboutLvivHeader() {
        return aboutLvivHeader;
    }

    public WebElement getRegulationsLink() {
        return regulationsLink;
    }

    public WebElement getStrategyLink() {
        return strategyLink;
    }

    public WebElement getBrandBookLink() {
        return brandBookLink;
    }

    public WebElement getTravelLink() {
        return travelLink;
    }

    public WebElement getLvivHistoryLink() {
        return lvivHistoryLink;
    }

    public WebElement getScientistsLink() {
        return scientistsLink;
    }

    public WebElement getCatalogLink() {
        return catalogLink;
    }

    public WebElement getUkrStatLink() {
        return ukrStatLink;
    }
}



