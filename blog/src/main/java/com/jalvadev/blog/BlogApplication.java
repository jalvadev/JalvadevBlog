package com.jalvadev.blog;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jalvadev.blog.dtos.UserDTO;
import com.jalvadev.blog.models.Post;
import com.jalvadev.blog.services.PostService;
import com.jalvadev.blog.services.UserService;


@SpringBootApplication
@RestController
public class BlogApplication {

	@Autowired
	UserService service;
	
	@Autowired
	PostService postService;

	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}

	@GetMapping("/")
	public UserDTO index(){
		UserDTO user = service.getDefaultUser();

		return user;
	}	

	@GetMapping("/posts")
	public List<Post> getPosts() {
		Long id = 1l;
		return postService.getAllPostByUserId(id);
	}
	
}
