package com.ganesh.api.mapper;

import com.ganesh.api.dto.EmployeeDto;
import com.ganesh.api.entity.Employee;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

import org.mapstruct.factory.Mappers;

@Mapper(implementationPackage = "mapper.impl")
public interface EmployeeMapper {

    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);
    EmployeeDto employeeToDto(Employee employee);
    @InheritInverseConfiguration
    Employee dtoToEmployee(EmployeeDto employeeDto);
}
