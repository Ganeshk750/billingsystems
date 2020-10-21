package com.ganesh.api.mapper;

import com.ganesh.api.dto.VendorDto;
import com.ganesh.api.entity.Vendor;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(implementationPackage = "mapper.impl")
public interface VendorMapper {
   VendorMapper INSTANCE = Mappers.getMapper(VendorMapper.class);
   Vendor vendorDTOToUser(VendorDto vendorDto);
   @InheritInverseConfiguration
   VendorDto vendorTOVendorDTO(Vendor vendor);
}

