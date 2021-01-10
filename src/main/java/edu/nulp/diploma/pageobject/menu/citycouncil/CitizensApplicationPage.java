package edu.nulp.diploma.pageobject.menu.citycouncil;

import edu.nulp.diploma.pageobject.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CitizensApplicationPage extends BasePage {

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[text()='Звернення громадян']")
    private WebElement citizensApplicationHeader;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/services/hot-line']")
    private WebElement hotLineLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/services/application']")
    private WebElement applicationLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/services/docs-checker']")
    private WebElement docsCheckerLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='https://e-dem.in.ua/lviv']")
    private WebElement onlinePetitionsLink;

    public WebElement getCitizensApplicationHeader() {
        return citizensApplicationHeader;
    }

    public WebElement getHotLineLink() {
        return hotLineLink;
    }

    public WebElement getApplicationLink() {
        return applicationLink;
    }

    public WebElement getDocsCheckerLink() {
        return docsCheckerLink;
    }

    public WebElement getOnlinePetitionsLink() {
        return onlinePetitionsLink;
    }
}
