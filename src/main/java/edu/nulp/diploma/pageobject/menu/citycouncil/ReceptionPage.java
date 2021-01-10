package edu.nulp.diploma.pageobject.menu.citycouncil;

import edu.nulp.diploma.pageobject.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReceptionPage extends BasePage {

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[text()='Приймальня']")
    private WebElement receptionHeader;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/directions']")
    private WebElement directionsLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/lmr/schedule-of-citizens-reception']")
    private WebElement scheduleLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/lmr/appointment']")
    private WebElement appointmentLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/services/preregistration']")
    private WebElement preregistrationLink;

    @FindBy(xpath = ".//*[@id='tm-panel-lmr']//*[@href='/lmr/social']")
    private WebElement socialLink;

    public WebElement getReceptionHeader() {
        return receptionHeader;
    }

    public WebElement getDirectionsLink() {
        return directionsLink;
    }

    public WebElement getScheduleLink() {
        return scheduleLink;
    }

    public WebElement getAppointmentLink() {
        return appointmentLink;
    }

    public WebElement getPreregistrationLink() {
        return preregistrationLink;
    }

    public WebElement getSocialLink() {
        return socialLink;
    }
}
