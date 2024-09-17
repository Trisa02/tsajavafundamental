package com.tsa.oop;
/*
IntelliJ IDEA 2023.3.1 (Ultimate Edition)
Build #IU-233.11799.300, built on December 12, 2023
@Author PT.DIKA a.k.a. Trisa Sarifatul Anisak
Java Developer
Created on 09/09/2024 21:08
@Last Modified 09/09/2024 21:08
Version 1.0
*/

import com.tsa.oop.model.Department;

import java.util.ArrayList;
import java.util.List;

public class PanggilAbstractClass {

    public static void main(String[] args) {
        AbstractContoh contoh = new AbstractContoh() {
            @Override
            public void fungsi4() {
                System.out.println("Jalankan Fungsi Ini");
            }
        };
        contoh.fungsi4();

        List arrayList = new ArrayList();
        arrayList.add(contoh);
        arrayList.size();
        arrayList.clear();

        Department department = new Department();

        if(department.name==null){
            System.out.println("Department is null");
        }
        if(department.getName().equalsIgnoreCase("")){
            System.out.println("Department is Empty");
        }
        if(department.getName().equals(" ")){
            System.out.println("Department is is Blank");
        }


    }
}
