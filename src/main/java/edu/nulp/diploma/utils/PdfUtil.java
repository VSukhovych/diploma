package edu.nulp.diploma.utils;

import edu.nulp.diploma.logger.LogListener;
import org.apache.pdfbox.io.IOUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.Assert;

import java.io.BufferedInputStream;
import java.net.URL;

public class PdfUtil {

    private PdfUtil() {
    }

    public static String getPdfStream(String link) {
        String doc = "";
        try {
            URL url = new URL(link);
            BufferedInputStream fileToParse = new BufferedInputStream(url.openStream());
            byte[] inputBytes = IOUtils.toByteArray(fileToParse);
            doc = new String(inputBytes);

        } catch (Exception e) {
            LogListener.log.error("PDF parse  error", e);
        }
        return doc;
    }

    public static String getText(String link, int endPage) {
        String doc = "";
        try {
            URL url = new URL(link);
            BufferedInputStream fileToParse = new BufferedInputStream(url.openStream());
            byte[] inputBytes = IOUtils.toByteArray(fileToParse);

            PDDocument pddDocument = PDDocument.load(inputBytes);
            PDFTextStripper textStripper = new PDFTextStripper();
            textStripper.setEndPage(endPage);
            doc = textStripper.getText(pddDocument);
            pddDocument.close();
        } catch (Exception e) {
            LogListener.log.error("PDF parse error", e);
        }
        return doc;
    }

    public static void checkMailMerge(String link, int endPage, String addedText, String expectedPageNumber, int rowNumber) {
        String doc = "";
        int pageNumber = 0;

        try {
            URL url = new URL(link);
            BufferedInputStream fileToParse = new BufferedInputStream(url.openStream());
            byte[] inputBytes = IOUtils.toByteArray(fileToParse);

            PDDocument pddDocument = PDDocument.load(inputBytes);
            pageNumber = pddDocument.getNumberOfPages();
            PDFTextStripper textStripper = new PDFTextStripper();
            textStripper.setEndPage(endPage);
            doc = textStripper.getText(pddDocument);
            pddDocument.close();
        } catch (Exception e) {
            LogListener.log.error("PDF parse error", e);
        }

        StringBuilder actualAddedText = new StringBuilder();
        String[] splitDoc = doc.split("\\R", rowNumber + 1);
        for (int i = 0; i < rowNumber; i++) {
            actualAddedText.append(splitDoc[i]).append("  ");
        }
        Assert.assertEquals(actualAddedText.toString().trim(), addedText, "Error - incorrect text in pdf");
        Assert.assertEquals(String.valueOf(pageNumber), expectedPageNumber, "Error - incorrect page number in pdf");
    }
}
