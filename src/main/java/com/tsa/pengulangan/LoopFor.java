package com.tsa.pengulangan;
/*
IntelliJ IDEA 2023.3.1 (Ultimate Edition)
Build #IU-233.11799.300, built on December 12, 2023
@Author PT.DIKA a.k.a. Trisa Sarifatul Anisak
Java Developer
Created on 03/09/2024 19:22
@Last Modified 03/09/2024 19:22
Version 1.0
*/

public class LoopFor {
    public  static  void main(String [] args){
        System.out.println(1.0);
        String strTampung = lanjutProses1("OK",1);
        System.out.println("STR Tampung --> " +strTampung);
        if(strTampung.equals("OK")){
            System.out.println("Print Disini");
        }
        // Maksud for ini adalah i adalah 1 dan i kecil sama
        // dengan 10 dia akan mengeluarkan nilai 1 sampai 10
        // karna setelah output i ada perulangan j lagi
        // dimana j = 0 j kecil dari 5 dia akan mengeluarkan nilai 0 - 4
        // karna perulangan j diletak setelah nilai i makan setiap nilai i keluar
        // akan dikelukan j sebanyak batas perulangan sampai i di batas akhir
        for (int i=1;i<=10;i++){
            System.out.println("Nilai i adalah : " +i);
            for (int j = 0 ; j < 5; j++){
                System.out.println("Nilai J adalah : " + j);
            }
        }

        ///Maksud perulangan ini j = 0 dan j kecil dari 5
        //J akan mengeluarkan nilai j
        //kemudian ada kondisi jika jika nilai j sama dengan 2
        // is found akan true dan perulangan akan di berhentikan
        // dan jika is found sudah true makan akan muncul nilai sudah ditemukan
        boolean isFound = false;
        for(int j=0;j<5;j++ ){
            if (j == 2){
                isFound = true;
                break;
            }
            System.out.println("Nilai J adalah :" +j);
        }
        if(isFound){
            System.out.println("Sudah Ketemu");
        }else {
            System.out.println("Belum Ditemukan");
        }

        //Fungsi Continue dalam perulangan digunakan untuk menghentikan eksekusi iterasi pada perulangan
        //dalam bahasa jelas nya dia tidak akan mengeluarkan nilai i jika kondisi i ditentukan dan di continue kan
        //i sama dengan 1 dan i kecil sama dengan 5 dia akan mengeluarkan i i sampai 5
        // karna ada kondisi jika i = 2 jalankan continue , maka nilai i tidak akan dikeluarkan (diloncatkan)
        //kemudian ada perulangan di dalam perulangan sehingga setiap i dikeluarkan di akan menjalankan perulangan
        //dibawah nya
        for (int i = 1; i <= 5; i++){
            if(i==2){
                continue;
            }
            for (int j=1; j<=3; j++){
                System.out.println("Nilai i " +i+ " J Tereksekusi " +j);
            }
        }


        //toLoweCase => untuk mengubah huruf besar menjadi huruf kecil agar tidak ada case sensitif
        // || adalah or
        //equals membandingkan antara nilai yang di defenisikan dengan nilai di kondisi
        String strHuruf = "J";
        strHuruf = strHuruf.toLowerCase();
        if(strHuruf.equals("a") || strHuruf.equals("i") || strHuruf.equals("e")
            || strHuruf.equals("u") || strHuruf.equals("o")){
            System.out.println("Ini adalah huruf vokal");
        }else{
            System.out.println("Ini adaah huruf konsonan");
        }
    }

    public void lanjutProses1(int panjang,String lebar){
        //maksud perulangan ini nilai intX = 1,
        // kondisi pertama jika intx sana dengan satu jalankan kondisi pertama dan seterurnya
        // break digunakan jika kondisi pertama sudah terpenuhi maka kondisi berikut nya tidak dijalankan
        int intX = 1;
        switch (intX){
            case 1:
                System.out.println("Lakukan ini");break;
            case 2:
                System.out.println("Lakukan itu");break;
            case 3:
                System.out.println("Lakukan ini itu");break;
        }
    }

    public  static  String lanjutProses1(String lebar,int panjang){
        lanjutProses1(1);
        return "Value Lebar " +lebar+ " Value Panjang " +panjang;
    }

    public static  void lanjutProses1(int panjang){
        lanjutProses1("1");
        System.out.println("lanjutProses1 parameter int");
    }

    public static void lanjutProses1(String strPanjang){
        System.out.println("lanjutProses1 parameter str");
        lanjutProses1(new Object());

    }

    public  static  void  lanjutProses1(Object objPanjang){
        System.out.println("lanjutProses1 parameter object");
    }
}
