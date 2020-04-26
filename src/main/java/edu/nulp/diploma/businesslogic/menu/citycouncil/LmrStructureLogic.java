package edu.nulp.diploma.businesslogic.menu.citycouncil;

import edu.nulp.diploma.pageobject.menu.citycouncil.LmrStructurePage;
import io.qameta.allure.Step;

public class LmrStructureLogic {

    private LmrStructurePage lmrStructurePage;

    public LmrStructureLogic() {
        lmrStructurePage = new LmrStructurePage();
    }

    @Step("Get Lmr Structure header text")
    public String getLmrStructureHeaderText() {
        return lmrStructurePage.getLmrStructureHeader().getText();
    }

    @Step("Get Reglament link text")
    public String getReglamentLinkText() {
        return lmrStructurePage.getReglamentLink().getText();
    }

    @Step("Get Lviv Mayor link text")
    public String getLvivMayorLinkText() {
        return lmrStructurePage.getLvivMayorLink().getText();
    }

    @Step("Get Vice Mayor link text")
    public String getViceMayorLinkText() {
        return lmrStructurePage.getViceMayorLink().getText();
    }

    @Step("Get Mayor Advicers link text")
    public String getMayorAdvicersLinkText() {
        return lmrStructurePage.getMayorAdvicersLink().getText();
    }

    @Step("Get Lmr Units link text")
    public String getLmrUnitsLinkText() {
        return lmrStructurePage.getLmrUnitsLink().getText();
    }

    @Step("Get Executive Committee link text")
    public String getExecutiveCommitteeLinkText() {
        return lmrStructurePage.getExecutiveCommitteeLink().getText();
    }

    @Step("Get Departments link text")
    public String getDepartmentsLinkText() {
        return lmrStructurePage.getDepartmentsLink().getText();
    }

    @Step("Get Inspection link text")
    public String getInspectionLinkText() {
        return lmrStructurePage.getInspectionLink().getText();
    }

    @Step("Get Committee link text")
    public String getCommitteeLinkText() {
        return lmrStructurePage.getCommitteeLink().getText();
    }

    @Step("Get Management link text")
    public String getManagementLinkText() {
        return lmrStructurePage.getManagementLink().getText();
    }

    @Step("Get District Administrations link text")
    public String getDistrictAdministrationsLinkText() {
        return lmrStructurePage.getDistrictAdministrationsLink().getText();
    }

    @Step("Get Utilities link text")
    public String getUtilitiesLinkText() {
        return lmrStructurePage.getUtilitiesLink().getText();
    }

    @Step("Get Deputies link text")
    public String getDeputiesLinkText() {
        return lmrStructurePage.getDeputiesLink().getText();
    }

    @Step("Get Hr link text")
    public String getHrLinkText() {
        return lmrStructurePage.getHrLink().getText();
    }

    @Step("Get Job link text")
    public String getJobLinkText() {
        return lmrStructurePage.getJobLink().getText();
    }
}
