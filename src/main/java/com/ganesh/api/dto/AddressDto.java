package com.ganesh.api.dto;

import lombok.Data;

@Data
public class AddressDto extends BaseDto {

    private String address1;

    private String address2;

    private String city;

    private String state;

    private String country;

    private String landmark;

    private String mobile;
}
