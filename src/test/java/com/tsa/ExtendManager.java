package com.tsa;
/*
IntelliJ IDEA 2023.3.1 (Ultimate Edition)
Build #IU-233.11799.300, built on December 12, 2023
@Author PT.DIKA a.k.a. Trisa Sarifatul Anisak
Java Developer
Created on 11/09/2024 21:45
@Last Modified 11/09/2024 21:45
Version 1.0
*/

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


///Extend Manager adalah kelas yang bertanggung jawan untuk mengatur konfigurasi dan siklus hidup laporan report
public class ExtendManager {

    //ExtendHtmlReport hanya bisa di akses di versi 5 kebawah
    public static ExtentHtmlReporter htmlReporter; //digunakan untuk menghasilkan report dalam bentuk html
    public static ExtentReports extent; //object yang digunakan untuk mengelola dan menghasilkan laporan
    public static ExtentTest test;

    public  static  void setExtend(){
        htmlReporter = new ExtentHtmlReporter(
                System.getProperty("user.dir") + "/test-output/ExtentReport/" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddMMYY-HHmmss"))
                        +"/"  + "TestExecutionReport"
                        +".html"
        );
        htmlReporter.loadXMLConfig(System.getProperty("user.dir") + "/extent_config.xml"); //memuat konfigurasi dari file xml untuk menyesuaikan laporan
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
    }

    public static void endReport(){
        extent.flush(); //menyimpan laporan dan memastikan semua laporan sudah di muat ke dalam file
    }
}
