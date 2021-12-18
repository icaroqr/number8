package com.number8.companyapp.controller;

import java.util.List;

import javax.validation.Valid;

import com.number8.companyapp.domain.Employee;
import com.number8.companyapp.dto.EmployeeDto;
import com.number8.companyapp.dto.EmployeeUpdateDto;
import com.number8.companyapp.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value="/")
    public ResponseEntity<List<EmployeeDto>> getAll(){
        return ResponseEntity.status(HttpStatus.FOUND).body(employeeService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<EmployeeDto> getById(@PathVariable int id) throws Exception{
        return ResponseEntity.status(HttpStatus.FOUND).body(employeeService.getById(id));
    }

    @PostMapping
    public ResponseEntity<Employee> save(@Valid @RequestBody EmployeeDto dto){
        return null;
    }

    @PatchMapping(value = "/{id}")
    public ResponseEntity<Employee> update(@PathVariable int id, @Valid @RequestBody EmployeeUpdateDto dto){
        return null;
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<EmployeeDto> delete(@PathVariable int id) throws Exception{
        return null;
    }
    
}
