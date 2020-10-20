package com.ganesh.api.mapper.impl;

import com.ganesh.api.dto.UserDto;
import com.ganesh.api.entity.Address;
import com.ganesh.api.entity.Role;
import com.ganesh.api.entity.User;
import com.ganesh.api.mapper.UserMapper;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-10-18T12:46:37+0530",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_102 (Oracle Corporation)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public User userDTOtoUser(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        User user = new User();

        user.setEmailId( userDto.getEmailId() );
        user.setFirstName( userDto.getFirstName() );
        user.setMiddleName( userDto.getMiddleName() );
        user.setLastName( userDto.getLastName() );
        user.setMobileNo( userDto.getMobileNo() );
        List<Address> list = userDto.getAddressList();
        if ( list != null ) {
            user.setAddressList( new ArrayList<Address>( list ) );
        }
        List<Role> list1 = userDto.getRoles();
        if ( list1 != null ) {
            user.setRoles( new ArrayList<Role>( list1 ) );
        }

        return user;
    }

    @Override
    public UserDto userToUserDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setEmailId( user.getEmailId() );
        userDto.setFirstName( user.getFirstName() );
        userDto.setMiddleName( user.getMiddleName() );
        userDto.setLastName( user.getLastName() );
        userDto.setMobileNo( user.getMobileNo() );
        List<Address> list = user.getAddressList();
        if ( list != null ) {
            userDto.setAddressList( new ArrayList<Address>( list ) );
        }
        List<Role> list1 = user.getRoles();
        if ( list1 != null ) {
            userDto.setRoles( new ArrayList<Role>( list1 ) );
        }

        return userDto;
    }
}
