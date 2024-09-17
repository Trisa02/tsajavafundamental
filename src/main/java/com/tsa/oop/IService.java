package com.tsa.oop;
/*
IntelliJ IDEA 2023.3.1 (Ultimate Edition)
Build #IU-233.11799.300, built on December 12, 2023
@Author PT.DIKA a.k.a. Trisa Sarifatul Anisak
Java Developer
Created on 09/09/2024 21:07
@Last Modified 09/09/2024 21:07
Version 1.0
*/

import java.util.List;

public interface IService<T> {
    public Boolean insert(T t);//001-010
    public Boolean update(Long id, T t);//011-020
    public Boolean delete(Long id);//021-030
    public T findById(Long id);//031-040
    public List<T> findByParam(String value, String columnName);//041-050
    public void printToExcel(String value,String columnName);//051-060
}
