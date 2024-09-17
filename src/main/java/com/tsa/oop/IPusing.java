package com.tsa.oop;
/*
IntelliJ IDEA 2023.3.1 (Ultimate Edition)
Build #IU-233.11799.300, built on December 12, 2023
@Author PT.DIKA a.k.a. Trisa Sarifatul Anisak
Java Developer
Created on 09/09/2024 21:06
@Last Modified 09/09/2024 21:06
Version 1.0
*/

public interface IPusing<T> {

    public void save(T t);
    public void edit(T t);
    public void delete(T t);
}
