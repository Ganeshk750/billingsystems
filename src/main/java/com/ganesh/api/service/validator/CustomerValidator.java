package com.ganesh.api.service.validator;


import com.ganesh.api.common.enums.UserType;
import com.ganesh.api.dto.UserDto;
import com.ganesh.api.exception.InvalidInputException;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerValidator {

    private List<String> validationMessages;
    public void validate(UserDto userDto){
        validationMessages = new ArrayList<>();
        if(userDto != null && userDto.getType().equalsIgnoreCase(UserType.CUSTOMER.name())){
            if(StringUtils.isEmpty(userDto.getMobileNo())){
                validationMessages.add("Mobile No Can't be empty");
            }
        }
        if(!validationMessages.isEmpty()){
           throw new InvalidInputException(validationMessages);
        }
    }
}
