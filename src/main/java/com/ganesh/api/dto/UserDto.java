package com.ganesh.api.dto;

import com.ganesh.api.entity.Address;
import com.ganesh.api.entity.Role;
import lombok.Data;

import java.util.List;

@Data
public class UserDto extends BaseDto {

    private String emailId;

    private String firstName;

    private String middleName;

    private String lastName;

    private String mobileNo;

    private List<Address> addressList;

    private List<Role> roles;
}
