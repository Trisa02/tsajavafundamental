package com.tsa.oop;
/*
IntelliJ IDEA 2023.3.1 (Ultimate Edition)
Build #IU-233.11799.300, built on December 12, 2023
@Author PT.DIKA a.k.a. Trisa Sarifatul Anisak
Java Developer
Created on 09/09/2024 21:09
@Last Modified 09/09/2024 21:09
Version 1.0
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PanggilConstructor {

    public static void main(String[] args) {
        System.out.println(new ContohConstructor());
        System.out.println(new ContohConstructor("paul","paul123","paul@123"));
        List l = new ArrayList();
        ContohConstructor contoh = new ContohConstructor();
        contoh.setNama("paul");
        contoh.setUsername("paul123");
        contoh.setPassword("paul123");
        contoh.panggilPublic = "10";

        Map<Integer,String> mapzz = new HashMap<>();
        l.add(contoh);
        l.add(new ContohConstructor("paul","paul123","paul@123"));

        ScopeEncapsule scopeEncapsule = new ScopeEncapsule("paul","paul123","paul@123");
        scopeEncapsule.getNama();
        scopeEncapsule.getEmail();
        scopeEncapsule.getPassword();
    }

    public static void getter1(int intX , String str){

    }

    public static void getter2(String str, int intX, String isNull){

    }
}
