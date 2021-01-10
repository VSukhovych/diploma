package edu.nulp.diploma.pageobject.menu.cas;

import edu.nulp.diploma.pageobject.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdministrativeServicesPage extends BasePage {

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[text()='Адміністративні послуги']")
    private WebElement adminServicesHeader;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='/services/']")
    private WebElement casLink;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='/services/contacts']")
    private WebElement contactsLink;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='/services/zapys-do-tsnap']")
    private WebElement writeToCasLink;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='/services/results']")
    private WebElement resultsLink;

    public WebElement getAdminServicesHeader() {
        return adminServicesHeader;
    }

    public WebElement getCasLink() {
        return casLink;
    }

    public WebElement getContactsLink() {
        return contactsLink;
    }

    public WebElement getWriteToCasLink() {
        return writeToCasLink;
    }

    public WebElement getResultsLink() {
        return resultsLink;
    }
}
