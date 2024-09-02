package com.tsa.programmingbasics;
/*
IntelliJ IDEA 2023.3.1 (Ultimate Edition)
Build #IU-233.11799.300, built on December 12, 2023
@Author PT.DIKA a.k.a. Trisa Sarifatul Anisak
Java Developer
Created on 30/08/2024 19:27
@Last Modified 30/08/2024 19:27
Version 1.0
*/

import java.util.ArrayList;
import java.util.List;

public class PassingBy {
    public  static  void main (String[] args){
        int intX = 0;
        intX = getDataX();

        System.out.println(intX);
        List<Integer> listX = getDataList();
        int intList = listX.size();
        for (int i = 0; i < getDataList().size(); i++){

        }
    }

    public static Integer getDataX(){
        return ((10*8)-2) + 6;
    }

    public static List getDataList(){
        String strX = "Hello World";

        List list = new ArrayList();
        list.add(strX);
        list.add(strX + "abc");
        list.add(strX + "2323");

        return  list;
    }
}
