package edu.nulp.diploma.utils;

import edu.nulp.diploma.constant.TestConstantValues;
import edu.nulp.diploma.logger.LogListener;

import java.net.HttpURLConnection;
import java.net.URL;

import static edu.nulp.diploma.logger.LogListener.log;

public final class UrlUtil {

    private UrlUtil() {
    }

    public static Boolean validateUrl(String url) {
        Boolean check = false;
        try {
            HttpURLConnection.setFollowRedirects(false);
            HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();

            con.setRequestMethod("GET");

            con.setConnectTimeout(TestConstantValues.TIME_OUT_VALUE);
            con.setReadTimeout(TestConstantValues.TIME_OUT_VALUE);

            log.info("Validate url: {}", url);
            check = (con.getResponseCode() == HttpURLConnection.HTTP_OK);
        } catch (Exception ex) {
            LogListener.log.error("HttpURLConnection error", ex);
        }
        return check;
    }
}
