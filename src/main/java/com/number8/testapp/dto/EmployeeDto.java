package com.number8.testapp.dto;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Data
public class EmployeeDto {
    
    private int id;

    private int id_type;
    
    private String name;

    private String address;

    private String telephone;

    private Timestamp employmentDate;
    
}
