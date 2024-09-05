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

public class VokalKonsonan {

    public static void main(String[] args) {
        String strHuruf = "j";

        if(
                strHuruf.equals("a") ||
                        strHuruf.equals("i") ||
                        strHuruf.equals("u") ||
                        strHuruf.equals("e") ||
                        strHuruf.equals("o")
        ){
            System.out.println("Ini adalah huruf Vokal ");
        }else {
            System.out.println("Ini adalah huruf Konsonan ");
        }

//        if(
//                strHuruf.equals("b") ||
//                        strHuruf.equals("c") ||
//                        strHuruf.equals("d") ||
//                        strHuruf.equals("f") ||
//                        strHuruf.equals("g") ||
//                        strHuruf.equals("h") ||
//                        strHuruf.equals("j") ||
//                        strHuruf.equals("k") ||
//                        strHuruf.equals("l") ||
//                        strHuruf.equals("m") ||
//                        strHuruf.equals("n") ||
//                        strHuruf.equals("p") ||
//                        strHuruf.equals("k")
//        ){
//            System.out.println("Ini adalah huruf Konsonan ");
//        }else {
//            System.out.println("Ini adalah huruf Vokal ");
//        }
    }
}
