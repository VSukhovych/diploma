package edu.nulp.diploma.utils;

import edu.nulp.diploma.constant.TestConstantValues;
import edu.nulp.diploma.logger.LogListener;
import io.qameta.allure.Step;

import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public static String decodeValue(String value) {
        String decodeValue = null;
        try {
            decodeValue = URLDecoder.decode(value, StandardCharsets.UTF_8.toString());
        } catch (UnsupportedEncodingException e) {
            LogListener.log.error("url decoder error", e);
        }
        return decodeValue;
    }

    public static String encodeValue(String value) {
        String encodedValue = null;
        try {
            encodedValue = URLEncoder.encode(value, StandardCharsets.UTF_8.toString());
        } catch (UnsupportedEncodingException e) {
            LogListener.log.error("url encoder error", e);
        }
        return encodedValue;
    }

    @Step("Check that youtube link is matching pattern")
    public static boolean checkYoutubeLink(String youtubeLink) {
        String pattern = "(https://youtu.be)[^#\\&\\?]*";

        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(youtubeLink);
        return matcher.matches();
    }
}
