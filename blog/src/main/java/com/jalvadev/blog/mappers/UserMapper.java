package com.jalvadev.blog.mappers;

import org.mapstruct.Mapper;

import com.jalvadev.blog.dtos.UserDTO;
import com.jalvadev.blog.models.User;

@Mapper(componentModel =  "spring")
public abstract class UserMapper {
    
    public abstract UserDTO userToUserDTO(User user);
}
