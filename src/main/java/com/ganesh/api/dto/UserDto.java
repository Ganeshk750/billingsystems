package com.ganesh.api.dto;

import com.ganesh.api.entity.Address;
import lombok.Data;

import java.util.List;

@Data
public class UserDto extends BaseDto {

    private String emailId;

    private String fullName;

    private List<Address> addressList;
}
