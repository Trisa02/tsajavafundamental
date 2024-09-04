package com.tsa.method;
/*
IntelliJ IDEA 2023.3.1 (Ultimate Edition)
Build #IU-233.11799.300, built on December 12, 2023
@Author PT.DIKA a.k.a. Trisa Sarifatul Anisak
Java Developer
Created on 03/09/2024 21:06
@Last Modified 03/09/2024 21:06
Version 1.0
*/

public class ContohStatic {

    private  int isStatic;

    public  ContohStatic(){

    }

    public  static  void main(String[] args){
        BedaClass bedaClass = new BedaClass(2);
        System.out.println(BedaClass.getiStatic());
//        bedaClass = new BedaClass();
//        bedaClass =new BedaClass();
    }
}
