package com.tsa.unittesting;
/*
IntelliJ IDEA 2023.3.1 (Ultimate Edition)
Build #IU-233.11799.300, built on December 12, 2023
@Author PT.DIKA a.k.a. Trisa Sarifatul Anisak
Java Developer
Created on 11/09/2024 13:14
@Last Modified 11/09/2024 13:14
Version 1.0
*/

public class OperatorAritmatika {

    public static String TOKEN_JWT = "";
    public  Double tambah(Double a, Double b){
        TOKEN_JWT = TOKEN_JWT + a +",";
        return a + b;
    }

    public Double kurang(Double a, Double b){
        return a - b;
    }

    public Double kali(Double a, Double b){
        return  a * b;
    }

    public Double bagi(Double a, Double b){
        return a / b;
    }

    public  Double modulus(Double a, Double b){
        return a % b;
    }
}
