package com.tsa.exception;
/*
IntelliJ IDEA 2023.3.1 (Ultimate Edition)
Build #IU-233.11799.300, built on December 12, 2023
@Author PT.DIKA a.k.a. Trisa Sarifatul Anisak
Java Developer
Created on 02/09/2024 20:18
@Last Modified 02/09/2024 20:18
Version 1.0
*/

import java.util.Scanner;

public class KeywordThrow {

    //IlegalException menangani object terlarang yang dibuat, bisa untu
    ///bisa untuk pengangan validasi
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the keyword: ");
        String strKeyword = sc.nextLine();
        System.out.println("Input String" + strKeyword);
        if(strKeyword.contains("Saya")){
            throw new IllegalArgumentException("Anda memasukan kata terlarang !!, yaitu " + strKeyword);
        }
    }

    public static void getData() throws ArithmeticException{

    }

    public static  void catchData(){
        try{
            getData();
        }catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
