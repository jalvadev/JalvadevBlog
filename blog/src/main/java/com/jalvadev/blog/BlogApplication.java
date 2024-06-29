package com.jalvadev.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jalvadev.blog.models.User;

@SpringBootApplication
@RestController
public class BlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}

	@GetMapping("/hello")
	public boolean hello(@RequestParam(value = "name", defaultValue = "world") String name){
		User user = new User(1, "Jose");
		User user2 = new User(1, "Jose");

		user.toString();

		return user.equals(user2);
	}
}
