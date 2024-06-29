package com.jalvadev.blog.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;
    private String about;

    @OneToMany
    private List<Post> posts;

    public User() {}

    public Long getId(){ return this.id; }
    public void setId (Long id){ this.id =  id; }

    public String getUserName(){ return this.userName; }
    public void setUserName(String userName){ this.userName = userName; }

    public String getAbout(){ return this.about; }
    public void setAbout(String about) { this.about = about; }

    public List<Post> getPosts() { return posts; }
    public void setPosts(List<Post> posts) { this.posts = posts; }
}
