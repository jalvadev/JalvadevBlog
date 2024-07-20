package com.jalvadev.blog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jalvadev.blog.repositories.UserRepository;
import com.jalvadev.blog.dtos.UserDTO;
import com.jalvadev.blog.mappers.UserMapper;
import com.jalvadev.blog.models.User;

@Service
public class UserService {
    private static final Long DEFAULT_USER_ID = 1l;

    @Autowired
    private UserRepository userRepository;

    @Autowired
	UserMapper userMapper;

    public UserDTO getDefaultUser(){
        User user = userRepository.findById(DEFAULT_USER_ID).get();
        UserDTO userDTO = userMapper.userToUserDTO(user);
        return userDTO;
    }

    public User createUser(User user){
        return userRepository.save(user);
    }
}
