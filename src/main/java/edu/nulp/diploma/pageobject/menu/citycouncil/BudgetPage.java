package edu.nulp.diploma.pageobject.menu.citycouncil;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BudgetPage {

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[text()='Бюджет']")
    private WebElement budgetHeader;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/public-information/budget']")
    private WebElement lvivBudgetLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='https://lviv.pb.org.ua/']")
    private WebElement citizenBudgetLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/public-information/budget/passport']")
    private WebElement passportLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/public-information/budget/biudzhetni-zapyty']")
    private WebElement budgetRequestsLink;

    public WebElement getBudgetHeader() {
        return budgetHeader;
    }

    public WebElement getLvivBudgetLink() {
        return lvivBudgetLink;
    }

    public WebElement getCitizenBudgetLink() {
        return citizenBudgetLink;
    }

    public WebElement getPassportLink() {
        return passportLink;
    }

    public WebElement getBudgetRequestsLink() {
        return budgetRequestsLink;
    }
}
