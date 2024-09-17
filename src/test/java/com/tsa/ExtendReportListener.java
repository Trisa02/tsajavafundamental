package com.tsa;
/*
IntelliJ IDEA 2023.3.1 (Ultimate Edition)
Build #IU-233.11799.300, built on December 12, 2023
@Author PT.DIKA a.k.a. Trisa Sarifatul Anisak
Java Developer
Created on 11/09/2024 21:54
@Last Modified 11/09/2024 21:54
Version 1.0
*/

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

///kelas yang diharapkan menjadi listener untuk TestNG dan mengintegrasikan ExtentReports ke dalam proses pengujian
public class ExtendReportListener implements ITestListener {
    private static ExtentReports extent;
    private static ExtentTest test;
    private static ExtentSparkReporter sparkReporter;

    @Override
    public void onStart(ITestContext context) {
        // Dipanggil sebelum suite pengujian dimulai.
        // Menginisialisasi laporan dengan ExtentReports dan ExtentSparkReporter
        // Initialize the ExtentReports and attach the reporter
        sparkReporter = new ExtentSparkReporter(
                System.getProperty("user.dir") + "/test-output/ExtentReport/"
                        + LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddMMYY-HHmmss"))
                        + "/TestExecutionReport.html"
        );
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
    }

    @Override
    public void onTestStart(ITestResult result) {
        //Dipanggil sebelum setiap test dimulai.
        // Membuat entry baru di laporan untuk test yang sedang berjalan.
        // Create a new test entry in the report
        test = extent.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        //Dipanggil ketika test berhasil. Menandai test sebagai berhasil di laporan.
        // Log the test as passed
        test.pass("Test passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        //Dipanggil ketika test gagal.
        // Menandai test sebagai gagal dan mencatat kesalahan di laporan.
        // Log the test as failed
        test.fail(result.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        //Dipanggil ketika test dilewati. Mencatat test yang dilewati di laporan.
        // Log the test as skipped
        test.skip(result.getThrowable());
    }

    @Override
    public void onFinish(ITestContext context) {
        // Dipanggil setelah semua test selesai. Menyelesaikan laporan dengan mem-flush data ke file laporan.
        // Flush the report
        extent.flush();
    }
}

