package com.tsa.oop;
/*
IntelliJ IDEA 2023.3.1 (Ultimate Edition)
Build #IU-233.11799.300, built on December 12, 2023
@Author PT.DIKA a.k.a. Trisa Sarifatul Anisak
Java Developer
Created on 09/09/2024 21:10
@Last Modified 09/09/2024 21:10
Version 1.0
*/

public class ScopeEncapsule {

    private String nama;
    private String password;
    private String email;

    public ScopeEncapsule(String nama, String password, String email) {
        this.nama = nama;
        this.password = password;
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}
