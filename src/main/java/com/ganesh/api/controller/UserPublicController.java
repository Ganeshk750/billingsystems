package com.ganesh.api.controller;

import com.ganesh.api.common.enums.UserType;
import com.ganesh.api.dto.UserDto;
import com.ganesh.api.message.ResponseMessage;
import com.ganesh.api.service.RegistrationService;
import com.ganesh.api.service.validator.CustomerValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.validation.Valid;

@RestController
@RequestMapping("api/public/users")
@Validated
public class UserPublicController {

    private RegistrationService registrationService;

    private CustomerValidator customerValidator;

    @Autowired
    public UserPublicController(RegistrationService registrationService, CustomerValidator customerValidator) {
        this.registrationService = registrationService;
        this.customerValidator = customerValidator;
    }

    @PostMapping("/employees") // http://localhost:9090/api/public/users/employees
    public ResponseEntity<ResponseMessage<?>> updateEmployee(@Valid @RequestBody UserDto requestBody) throws Exception  {
        requestBody.setType(UserType.EMPLOYEE.name());
        ResponseMessage responseMessage = registrationService.doRegistration(requestBody);
        return new ResponseEntity<ResponseMessage<?>>(responseMessage, HttpStatus.CREATED);
    }

    @PostMapping("/customers") // http://localhost:9090/api/public/users/customers
    public ResponseEntity<ResponseMessage<?>> updateCustomer(@RequestBody UserDto requestBody) throws Exception  {
        requestBody.setType(UserType.CUSTOMER.name());
        customerValidator.validate(requestBody);
        ResponseMessage responseMessage = registrationService.doRegistration(requestBody);
        return new ResponseEntity<ResponseMessage<?>>(responseMessage, HttpStatus.CREATED);
    }

    @PostMapping("/vendors")
    public ResponseEntity<ResponseMessage<?>> updateVendor(@Valid @RequestBody UserDto requestBody) throws Exception  {
        requestBody.setType(UserType.VENDOR.name());
        ResponseMessage responseMessage = registrationService.doRegistration(requestBody);
        return new ResponseEntity<ResponseMessage<?>>(responseMessage, HttpStatus.CREATED);
    }
}
