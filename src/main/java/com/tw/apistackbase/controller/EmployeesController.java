package com.tw.apistackbase.controller;

import com.tw.apistackbase.modle.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeesController {

    private List<Employee> employees= Employee.createEmployees();

    @PostMapping
    public List<Employee> addEmployee(@RequestBody Employee employee){
        employees.add(employee);
        return employees;
    }

    @DeleteMapping
    public List<Employee> deleteEmployee(@RequestParam int id){
        employees.forEach(employee -> {
            if(employee.getId()==id)employees.remove(employee);
        });
        return employees;
    }




}
