package edu.nulp.diploma.pageobject.menu.city;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ArchitecturePage {

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[text()='Архітектура']")
    private WebElement architectureHeader;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='https://map.city-adm.lviv.ua/']")
    private WebElement lvivMapLink;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='/lmr/?Itemid=531']")
    private WebElement generalPlanLink;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='https://drive.google.com/drive/u/2/folders/1Rrx1L-XLe-4lv5m3iZFf6bxAVGpvoQbD']")
    private WebElement detalProjectLink;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='/lmr/map-of-urban-conditions-and-restrictions']")
    private WebElement conditionsMapLink;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='/lmr/seo-mistobudivnoi-dokumentatsii']")
    private WebElement seoDocLink;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='https://azuz.org.ua/lviv-interactive-map/?action=get_map_data&fn_status%5B%5D=26&fn_region=0&fn_builder=0']")
    private WebElement illegalBuildLink;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='/lmr/gardening-of-the-city']")
    private WebElement joinGardeningLink;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='https://mbk.city-adm.lviv.ua/ua/register_mc']")
    private WebElement registryLink;

    @FindBy(xpath = ".//*[@id='tm-panel-city']//*[@href='/lmr/plenary-town-planning-council']")
    private WebElement planningLink;

    public WebElement getArchitectureHeader() {
        return architectureHeader;
    }

    public WebElement getLvivMapLink() {
        return lvivMapLink;
    }

    public WebElement getGeneralPlanLink() {
        return generalPlanLink;
    }

    public WebElement getDetalProjectLink() {
        return detalProjectLink;
    }

    public WebElement getConditionsMapLink() {
        return conditionsMapLink;
    }

    public WebElement getSeoDocLink() {
        return seoDocLink;
    }

    public WebElement getIllegalBuildLink() {
        return illegalBuildLink;
    }

    public WebElement getJoinGardeningLink() {
        return joinGardeningLink;
    }

    public WebElement getRegistryLink() {
        return registryLink;
    }

    public WebElement getPlanningLink() {
        return planningLink;
    }
}
