package com.jalvadev.blog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jalvadev.blog.repositories.UserRepository;
import com.jalvadev.blog.models.User;

@Service
public class UserService {
    private static final Long DEFAULT_USER_ID = 1l;

    @Autowired
    private UserRepository userRepository;

    public User getDefaultUser(){
        
        return userRepository.findById(DEFAULT_USER_ID).get();
    }

    public User createUser(User user){
        return userRepository.save(user);
    }
}
