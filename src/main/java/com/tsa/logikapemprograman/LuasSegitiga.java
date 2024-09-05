package com.tsa.logikapemprograman;
/*
IntelliJ IDEA 2023.3.1 (Ultimate Edition)
Build #IU-233.11799.300, built on December 12, 2023
@Author PT.DIKA a.k.a. Trisa Sarifatul Anisak
Java Developer
Created on 04/09/2024 21:30
@Last Modified 04/09/2024 21:30
Version 1.0
*/

public class LuasSegitiga {

    public static void main(String[] args) {
        luasSegitiga(3,5);
    }

    public static void luasSegitiga(int intX, int intY){
        float doLuas = intX*intY*0.5F;
        System.out.println("Do Luas "+doLuas);
    }
}
