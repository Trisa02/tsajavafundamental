package com.tsa.collection;
/*
IntelliJ IDEA 2023.3.1 (Ultimate Edition)
Build #IU-233.11799.300, built on December 12, 2023
@Author PT.DIKA a.k.a. Trisa Sarifatul Anisak
Java Developer
Created on 05/09/2024 21:37
@Last Modified 05/09/2024 21:37
Version 1.0
*/

import java.util.*;

public class HashSetExample {

    public static void main(String [] args){
        List<Object> list = new ArrayList(); /// memperbolehkan data duplikasi
        list.add(1);
        list.add("2");
        list.add(2);
        list.add(2);
        list.add(2);

        Set<Object> set = new HashSet();  ///// penggunaan hash dia tidak mengizinkan data duplikasi sehingga hanya akan di cetak 1 jika data tersebut duplikasi
        set.add(1);
        set.add("String");
        set.add(2);
        set.add(2);
        set.add(2);
        set.add(3);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(list);
        System.out.println(set);

        List<Map<String,Object>> ltMap = new ArrayList(); //membuat list yang berisi map dengan key type strin dan value object
        Map<String,Object> m = new HashMap(); //Membuat Hasmap yang berisi key - value (String Object)
        m.put("nama","trisa"); //memasukan pasangan key dan value
        m.put("alamat","pancoran");
        m.put("email","trisa@gmail.com");
        ltMap.add(m); //Menambahkan Map m kedalam list ltMap
        m = new HashMap(); //Inisiasi ulang m menjadi hashmap baru yang kosong
        System.out.println(m.get("nama")); // inisiasi output m , hasil nya null karna m sudah di inisiasi menjadi null
        System.out.println(m.get("alamat"));
        System.out.println(m.get("email"));
        ltMap.add(m); //Menambahkan Map m yang baru(kosong) kedalam listmap
        for(int i = 0; i< ltMap.size();i++){ // Looping untuk iterasi pada setiap Map didalam ltmap
            for(Map.Entry<String,Object> map : ltMap.get(i).entrySet()){ //looping pada setiap pasangan key-value
                System.out.println("Key:"+map.getKey()+" value: "+map.getValue()); //mencetak key value
            }
        }

    }
}
