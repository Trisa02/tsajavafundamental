package com.tsa.Operator;
/*
IntelliJ IDEA 2023.3.1 (Ultimate Edition)
Build #IU-233.11799.300, built on December 12, 2023
@Author PT.DIKA a.k.a. Trisa Sarifatul Anisak
Java Developer
Created on 30/08/2024 19:35
@Last Modified 30/08/2024 19:35
Version 1.0
*/

public class OperatorAritmatika {
    public  static  void main(String[] args){

        double douNum1 =20.0;
        int intNum3 = 30;
        double douSum2 = (intNum3/douNum1);
        System.out.println(Math.floor(douSum2));

        int x = 2;
        int num1 = 10 * (x+1);
        System.out.println(num1);

        int intArgs = Integer.parseInt(args[0]);

        System.out.println(Integer.toBinaryString(181));
        System.out.println(Integer.toBinaryString(108));

        if(intArgs > 0) {
            System.out.println("Lebih dari 0");
        }else{
            System.out.println("Kurang dari 0");
        }

        int intX = 10 * (x+1);

        System.out.println(intX);
        for (int i = 0; i<5; i++){

        }
        for (int i=0;i<10;i++){

        }

    }
}
