package com.tsa.array;
/*
IntelliJ IDEA 2023.3.1 (Ultimate Edition)
Build #IU-233.11799.300, built on December 12, 2023
@Author PT.DIKA a.k.a. Trisa Sarifatul Anisak
Java Developer
Created on 04/09/2024 21:25
@Last Modified 04/09/2024 21:25
Version 1.0
*/

import java.util.Random;

public class LoopingArray {

    public static void main(String[] args) {
        Random rand = new Random();
        int intArr [] = new int[10];
        int arrLength = intArr.length;
        int intAssign = 0;
        for (int i = 0; i < arrLength; i++) {
            intAssign = rand.nextInt(100);
            System.out.println(intAssign);
            intArr[i] = intAssign;
        }

        for (int i = 0; i < arrLength; i++) {
            System.out.println("Nilai intArr index ke "+i+" : "+intArr[i]);
        }

    }
}
