package com.tsa.model;
/*
IntelliJ IDEA 2023.3.1 (Ultimate Edition)
Build #IU-233.11799.300, built on December 12, 2023
@Author PT.DIKA a.k.a. Trisa Sarifatul Anisak
Java Developer
Created on 05/09/2024 19:27
@Last Modified 05/09/2024 19:27
Version 1.0
*/

import java.util.List;

public class Divisi {

    private  Integer id;
    private String namaDivisi;
    private String deskripsiDivisi;
    private String congLongDivisi;
    private Double contohLohDouble;
    private  List<BuatPassing>lt;

    public List<BuatPassing> getLt() {
        return lt;
    }

    public void setLt(List<BuatPassing> lt) {
        this.lt = lt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamaDivisi() {
        return namaDivisi;
    }

    public void setNamaDivisi(String namaDivisi) {
        this.namaDivisi = namaDivisi;
    }

    public String getDeskripsiDivisi() {
        return deskripsiDivisi;
    }

    public void setDeskripsiDivisi(String deskripsiDivisi) {
        this.deskripsiDivisi = deskripsiDivisi;
    }

    public String getCongLongDivisi() {
        return congLongDivisi;
    }

    public void setCongLongDivisi(String congLongDivisi) {
        this.congLongDivisi = congLongDivisi;
    }

    public Double getContohLohDouble() {
        return contohLohDouble;
    }

    public void setContohLohDouble(Double contohLohDouble) {
        this.contohLohDouble = contohLohDouble;
    }






}
