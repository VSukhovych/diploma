package edu.nulp.diploma.businesslogic.menu.city;

import edu.nulp.diploma.pageobject.menu.city.TransportPage;
import io.qameta.allure.Step;

public class TransportLogic {

    private TransportPage transportPage;

    public TransportLogic() {
        transportPage = new TransportPage();
    }

    @Step("Get Transport header text")
    public String getTransportHeaderText() {
        return transportPage.getTransportHeader().getText();
    }

    @Step("Get Transport link text")
    public String getTransportLinkText() {
        return transportPage.getTransportLink().getText();
    }

    @Step("Get Parking link text")
    public String getParkingLinkText() {
        return transportPage.getParkingLink().getText();
    }
}
