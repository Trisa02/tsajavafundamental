package com.tsa.exception;
/*
IntelliJ IDEA 2023.3.1 (Ultimate Edition)
Build #IU-233.11799.300, built on December 12, 2023
@Author PT.DIKA a.k.a. Trisa Sarifatul Anisak
Java Developer
Created on 02/09/2024 19:36
@Last Modified 02/09/2024 19:36
Version 1.0
*/

public class ClassifiedException {

    public static void main(String [] args){
        try{
            Thread.sleep(10);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        // penganan eror
        ///Jika Bingung pilih handle exception pilih saja "Exception"
        System.out.println("INI DI EKSEKUSI....");
        try{
            int intX = 1/0;
            int intY = intX;
        }catch (Exception e){
            System.out.println("Ketangkap ni eror " + e.getMessage());
        }
        System.out.println("Berhenti Disini.....");
    }
}
