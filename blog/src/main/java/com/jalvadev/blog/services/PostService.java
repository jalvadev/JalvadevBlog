package com.jalvadev.blog.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jalvadev.blog.repositories.PostRepository;
import com.jalvadev.blog.dtos.PostCompleteDTO;
import com.jalvadev.blog.mappers.PostMapper;
import com.jalvadev.blog.models.Post;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private PostMapper postMapper;

    public List<Post> getAllPostByUserId(Long id){
        return postRepository.getPostListByUserId(id);
    }

    public PostCompleteDTO getPostById(String id){
        Optional<Post> post = postRepository.findById(id);
        return postMapper.postToPostCompleteDTO(post.get());
    }

    public void savePost(Post post){
        postRepository.save(post);
    }
}
