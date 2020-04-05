package edu.nulp.diploma.assertion;

import edu.nulp.diploma.businesslogic.HomeLogic;
import org.testng.asserts.SoftAssert;

public final class HomePageAssertion {

    public static void basicCheckForHomePageHeader(HomeLogic homeLogic) {
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(homeLogic.getHotLineLinkText(), "Гаряча лінія міста", "Error - Hot line link text is not correct");
        softAssert.assertEquals(homeLogic.getLiveTvLinkText(), "Трансляції", "Error - Live TV link text is not correct");
        softAssert.assertEquals(homeLogic.getLiveRadioLinkText(), "Львівське радіо", "Error - Live Radio link text is not correct");
        softAssert.assertEquals(homeLogic.getPublicInfoLinkText(), "Публічна інформація", "Error - Public information link text is not correct");

        softAssert.assertAll();
    }
}
