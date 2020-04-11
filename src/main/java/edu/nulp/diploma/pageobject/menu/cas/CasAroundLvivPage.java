package edu.nulp.diploma.pageobject.menu.cas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CasAroundLvivPage {

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[text()='ЦНАП довкола Львова']")
    private WebElement casAroundLvivHeader;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='/services/directory-services-smt-rudne']")
    private WebElement casRudneLink;
}
