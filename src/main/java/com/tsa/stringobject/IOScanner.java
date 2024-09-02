package com.tsa.stringobject;
/*
IntelliJ IDEA 2023.3.1 (Ultimate Edition)
Build #IU-233.11799.300, built on December 12, 2023
@Author PT.DIKA a.k.a. Trisa Sarifatul Anisak
Java Developer
Created on 02/09/2024 19:11
@Last Modified 02/09/2024 19:11
Version 1.0
*/

import java.util.Scanner;

public class IOScanner {

    public static void main(String[] args){
        //scanner adalah nama object
        Scanner scanner = new Scanner(System.in);
        //// Type String
        System.out.println("Masukan Nama anda");
        String strNama = scanner.nextLine(); // Penampung object
        System.out.println("Nama anda adalah : "+strNama);

        ///Type integer
        System.out.println("Masukan  Nilai Bilangan Bulat :");
        int intNilai = scanner.nextInt();
        System.out.println("Nilai Bilangan Bulat adalah : " + intNilai);

        ///Type Double
        System.out.println("Masukan  Nilai Bilangan Bulat :");
        double douNilai = scanner.nextDouble();
        System.out.println("Nilai Bilangan Bulat adalah : " + douNilai);


    }
}
