package com.tsa.exception;
/*
IntelliJ IDEA 2023.3.1 (Ultimate Edition)
Build #IU-233.11799.300, built on December 12, 2023
@Author PT.DIKA a.k.a. Trisa Sarifatul Anisak
Java Developer
Created on 02/09/2024 21:24
@Last Modified 02/09/2024 21:24
Version 1.0
*/

public class ProduceEror {
    public static void main(String[] args) {
        String strToArr = "Ini ; Saya ... ";
        char [] chArr = strToArr.toCharArray();
        System.out.println(chArr.length);
        int intTampung = 0;
        for (int i = 0; i < chArr.length; i++) {
            intTampung = chArr[i];
            if(intTampung>=58 && intTampung<=64) {
                throw new IllegalArgumentException("Karakter Tidak Diperbolehkan ... "+chArr[i]);
            }
        }
        System.out.println("Berhasil kesini ....");
    }
}
