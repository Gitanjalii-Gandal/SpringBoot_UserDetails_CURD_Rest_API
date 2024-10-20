package com.mydata.web.mapper;

import com.mydata.web.dto.UserDto;
import com.mydata.web.entity.User;

public class UserMapper {

	public static UserDto mapToUserDto(User user) {
        return new UserDto(
            user.getId(),
            user.getFirst_Name(),
            user.getLast_Name(),
            user.getPhone_Number(),
            user.getEmail_Id(),
            user.getAddress()
        );
    }

    public static User mapToUser(UserDto userDto) {
        return new User(
            userDto.getId(),
            userDto.getFirst_Name(),
            userDto.getLast_Name(),
            userDto.getPhone_Number(),
            userDto.getEmail_Id(),
            userDto.getAddress()
        );
    }
}
