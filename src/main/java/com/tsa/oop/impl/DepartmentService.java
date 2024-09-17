package com.tsa.oop.impl;
/*
IntelliJ IDEA 2023.3.1 (Ultimate Edition)
Build #IU-233.11799.300, built on December 12, 2023
@Author PT.DIKA a.k.a. Trisa Sarifatul Anisak
Java Developer
Created on 09/09/2024 21:11
@Last Modified 09/09/2024 21:11
Version 1.0
*/

import com.tsa.oop.IService;
import com.tsa.oop.model.Department;

import java.util.List;

public class DepartmentService implements IService<Department> {

    @Override
    public Boolean insert(Department department) {
//        validasi
        if(department == null){
            System.out.println("Department is null H01V001");
        }
//        500 -> errorCode :

        //validasi
        if(department.getId() == 1212L){
            System.out.println("Department is null H01V002");
        }

        try{

        }catch(Exception e){
            System.out.println(" Error H01E001 "+e.getMessage());
        }

        return true;
    }

    @Override
    public Boolean update(Long id, Department department) {
        return null;
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }

    @Override
    public Department findById(Long id) {
        return null;
    }

    @Override
    public List<Department> findByParam(String value, String columnName) {
        return List.of();
    }

    @Override
    public void printToExcel(String value, String columnName) {

    }
}
