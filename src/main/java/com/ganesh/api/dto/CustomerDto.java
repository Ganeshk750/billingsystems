package com.ganesh.api.dto;

import com.ganesh.api.entity.User;
import lombok.Data;

@Data
public class CustomerDto extends BaseDto {

    private String fullName;
    private String customerCode;
    private User user;

}
