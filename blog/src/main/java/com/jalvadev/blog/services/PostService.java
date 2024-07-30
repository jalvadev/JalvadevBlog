package com.jalvadev.blog.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jalvadev.blog.repositories.PostRepository;
import com.jalvadev.blog.bases.Result;
import com.jalvadev.blog.dtos.PostCompleteDTO;
import com.jalvadev.blog.dtos.PostSimpleDTO;
import com.jalvadev.blog.mappers.PostMapper;
import com.jalvadev.blog.models.Post;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private PostMapper postMapper;

    public Result<List<PostSimpleDTO>> getAllPostByUserId(Long id){
        try{
            List<Post> posts = postRepository.getPostListByUserId(id);
            List<PostSimpleDTO> postSimpleDTOs = postMapper.postListToPostSimpleDTOList(posts);

            return Result.Success("null", postSimpleDTOs);
        }catch(Exception e){
            return Result.Error("null", null);
        }
    }

    public Result<PostCompleteDTO> getPostById(String id){
        try{
            Optional<Post> post = postRepository.findById(id);
            PostCompleteDTO postCompleteDTO = postMapper.postToPostCompleteDTO(post.get());

            return Result.Success("", postCompleteDTO);
        }catch(Exception e){
            return Result.Error("", null);
        }
    }

    public void savePost(Post post){
        postRepository.save(post);
    }
}
