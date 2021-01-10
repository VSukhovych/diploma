package edu.nulp.diploma.pageobject.menu.city;

import edu.nulp.diploma.pageobject.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TransportPage extends BasePage {

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[text()='Транспорт']")
    private WebElement transportHeader;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='/portal/transport']")
    private WebElement transportLink;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='http://inspector.lviv.ua/']")
    private WebElement parkingLink;

    public WebElement getTransportHeader() {
        return transportHeader;
    }

    public WebElement getTransportLink() {
        return transportLink;
    }

    public WebElement getParkingLink() {
        return parkingLink;
    }
}
