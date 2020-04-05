package edu.nulp.diploma.constant;

public final class LvivCityUrls {

    public static final String LVIV_CITY_BASE_URL = "https://" + getLvivCityBaseUrl() + "/";

    private LvivCityUrls() {
    }

    private static String getLvivCityBaseUrl() {
        return "city-adm.lviv.ua";
    }

}
