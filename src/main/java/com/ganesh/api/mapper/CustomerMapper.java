package com.ganesh.api.mapper;

import com.ganesh.api.dto.CustomerDto;
import com.ganesh.api.entity.Customer;
import com.ganesh.api.entity.Employee;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(implementationPackage = "mapper.impl")
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);
    CustomerDto customerToDto(Customer customer);
    @InheritInverseConfiguration
    Employee dtoToCustomer(CustomerDto customerDto);
}
