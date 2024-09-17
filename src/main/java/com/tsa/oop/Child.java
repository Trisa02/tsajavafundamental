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

import java.util.Map;
import java.util.Set;

public class Child extends Parent{

    public Child() {
        super();
    }

    public void panggil(String str){
        super.fungsi1();
        super.name = "";
        System.out.println(str);
    }

    public void panggil(Integer intX){
        System.out.println(Math.pow(intX,2));
    }

    public void panggil(Set<Object> s){
    }

    public void panggil(Map<String,Object> m){
    }
//    callSP -> mengembalikan recordSet
//    callSP -> Transaction
//    callSP -> File
//    callSP -> Bulk
}
