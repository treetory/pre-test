package com.treetory.util;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class ImageCracker {

    private static final Logger LOG = LoggerFactory.getLogger(ImageCracker.class);

    public enum LANGUAGE {
        eng("eng"), kor("kor");
        private String language;
        LANGUAGE(String language) {
            this.language = language;
        }
        public String getLanguage() {
            return language;
        }
        public void setLanguage(String language) {
            this.language = language;
        }
    }

    public String crackImage(String filePath, LANGUAGE language, String tessdataPath) throws TesseractException {

        File imageFile = new File(filePath);
        ITesseract instance = new Tesseract();
        instance.setLanguage(language.getLanguage());
        instance.setDatapath(tessdataPath);

        try {
            String result = instance.doOCR(imageFile);
            return result;
        } catch (TesseractException e) {
            throw e;
        }
    }

}
