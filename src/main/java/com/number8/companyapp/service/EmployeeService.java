package com.number8.companyapp.service;

import java.util.List;
import java.util.Optional;

import com.number8.companyapp.domain.Employee;
import com.number8.companyapp.dto.EmployeeDto;
import com.number8.companyapp.exception.NotFoundException;
import com.number8.companyapp.respository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    
    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeDto getById(int id) throws Exception{
        Optional<Employee> employee = employeeRepository.findById(id);
        return EmployeeDto.toDto(employee.orElseThrow(() -> new NotFoundException("Employee not found for id: "+id)));
    }

    public List<EmployeeDto> findAll(){
        List<Employee> employees = employeeRepository.findAll();
        return EmployeeDto.toListDto(employees);
    }
}
