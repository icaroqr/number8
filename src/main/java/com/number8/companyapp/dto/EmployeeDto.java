package com.number8.companyapp.dto;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.number8.companyapp.domain.Employee;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@Data
public class EmployeeDto {
    
    private int id;

    @NotBlank
    private Integer idType;

    @NotBlank
    private String nameType;
    
    @NotBlank
    private String name;

    private String address;

    private String telephone;

    private Timestamp employmentDate;

    public static List<EmployeeDto> toListDto(List<Employee> employees) {
        List<EmployeeDto> list = new ArrayList<EmployeeDto>();
        for (Employee employee : employees) {
            list.add(toDto(employee));
        }
        return list;
    }

    public static EmployeeDto toDto(Employee employee) {
        return new EmployeeDto(
            employee.getId(), 
            employee.getType() != null ? employee.getType().getId() : null, 
            employee.getType() != null ? employee.getType().getName() : null, 
            employee.getName(), employee.getAddress(), employee.getTelephone(), employee.getEmploymentDate());
    }
    
}
