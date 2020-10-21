package com.ganesh.api.mapper;

import com.ganesh.api.dto.BaseDto;
import com.ganesh.api.entity.BaseObject;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(implementationPackage = "mapper.impl")
public interface BaseMapper {

    BaseMapper INSTANCE = Mappers.getMapper(BaseMapper.class);
    BaseDto baseObjectToDto(BaseObject baseObject);
    @InheritInverseConfiguration
    BaseObject dtoToEmployee(BaseDto baseDto);
}
