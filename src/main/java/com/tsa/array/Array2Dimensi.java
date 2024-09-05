package com.tsa.array;
/*
IntelliJ IDEA 2023.3.1 (Ultimate Edition)
Build #IU-233.11799.300, built on December 12, 2023
@Author PT.DIKA a.k.a. Trisa Sarifatul Anisak
Java Developer
Created on 04/09/2024 21:23
@Last Modified 04/09/2024 21:23
Version 1.0
*/

import java.util.Random;

public class Array2Dimensi {

    public static void main(String[] args) {
//        int [][] intArr2 = new int[3][3];
        Random rand = new Random();
        int [][] intArr2 = {{1,2,3,4},{5,6,7}};
        System.out.println(intArr2[1][2]);
        for(int i=0; i<intArr2.length; i++){
            for (int j = 0; j < intArr2[i].length; j++) {
                System.out.print(intArr2[i][j]+" -- ");
            }
            System.out.println();
        }

        intArr2 = new int[5][5];
        int intPrint = 0;
        for(int i=0; i<intArr2.length; i++){
            for (int j = 0; j < intArr2[i].length; j++) {
                intPrint = rand.nextInt(100);
                System.out.print(intPrint+" --");
                intArr2[i][j] = intPrint;
            }
            System.out.println();
        }

        System.out.println("======================");
        for(int i=0; i<intArr2.length; i++){
            for (int j = 0; j < intArr2[i].length; j++) {
                System.out.print(intArr2[i][j]+" -- ");
            }
            System.out.println();
        }
    }
}
