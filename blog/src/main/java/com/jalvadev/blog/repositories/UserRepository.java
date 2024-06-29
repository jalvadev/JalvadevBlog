package com.jalvadev.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jalvadev.blog.models.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
