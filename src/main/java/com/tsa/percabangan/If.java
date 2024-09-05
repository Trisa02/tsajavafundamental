package com.tsa.percabangan;
/*
IntelliJ IDEA 2023.3.1 (Ultimate Edition)
Build #IU-233.11799.300, built on December 12, 2023
@Author PT.DIKA a.k.a. Trisa Sarifatul Anisak
Java Developer
Created on 03/09/2024 19:20
@Last Modified 03/09/2024 19:20
Version 1.0
*/

public class If {
    public static void main(String[] args) {
        int intX = 7;
//        if (intX == 3) {
//            System.out.println("Masuk kesini dengan intX bernilai 3");
//        }else if (intX == 4) {
//            System.out.println("Masuk kesini dengan intX bernilai 4");
//        }else if (intX == 5) {
//            System.out.println("Masuk kesini dengan intX bernilai 5");
//        }else if (intX == 6) {
//            System.out.println("Masuk kesini dengan intX bernilai 6");
//        }else if (intX == 7) {
//            System.out.println("Masuk kesini dengan intX bernilai 7");
//        }else {
//            System.out.println("Masuk kesini dengan intX bernilai "+intX);
//        }
//        System.out.println("Langsung kesini");
//
//        switch (intX){
//            case 3:System.out.println("Masuk kesini dengan intX bernilai 3");break;
//            case 4:System.out.println("Masuk kesini dengan intX bernilai 4");break;
//            case 5:System.out.println("Masuk kesini dengan intX bernilai 5");break;
//            case 6:System.out.println("Masuk kesini dengan intX bernilai 6");break;
//            case 7:System.out.println("Masuk kesini dengan intX bernilai 7");break;
//            default:System.out.println("Masuk kesini dengan intX bernilai "+intX);break;
//        }

//        if(intX==7){
//            System.out.println("Masuk kesini dengan intX 7 ");
//        }else {
//            System.out.println("Masuk kesini dengan intX "+intX);
//        }

//        String strMessage = intX==7?"Masuk kesini dengan intX 7 ":"Masuk kesini dengan intX "+intX;
//        System.out.println(strMessage);

//        int intMax = 2147483647; // -2147483648 s.d 2147483647
//        System.out.println(intMax);
//        String strFlag = "J";
//        if(strFlag.equals("J")) {
//            // lakukan insert ke table A
//            // lakukan insert ke table B
//            // lakukan Update table C
//        }else {
//            // insert ke table E
//        }

        int korupsi = 138000000;

        if (korupsi < 1000000) {

            System.out.println("Penjara 1 tahun");

        }else {

            if (korupsi< 100000000) {

                System.out.println("Penjara 5 tahun");

            }else {

                if (korupsi < 1000000000) {

                    System.out.println ("Penjara 10 tahun");

                }else {

                    System.out.println("Penjara 20 tahun");

                }

            }

        }

        if (korupsi > 150000000) {

            System.out.println("Hukuman kebiri");

        }

    }
}
