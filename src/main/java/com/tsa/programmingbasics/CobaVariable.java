package com.tsa.programmingbasics;
/*
IntelliJ IDEA 2023.3.1 (Ultimate Edition)
Build #IU-233.11799.300, built on December 12, 2023
@Author PT.DIKA a.k.a. Trisa Sarifatul Anisak
Java Developer
Created on 30/08/2024 19:18
@Last Modified 30/08/2024 19:18
Version 1.0
*/

public class CobaVariable {
    public static  void main(String[] args){
        //inisiasi variable
        int intNama;
        intNama = 10;;

        intNama = intNama+5;
        System.out.println(intNama);

        int intX = 2345678;
        System.out.println(intX);
        long longX = 234567892345L;
        intX = (int) longX;
        System.out.println(intX);

    }
}
