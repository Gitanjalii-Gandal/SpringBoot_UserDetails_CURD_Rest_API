package com.mydata.web.service;

import java.util.List;

import com.mydata.web.dto.UserDto;
import com.mydata.web.entity.User;
import com.mydata.web.exception.ResourceNotFoundException;

public interface UserService {

	UserDto createUser(UserDto userDto);
    UserDto getUserById(Long userId) throws ResourceNotFoundException; 
    List<UserDto> getAllUsers();
    UserDto updateUser(Long userId, UserDto userDto) throws ResourceNotFoundException;
    void deleteUser(Long userId) throws ResourceNotFoundException;
}


