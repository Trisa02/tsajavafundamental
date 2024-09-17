package com.tsa.method;
/*
IntelliJ IDEA 2023.3.1 (Ultimate Edition)
Build #IU-233.11799.300, built on December 12, 2023
@Author PT.DIKA a.k.a. Trisa Sarifatul Anisak
Java Developer
Created on 03/09/2024 21:09
@Last Modified 03/09/2024 21:09
Version 1.0
*/

import java.util.Map;

public class BedaClass {
    @Override
    public String toString() {
        return "INI CLASS BEDA iStatic nilainya "+iStatic;
    }

    /**
     *  controller
     *  service
     *  repo
     *  dto
     *  model -> ORM (Konfigurasi ke Database)
     *  util
     *  security
     *  response
     */

    /**
     *  view
     *  controller
     *  service
     *  repo
     *  model
     *  util
     *  response
     */

    public static void main(String[] args) {
        String strX = "abcdefg";
        int intX = strX.length();
        System.out.println(strX.substring(2,intX-1));
    }

    public void getAttribut(Map<String,Object> map ,
                            String str1,
                            String str2,
                            String str3,
                            String str4
    ){


    }

    public void getAttribut(Map<String,Object> map ,
                            String str1,
                            String str2,
                            String str3,
                            int int1){

    }
    public void getAttribut(Map<String,Object> map ,
                            String str1,
                            String str2,
                            int int1,
                            int int2){

    }
    public void getAttribut(){

    }
    public static int iStatic;

    public BedaClass(int iStatic) {
        this.iStatic = iStatic;
    }

    public static int getiStatic() {
        return iStatic;
    }
}
