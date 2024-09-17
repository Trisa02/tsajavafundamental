package com.tsa.testfungsional;
/*
IntelliJ IDEA 2023.3.1 (Ultimate Edition)
Build #IU-233.11799.300, built on December 12, 2023
@Author PT.DIKA a.k.a. Trisa Sarifatul Anisak
Java Developer
Created on 11/09/2024 15:07
@Last Modified 11/09/2024 15:07
Version 1.0
*/

import com.tsa.ExtendManager;
import com.tsa.unittesting.FunsionalText;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestText {

    private String text;
    private FunsionalText funsionalText;
    private char [] charArr;

    private int lenghChar;

    @BeforeTest
    public  void setUp(){
        funsionalText = new FunsionalText();
        text = "Aqua air mineral";
        charArr = text.toCharArray();
        lenghChar = text.length();
    }

    @Test
    public  void textPanjangText(){
        Assert.assertEquals(funsionalText.panjangText(text),lenghChar);
    }

    @Test
    public  void hurufAwal(){
        Assert.assertEquals(funsionalText.hurufAwal(text),charArr[0]);
    }

    @Test
    public  void hurufAkhir(){
        Assert.assertEquals(funsionalText.hurufAkhir(text),charArr[lenghChar-1]);
    }

    @AfterTest
    public void clearAllTest(){
        System.out.println("Dokumen close");
    }

    @AfterSuite
    //digunakan untuk melakukan cleanup setelah seluruh suite selesai.
    // Di sini, ExtendManager.endReport() dipanggil untuk menutup laporan.
    public void afterSuite(){
        ExtendManager.endReport();
    }
}
