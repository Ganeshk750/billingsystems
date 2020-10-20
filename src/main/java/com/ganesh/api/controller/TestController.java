package com.ganesh.api.controller;

import com.ganesh.api.dto.UserDto;
import com.ganesh.api.entity.User;
import com.ganesh.api.mapper.UserMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class TestController {

    @PostMapping("/mapper")
    public ResponseEntity<Void> mapperTesting(@RequestBody UserDto userDto){
        User user = UserMapper.INSTANCE.userDTOtoUser(userDto);
        System.out.println("Entity Class");
        System.out.println("Entity First Name "+ user.getFirstName());
        System.out.println("Entity Last Name "+ user.getLastName());
        UserDto userDto1 = UserMapper.INSTANCE.userToUserDTO(user);
        System.out.println("DTO Class..........");
        System.out.println("DTO FirstName "+ userDto1.getFirstName());
        System.out.println("DTO LastName "+ userDto1.getLastName());
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}
