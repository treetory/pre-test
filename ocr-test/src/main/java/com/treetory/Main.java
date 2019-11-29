package com.treetory;

import com.treetory.service.OCRTestService;
import com.treetory.service.OCRTestServiceImpl;
import com.treetory.util.ImageCracker;
import net.sourceforge.tess4j.TesseractException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        // 영문 문자 인식 테스트
        LOG.debug("{}{}", System.lineSeparator(), doTesseract(
                "d:\\temp\\TEST_OCR\\testImage.PNG",
                ImageCracker.LANGUAGE.eng.name(),
                "d:\\temp\\TEST_OCR\\tessdata"));

        // 한글 문자 인식 테스트
        LOG.debug("{}{}", System.lineSeparator(), doTesseract(
                "d:\\temp\\TEST_OCR\\optimize.jpg",
                ImageCracker.LANGUAGE.kor.name(),
                "d:\\temp\\TEST_OCR\\tessdata"
        ));

    }

    public static String doTesseract(String filePath, String language, String tessdataPath) {

        String result = "";

        try {

            OCRTestService ots = OCRTestServiceImpl.create();
            result = ots.doCrackImage(filePath, ImageCracker.LANGUAGE.valueOf(language), tessdataPath);

        } catch (TesseractException e) {
            LOG.error("{}", e);
            result = "!!!!!!!!!!!!!!! Can't read the text from the image. !!!!!!!!!!!!!!";
        }

        return result;
    }

}
