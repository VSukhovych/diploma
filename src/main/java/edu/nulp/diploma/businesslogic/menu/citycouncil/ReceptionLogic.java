package edu.nulp.diploma.businesslogic.menu.citycouncil;

import edu.nulp.diploma.pageobject.menu.citycouncil.ReceptionPage;
import io.qameta.allure.Step;

public class ReceptionLogic {

    private ReceptionPage receptionPage;

    public ReceptionLogic() {
        receptionPage = new ReceptionPage();
    }

    @Step("Get Reception header text")
    public String getReceptionHeaderText() {
        return receptionPage.getReceptionHeader().getText();
    }

    @Step("Get Directions link text")
    public String getDirectionsLinkText() {
        return receptionPage.getDirectionsLink().getText();
    }

    @Step("Get Schedule link text")
    public String getScheduleLinkText() {
        return receptionPage.getScheduleLink().getText();
    }

    @Step("Get Appointment link text")
    public String getAppointmentLinkText() {
        return receptionPage.getAppointmentLink().getText();
    }

    @Step("Get Preregistration link text")
    public String getPreregistrationLinkText() {
        return receptionPage.getPreregistrationLink().getText();
    }

    @Step("Get Social link text")
    public String getSocialLinkText() {
        return receptionPage.getSocialLink().getText();
    }
}
