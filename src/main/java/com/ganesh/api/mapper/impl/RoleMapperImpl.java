package com.ganesh.api.mapper.impl;

import com.ganesh.api.dto.RoleDto;
import com.ganesh.api.entity.Role;
import com.ganesh.api.mapper.RoleMapper;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-10-21T16:45:26+0530",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_102 (Oracle Corporation)"
)
public class RoleMapperImpl implements RoleMapper {

    @Override
    public RoleDto roleToDto(Role role) {
        if ( role == null ) {
            return null;
        }

        RoleDto roleDto = new RoleDto();

        return roleDto;
    }

    @Override
    public Role dtoToRole(RoleDto roleDto) {
        if ( roleDto == null ) {
            return null;
        }

        Role role = new Role();

        return role;
    }
}
