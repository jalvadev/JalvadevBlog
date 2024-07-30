package com.jalvadev.blog.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.jalvadev.blog.dtos.PostCompleteDTO;
import com.jalvadev.blog.models.Post;
import com.jalvadev.blog.models.User;
import com.jalvadev.blog.services.PostService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@RestController
@RequestMapping("/post")
public class PostController {
 
    @Autowired
    private PostService postService;

    @GetMapping("/{id}")
    public PostCompleteDTO getPostDetail(@PathVariable("id") String id){

        return postService.getPostById(id);
    }
}
