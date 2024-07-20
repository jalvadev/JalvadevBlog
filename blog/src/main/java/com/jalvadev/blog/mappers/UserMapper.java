package com.jalvadev.blog.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.jalvadev.blog.dtos.UserDTO;
import com.jalvadev.blog.models.User;

@Mapper(componentModel =  "spring")
public abstract class UserMapper {
    
    @Mapping(target = "userId", source = "id")
    public abstract UserDTO userToUserDTO(User user);
}
