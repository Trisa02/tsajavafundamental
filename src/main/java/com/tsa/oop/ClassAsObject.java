package com.tsa.oop;
/*
IntelliJ IDEA 2023.3.1 (Ultimate Edition)
Build #IU-233.11799.300, built on December 12, 2023
@Author PT.DIKA a.k.a. Trisa Sarifatul Anisak
Java Developer
Created on 09/09/2024 21:02
@Last Modified 09/09/2024 21:02
Version 1.0
*/

import com.tsa.array.Array2Dimensi;
import com.tsa.method.BedaClass;

public class ClassAsObject {

    //FE - >
    //BE ->
    private Long idFilm;
    private String judul;
    private String sutradara;

    public static void main(String[] args) {
        Array2Dimensi array2Dimensi = new Array2Dimensi();
        BedaClass bedaClass = new BedaClass(1);
        bedaClass.getAttribut();

    }
}
