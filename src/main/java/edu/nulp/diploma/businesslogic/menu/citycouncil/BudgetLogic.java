package edu.nulp.diploma.businesslogic.menu.citycouncil;

import edu.nulp.diploma.pageobject.menu.citycouncil.BudgetPage;
import io.qameta.allure.Step;

public class BudgetLogic {

    private BudgetPage budgetPage;

    public BudgetLogic() {
        budgetPage = new BudgetPage();
    }

    @Step("Get Budget header text")
    public String getBudgetHeaderText() {
        return budgetPage.getBudgetHeader().getText();
    }

    @Step("Get Lviv Budget link text")
    public String getLvivBudgetLinkText() {
        return budgetPage.getLvivBudgetLink().getText();
    }

    @Step("Get Citizen Budget link text")
    public String getCitizenBudgetLinkText() {
        return budgetPage.getCitizenBudgetLink().getText();
    }

    @Step("Get Passport link text")
    public String getPassportLinkText() {
        return budgetPage.getPassportLink().getText();
    }

    @Step("Get Budget Requests link text")
    public String getBudgetRequestsLinkText() {
        return budgetPage.getBudgetRequestsLink().getText();
    }
}
