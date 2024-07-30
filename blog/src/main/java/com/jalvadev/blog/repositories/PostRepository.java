package com.jalvadev.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jalvadev.blog.models.Post;

public interface PostRepository extends JpaRepository<Post, String>{

    List<Post> getPostListByUserId(Long userId);
}
