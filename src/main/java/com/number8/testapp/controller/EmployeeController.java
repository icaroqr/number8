package com.number8.testapp.controller;

import java.util.List;


import com.number8.testapp.domain.Employee;
import com.number8.testapp.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value="/")
    public ResponseEntity<List<Employee>> getAll(){
        return ResponseEntity.status(HttpStatus.FOUND).body(employeeService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Employee> getById(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.FOUND).body(employeeService.getById(id));
    }

    // @PostMapping
    // public ResponseEntity<Employee> save(@RequestBody EmployeeDto dto){
    //     return null;
    // }
    
}
