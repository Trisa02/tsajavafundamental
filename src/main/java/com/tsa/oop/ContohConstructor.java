package com.tsa.oop;
/*
IntelliJ IDEA 2023.3.1 (Ultimate Edition)
Build #IU-233.11799.300, built on December 12, 2023
@Author PT.DIKA a.k.a. Trisa Sarifatul Anisak
Java Developer
Created on 09/09/2024 21:05
@Last Modified 09/09/2024 21:05
Version 1.0
*/

public class ContohConstructor {

    private String nama;
    private String username;
    private String password;
    public String panggilPublic;

    public ContohConstructor() {
        System.out.println("Ini yang akan di jalankan sekali dan pertama kali !!");
    }

    public ContohConstructor(
            String username,
            String password) {
        this.username = username;
        this.password = password;
        System.out.println("Constructor 2 parameter "+username+password);
    }

    public ContohConstructor(String nama,
                             String username,
                             String password) {
        this.nama = nama;
        this.username = username;
        this.password = password;
        System.out.println("Constructor 3 parameter "+nama+username+password);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
