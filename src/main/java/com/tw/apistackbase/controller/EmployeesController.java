package com.tw.apistackbase.controller;

import com.tw.apistackbase.modle.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

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

    @PutMapping
    public List<Employee> putEmployee(@RequestBody Employee employee){
        return employees.stream().map(item->item.getId()==employee.getId()?employee:item).collect(Collectors.toList());
    }

    @GetMapping
    public List<Employee> getAllEmployee(){
        return employees;
    }



}
