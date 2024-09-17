package com.tsa.oop;
/*
IntelliJ IDEA 2023.3.1 (Ultimate Edition)
Build #IU-233.11799.300, built on December 12, 2023
@Author PT.DIKA a.k.a. Trisa Sarifatul Anisak
Java Developer
Created on 09/09/2024 20:58
@Last Modified 09/09/2024 20:58
Version 1.0
*/

public class Parent {

    private int id;
    public String name;
    protected Long uuid;
    String noModif;


    public Parent() {
        AbstractContoh contoh = new AbstractContoh() {
            @Override
            public void fungsi4() {
                // call smtp gmail
                // call smtp ptdika
            }
        };
    }

    public void fungsi1(){
        System.out.println("INI FUNGSI 1 dari CLASS PARENT !!");
    }

    protected void fungsi2(){

    }

    void fungsi3(){

    }

    private void fungsi4(){

    }
}
