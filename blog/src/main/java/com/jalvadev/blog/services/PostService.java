package com.jalvadev.blog.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jalvadev.blog.repositories.PostRepository;
import com.jalvadev.blog.models.Post;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> getAllPostByUserId(Long id){
        return postRepository.getPostListByUserId(id);
    }
}
