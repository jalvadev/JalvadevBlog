package com.jalvadev.blog.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String userName;
    private String about;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Post> posts;

    public User() {}

    public Long getId(){ return this.userId; }
    public void setId (Long userId){ this.userId =  userId; }

    public String getUserName(){ return this.userName; }
    public void setUserName(String userName){ this.userName = userName; }

    public String getAbout(){ return this.about; }
    public void setAbout(String about) { this.about = about; }

    public List<Post> getPosts() { return posts; }
    public void setPosts(List<Post> posts) { this.posts = posts; }
}
