package com.jalvadev.blog.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tag {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    public Tag(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void setId(int id) { this.id = id; }

    public int geId() { return this.id; }

    public void setName(String name) { this.name = name; }

    public String getName() { return this.name; }
}
