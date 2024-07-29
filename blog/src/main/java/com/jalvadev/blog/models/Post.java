package com.jalvadev.blog.models;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Post {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String title;
    private String postContent;
    private String imagePath;

    @ManyToOne
    @JoinColumn(name="user_id", nullable = false)
    private User user;

    @ManyToMany
    private Tag[] tag;


    public Post(){}

    public void setId(UUID id){ this.id = id; }
    public UUID getId(){ return this.id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getPostContent() { return postContent; }
    public void setPostContent(String postContent) { this.postContent = postContent; }

    public String getImagePath() { return imagePath; }
    public void setImagePath(String imagePath) { this.imagePath = imagePath; }

    public Tag[] getTag() { return this.tag; }
    public void setTag(Tag[] tag) { this.tag = tag; }
}
