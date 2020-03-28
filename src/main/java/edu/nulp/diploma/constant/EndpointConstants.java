package edu.nulp.diploma.constant;

import edu.nulp.diploma.logger.LogListener;
import io.restassured.path.xml.XmlPath;

import java.io.InputStream;
import java.util.Properties;

public final class EndpointConstants {

    private static String flowConfig;

    private EndpointConstants() {
    }

    public static String getBaseUrl(String env) {
        return "https://" + env + ".print.avery.com/dpp/";
    }

    public static final String API_BASE_URL = getBaseUrl(getEnvUrlAPI()) + "private/dpo/rest/";

    public static String getApiBaseUrl() {
        return API_BASE_URL + "v1/" + getTargetName() + "/public/";
    }

    public static String getApiBaseUrl(String version, String status) {
        return API_BASE_URL + version + "/" + getTargetName() + "/" + status + "/";
    }

    public static String getPublicApiBaseUrl(String version) {
        return getBaseUrl(getEnvUrlUI()) + "public/" + version + "/";
    }

    public static String getPublicApiBaseUrl(String version, String env) {
        return getBaseUrl(env) + "public/" + version + "/";
    }

    public static final String AVERY_BASE_URL = getBaseUrl(getEnvUrlUI()) + "public/v1/open/" + getTargetName();

    public static String getIntEnvName() {
        return getEnvName().equals("production") ? "secure" : "test";
    }

    public static String getEnvName() {
        return System.getProperty("build.env", "test");
    }

    public static String getTargetName() {
        String targetName = getEnvName().equals("production") ? "US_en" : "US_en_trial";
        return System.getProperty("build.target", targetName);
    }

    public static String getEnvUrlUI() {
        String propertyValue = "";
        Properties prop = new Properties();
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        if (classLoader != null) {
            try (InputStream resourceStream = classLoader.getResourceAsStream("testEnvs.properties")) {
                prop.load(resourceStream);
                propertyValue = prop.getProperty(getEnvName());

            } catch (Exception e) {
                LogListener.log.error("Read from property file error", e);
            }
        }
        return propertyValue;
    }

    public static String getEnvUrlAPI() {
        String propertyValue = "";
        Properties prop = new Properties();
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        if (classLoader != null) {
            try (InputStream resourceStream = classLoader.getResourceAsStream("testEnvsAPI.properties")) {
                prop.load(resourceStream);
                propertyValue = prop.getProperty(getEnvName());

            } catch (Exception e) {
                LogListener.log.error("Read from property file error", e);
            }
        }
        return propertyValue;
    }

    public static String getCSPUrl(String target) {
        if (target.contains("US") || target.contains("CA")) {
            return "https://" + getEnvUrlUI() + ".print.avery.com/services/csp/";
        } else {
            return "https://secure.print.avery.com/services/csp/";
        }
    }
}
