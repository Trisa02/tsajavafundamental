package com.tsa.logikapemprograman;
/*
IntelliJ IDEA 2023.3.1 (Ultimate Edition)
Build #IU-233.11799.300, built on December 12, 2023
@Author PT.DIKA a.k.a. Trisa Sarifatul Anisak
Java Developer
Created on 04/09/2024 21:28
@Last Modified 04/09/2024 21:28
Version 1.0
*/

import java.util.Random;

public class AngkaRandom {

    public static void main(String[] args) {
        Random rand = new Random();
        char chVokal [] = {'a','i','u','e','o'};
        String strKonsonan = "bcdfghjklmnpqrstvwxyz";
//        for (int i = 0; i < 10; i++) {
//            System.out.println(rand.nextLong(100000000000L,999999999999L));
//        }
        int strKonsonanLen = strKonsonan.length();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.print(strKonsonan.charAt(rand.nextInt(strKonsonanLen)));
            }
            System.out.println();
        }
    }
}
