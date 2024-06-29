package com.jalvadev.blog;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jalvadev.blog.models.User;
import com.jalvadev.blog.services.UserService;

@SpringBootApplication
@RestController
public class BlogApplication {

	@Autowired
	UserService service;
	
	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}

	@GetMapping("/")
	public User index(){
		User user = service.getDefaultUser();

		return user;
	}	
}
