package com.ganesh.api.mapper.impl;

import com.ganesh.api.dto.VendorDto;
import com.ganesh.api.entity.Vendor;
import com.ganesh.api.mapper.VendorMapper;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-10-21T16:45:25+0530",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_102 (Oracle Corporation)"
)
public class VendorMapperImpl implements VendorMapper {

    @Override
    public Vendor vendorDTOToUser(VendorDto vendorDto) {
        if ( vendorDto == null ) {
            return null;
        }

        Vendor vendor = new Vendor();

        return vendor;
    }

    @Override
    public VendorDto vendorTOVendorDTO(Vendor vendor) {
        if ( vendor == null ) {
            return null;
        }

        VendorDto vendorDto = new VendorDto();

        return vendorDto;
    }
}
