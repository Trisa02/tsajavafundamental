package com.tsa.method;
/*
IntelliJ IDEA 2023.3.1 (Ultimate Edition)
Build #IU-233.11799.300, built on December 12, 2023
@Author PT.DIKA a.k.a. Trisa Sarifatul Anisak
Java Developer
Created on 03/09/2024 20:57
@Last Modified 03/09/2024 20:57
Version 1.0
*/

import com.tsa.exception.SampleMethod;

public class PanggilMethod extends SampleMethod {

    public static void main(String[] args) {
//        SampleMethod sampleMethod = new SampleMethod();
    }

    public void init(){
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
    }

    public void init(String strNull){
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
    }

    public void methodBiasa(){
        init(null);
    }

    public void methodLuarBiasa(){
        init();
    }

    public void methodBiasaLuar(){
        init();
    }


}
