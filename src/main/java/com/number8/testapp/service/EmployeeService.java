package com.number8.testapp.service;

import java.util.List;

import com.number8.testapp.domain.Employee;
import com.number8.testapp.respository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee getById(int id){
        return employeeRepository.findById(id).get();
    }

    public List<Employee> findAll(){
        //List<Employee> employees = employeeRepository.findAll();
        return employeeRepository.findAll();
    }
}
