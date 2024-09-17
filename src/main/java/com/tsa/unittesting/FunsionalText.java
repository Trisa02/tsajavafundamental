package com.tsa.unittesting;
/*
IntelliJ IDEA 2023.3.1 (Ultimate Edition)
Build #IU-233.11799.300, built on December 12, 2023
@Author PT.DIKA a.k.a. Trisa Sarifatul Anisak
Java Developer
Created on 11/09/2024 13:19
@Last Modified 11/09/2024 13:19
Version 1.0
*/

public class FunsionalText {


    public  Integer panjangText(String text){

        return text.length();
    }

    public Character hurufAwal(String text){
        return text.charAt(0);
    }

    public Character hurufAkhir(String text){
        return text.charAt(text.length()-1);
    }
}
