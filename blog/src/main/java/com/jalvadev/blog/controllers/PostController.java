package com.jalvadev.blog.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.jalvadev.blog.bases.Result;
import com.jalvadev.blog.dtos.PostCompleteDTO;
import com.jalvadev.blog.dtos.PostSimpleDTO;
import com.jalvadev.blog.services.PostService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {
 
    @Autowired
    private PostService postService;

    @GetMapping("/{id}")
    public Result<PostCompleteDTO> getPostDetail(@PathVariable("id") String id){

        return postService.getPostById(id);
    }

    @GetMapping("/posts")
	public Result<List<PostSimpleDTO>> getPosts() {
		Long id = 1l;
		return postService.getAllPostByUserId(id);
	}
}
