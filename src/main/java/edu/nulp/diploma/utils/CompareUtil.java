package edu.nulp.diploma.utils;

import edu.nulp.diploma.logger.LogListener;
import io.restassured.response.Response;
import org.apache.commons.io.FileUtils;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;

public class CompareUtil {
    private CompareUtil() {
    }

    public static void compareFiles(Response response, String pathToFile) {
        String actualJSON = response.getBody().asString();
        File file = new File(pathToFile);
        String expectedJSON = null;
        try {
            expectedJSON = FileUtils.readFileToString(file);
        } catch (IOException e) {
            LogListener.log.error("read from file error", e);
        }
        Assert.assertEquals(actualJSON, expectedJSON, "Error - actual and expected files are different");
    }
}
