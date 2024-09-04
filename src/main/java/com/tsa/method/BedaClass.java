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

public class BedaClass {
    public static   int isStatic;

    public  BedaClass(int isStatic){
        this.isStatic = isStatic;
    }

    public static int getiStatic(){
        return isStatic;
    }
}
