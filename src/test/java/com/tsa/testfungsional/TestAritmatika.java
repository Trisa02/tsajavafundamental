package com.tsa.testfungsional;
/*
IntelliJ IDEA 2023.3.1 (Ultimate Edition)
Build #IU-233.11799.300, built on December 12, 2023
@Author PT.DIKA a.k.a. Trisa Sarifatul Anisak
Java Developer
Created on 11/09/2024 13:13
@Last Modified 11/09/2024 13:13
Version 1.0
*/

import com.tsa.ExtendManager;
import com.tsa.unittesting.OperatorAritmatika;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Random;

public class TestAritmatika {

    private Random rand;
    private OperatorAritmatika operatorAritmatika;
    private Double varA;
    private Double varB;
    private Boolean isOk = true;

    @BeforeSuite
    //digunakan untuk setup sebelum suite dimulai. Di sini,
    // ExtendManager.setExtend() dipanggil untuk menginisialisasi laporan.
    public void beforeSuite(){
        ExtendManager.setExtend();
    }
    @BeforeTest
    public void setUp(){
        rand = new Random();
        operatorAritmatika = new OperatorAritmatika();
        varA = rand.nextDouble();
        varB = rand.nextDouble();
        System.out.println("Init jalan....!!");
    }

    @Test(priority = 0) //prioroty digunakan untuk menandakan mana yang akan di jalan terlebih dahulu
    public void testTambah(){
        //sebelah kiri adalah yang terjadi, sebelah kanan hasil yang di harapkan
        Assert.assertEquals(operatorAritmatika.tambah(varA,varB),(varA + varB));
    }

    @Test(priority = 1)
    public void testKurang(){
        if(false){
            isOk = false;
        }
        Assert.assertEquals(operatorAritmatika.kurang(varA,varB),(varA-varB));
    }

    @Test(priority = 2)
    public void testKali(){
        Assert.assertEquals(operatorAritmatika.kali(varA,varB),(varA*varB));
    }

    @Test(priority = 3)
    public void testBagi(){
        if(isOk){

        }
        else {

        }
        Assert.assertEquals(operatorAritmatika.bagi(varA,varB),(varA/varB));
    }

    @Test(priority = 4)
    public void testModulus(){
        Assert.assertEquals(operatorAritmatika.modulus(varA,varB),(varA%varB));
    }

    @AfterTest
    public void deleteAllDocument(){
        System.out.println("Delete dokumen!!");
    }




}
