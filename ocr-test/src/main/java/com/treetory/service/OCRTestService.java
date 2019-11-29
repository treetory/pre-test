package com.treetory.service;

import com.treetory.util.ImageCracker;
import net.sourceforge.tess4j.TesseractException;

public interface OCRTestService {

    public String doCrackImage(String filePath, ImageCracker.LANGUAGE language, String tessdataPath) throws TesseractException;

}
