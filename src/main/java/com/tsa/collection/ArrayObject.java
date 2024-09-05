package com.tsa.collection;
/*
IntelliJ IDEA 2023.3.1 (Ultimate Edition)
Build #IU-233.11799.300, built on December 12, 2023
@Author PT.DIKA a.k.a. Trisa Sarifatul Anisak
Java Developer
Created on 05/09/2024 20:05
@Last Modified 05/09/2024 20:05
Version 1.0
*/

import com.tsa.model.BuatPassing;
import com.tsa.model.Divisi;

import java.util.*;

public class ArrayObject {

    public  static void main(String[] args){
        int intArr[] = new int[5];
        intArr[0] = 1;
        intArr[1] = 2;
        System.out.println(intArr);
        System.out.println(intArr[0]);
        System.out.println(intArr[1]);
        System.out.println(intArr[2]);

        System.out.println("==================");
        ObjectX[] objArrr = new ObjectX[2];

        ObjectX obj1 = new ObjectX();
        obj1.setId(1L);
        obj1.setName("Satu");
        obj1.setDescription("Buat 1");
        objArrr[0] = obj1;

        obj1 = new ObjectX();
        obj1.setId(2L);
        obj1.setName("Dua");
        obj1.setDescription("Buat 2");
        objArrr[1] = obj1;

        System.out.println(objArrr);
        System.out.println(objArrr[0].getId());
        System.out.println(objArrr[1]);

        for (ObjectX obj : objArrr){
            System.out.println(obj.getId());
            System.out.println(obj.getName());
            System.out.println(obj.getDescription());
        }
        System.out.println("================================");
        int intSize = objArrr.length; /// kenapa hasil nya dua karna datanya di array cuma 2
        for(int i = 0; i<intSize; i++){
            System.out.println(objArrr[i].getId());
            System.out.println(objArrr[i].getName());
            System.out.println(objArrr[i].getDescription());
        }

        //Dynamic Binding
        List l = new ArrayList<>();
        List l2 = new LinkedList<>();
        Map m = new LinkedHashMap();
        ArrayList<Divisi> al = new ArrayList();  // ambil data dari object di service yang telah di buat

        char charArr [] =new char[5];
//        char charArr = new char[5];

        l.add("1");
        l.add("2");
        l.add("3");
        l.add("4");
        l.add("5");
        System.out.println(l); //// hasil akan membentuk array list [1,2,3,4,5]
        al.add(new Divisi());
        al.add(new Divisi());
        al.add(new Divisi());
        al.add(new Divisi());
        System.out.println(al.get(0).getLt());

        List<BuatPassing> ltBuatPassing = al.get(0).getLt();
        int intA = ltBuatPassing.size();
        System.out.println(ltBuatPassing.get(0).getId());
        for(int i=0; i< intA; i++){
            System.out.println(ltBuatPassing.get(i).getId());
        }

        System.out.println("=============================");
        l.add(obj1);
        l.add(obj1);
        l.add(obj1);

        l.clear();

        l.add(obj1);
        l.add(obj1);
        l.add(obj1);

        System.out.println("==============");
        Contoh contoh = new Contoh();
        IContoh iContoh = new Contoh();



    }
}
