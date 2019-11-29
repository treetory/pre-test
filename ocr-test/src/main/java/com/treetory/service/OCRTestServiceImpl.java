package com.treetory.service;

import com.treetory.util.ImageCracker;
import net.sourceforge.tess4j.TesseractException;

public class OCRTestServiceImpl implements OCRTestService {

    private ImageCracker ic = new ImageCracker();

    public static OCRTestService create() {
        OCRTestService ots = new OCRTestServiceImpl();
        return ots;
    }

    public String doCrackImage(String filePath, ImageCracker.LANGUAGE language, String tessdataPath) throws TesseractException {
        return ic.crackImage(filePath, language, tessdataPath);
    }
}
