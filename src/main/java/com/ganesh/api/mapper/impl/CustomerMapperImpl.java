package com.ganesh.api.mapper.impl;

import com.ganesh.api.dto.CustomerDto;
import com.ganesh.api.entity.Customer;
import com.ganesh.api.entity.Employee;
import com.ganesh.api.mapper.CustomerMapper;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-10-21T16:45:25+0530",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_102 (Oracle Corporation)"
)
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public CustomerDto customerToDto(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerDto customerDto = new CustomerDto();

        return customerDto;
    }

    @Override
    public Employee dtoToCustomer(CustomerDto customerDto) {
        if ( customerDto == null ) {
            return null;
        }

        Employee employee = new Employee();

        return employee;
    }
}
