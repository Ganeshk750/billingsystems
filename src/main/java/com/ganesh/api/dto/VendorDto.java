package com.ganesh.api.dto;

import com.ganesh.api.entity.User;
import lombok.Data;

@Data
public class VendorDto extends BaseDto {

    private String fullName;
    private String vendorCode;
    private User user;
}
