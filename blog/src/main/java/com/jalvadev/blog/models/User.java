package com.jalvadev.blog.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;
    private String about;

    public User() {}
    public User(String userName, String about){
        this.userName = userName;
        this.about = about;
    }

    public Long getId(){ return this.id; }

    public void setId (Long id){ this.id =  id; }

    public String getUserName(){ return this.userName; }

    public void setUserName(String userName){ this.userName = userName; }

    public String getAbout(){ return this.about; }

    public void setAbout(String about) { this.about = about; }
}
