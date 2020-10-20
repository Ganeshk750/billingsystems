package com.ganesh.api.mapper;

import com.ganesh.api.dto.UserDto;
import com.ganesh.api.entity.User;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(implementationPackage = "mapper.impl")
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    User userDTOtoUser(UserDto userDto);
    @InheritInverseConfiguration
    UserDto userToUserDTO(User user);

}
