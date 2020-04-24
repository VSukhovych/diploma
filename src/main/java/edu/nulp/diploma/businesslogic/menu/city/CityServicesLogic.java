package edu.nulp.diploma.businesslogic.menu.city;

import edu.nulp.diploma.pageobject.menu.city.CityServicesPage;
import io.qameta.allure.Step;

public class CityServicesLogic {

    private CityServicesPage cityServicesPage;

    public CityServicesLogic() {
        cityServicesPage = new CityServicesPage();
    }

    @Step("Get City Services header text")
    public String getCityServicesHeaderText() {
        return cityServicesPage.getCityServicesHeader().getText();
    }

    @Step("Get Card link text")
    public String getCardLinkText() {
        return cityServicesPage.getCardLink().getText();
    }

    @Step("Get Apartments link text")
    public String getApartmentsLinkText() {
        return cityServicesPage.getApartmentsLink().getText();
    }

    @Step("Get Pay Taxes link text")
    public String getPayTaxesLinkText() {
        return cityServicesPage.getPayTaxesLink().getText();
    }

    @Step("Get More link text")
    public String getMoreLinkText() {
        return cityServicesPage.getMoreLink().getText();
    }
}
