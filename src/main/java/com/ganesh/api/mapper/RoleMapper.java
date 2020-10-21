package com.ganesh.api.mapper;

import com.ganesh.api.dto.RoleDto;
import com.ganesh.api.entity.Role;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(implementationPackage = "mapper.impl")
public interface RoleMapper {

    RoleMapper INSTANCE = Mappers.getMapper(RoleMapper.class);
    RoleDto roleToDto(Role role);
    @InheritInverseConfiguration
    Role dtoToRole(RoleDto roleDto);
}
