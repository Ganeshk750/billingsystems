package com.ganesh.api.mapper.impl;

import com.ganesh.api.dto.EmployeeDto;
import com.ganesh.api.entity.Employee;
import com.ganesh.api.mapper.EmployeeMapper;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-10-21T16:45:26+0530",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_102 (Oracle Corporation)"
)
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public EmployeeDto employeeToDto(Employee employee) {
        if ( employee == null ) {
            return null;
        }

        EmployeeDto employeeDto = new EmployeeDto();

        return employeeDto;
    }

    @Override
    public Employee dtoToEmployee(EmployeeDto employeeDto) {
        if ( employeeDto == null ) {
            return null;
        }

        Employee employee = new Employee();

        return employee;
    }
}
