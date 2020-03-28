package edu.nulp.diploma.utils;

import edu.nulp.diploma.constant.EndpointConstants;
import io.qameta.allure.Step;

public class ConfigUtil {

    private static final String STORAGE = "storage=fsUSP";
    private static final String STG_STORAGE = STORAGE + "reP";

    @Step("Get anonymous storage link")
    public String getAnonymousStorageLink(String currentUrl) {
        String decodedUrl = UrlUtil.decodeValue(currentUrl);
        String anonymousStorage;
        String storage;
        switch (EndpointConstants.getEnvName()) {
            case "test":
                anonymousStorage = "https://contenttest.ec2.avery.com/WorkingDir/temp/";
                break;
            case "staging":
                try {
                    storage = decodedUrl.substring(decodedUrl.indexOf(STG_STORAGE) + 16, decodedUrl.indexOf(";path"));
                } catch (StringIndexOutOfBoundsException ex) {
                    try {
                        storage = decodedUrl.substring(decodedUrl.indexOf(STG_STORAGE) + 16, decodedUrl.indexOf("/ctx;"));
                    } catch (StringIndexOutOfBoundsException e) {
                        storage = decodedUrl.substring(decodedUrl.indexOf(STG_STORAGE) + 16, decodedUrl.indexOf("/view"));
                    }
                }
                anonymousStorage = "https://preprojectus.ec2.avery.com/" + storage + "/";
                break;
            default:
                try {
                    storage = decodedUrl.substring(decodedUrl.indexOf(STORAGE) + 13, decodedUrl.indexOf(";path"));
                } catch (StringIndexOutOfBoundsException ex) {
                    try {
                        storage = decodedUrl.substring(decodedUrl.indexOf(STORAGE) + 13, decodedUrl.indexOf("/ctx;"));
                    } catch (StringIndexOutOfBoundsException e) {
                        storage = decodedUrl.substring(decodedUrl.indexOf(STORAGE) + 13, decodedUrl.indexOf("/view"));
                    }
                }
                anonymousStorage = "https://anonymous.print.avery.com/" + storage + "/";
                break;
        }
        return anonymousStorage;
    }
}
