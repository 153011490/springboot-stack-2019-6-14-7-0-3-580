package com.tw.apistackbase.modle;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String gender;

    public static List<Employee> createEmployees(){
        List<Employee> employees=new ArrayList<>();
        Employee employee=new Employee();
        employee.setId(1);
        employee.setName("Trump");
        employee.setAge(18);
        employee.setGender("Female");
        employees.add(employee);
        return employees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
