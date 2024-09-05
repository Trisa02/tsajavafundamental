package com.tsa.logikapemprograman;
/*
IntelliJ IDEA 2023.3.1 (Ultimate Edition)
Build #IU-233.11799.300, built on December 12, 2023
@Author PT.DIKA a.k.a. Trisa Sarifatul Anisak
Java Developer
Created on 04/09/2024 21:31
@Last Modified 04/09/2024 21:31
Version 1.0
*/

import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sebuah kata : ");
        String strInput = sc.nextLine();
        //kodok --> str1
        //kodok --> str2
        // str1 equals str2

        String strDariKanan = "";
        char [] chArr = strInput.toCharArray();
        int intChArr = chArr.length;
        for (int i = 0; i < intChArr; i++) {
            strDariKanan = strDariKanan + chArr[(intChArr-1)-i];
        }
        System.out.println("Nilai STR Dari Kanan adalah : "+strDariKanan);
        if(strDariKanan.equalsIgnoreCase(strInput)){
            System.out.println("Ini Palindrom");
        }else {
            System.out.println("Bukan Palindrom");
        }
    }
}
