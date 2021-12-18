package com.number8.companyapp.dto;

import java.sql.Timestamp;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@Data
public class EmployeeUpdateDto {
    
    @NotBlank
    private int id;

    @NotBlank
    private int idType;

    @NotBlank
    private String nameType;
    
    @NotBlank
    private String name;

    private String address;

    private String telephone;

    private Timestamp employmentDate;

    
}
