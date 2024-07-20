package com.jalvadev.blog.dtos;

import java.util.UUID;

public class PostSimpleDTO {
    
    private UUID id;

    private String title;

    private String imagePath;

    public PostSimpleDTO(UUID id, String title, String imagePath){
        this.id = id;
        this.title = title;
        this.imagePath = imagePath;
    }

    public UUID getId(){ return this.id; }
    
    public String getTitle() { return title; }

    public String getImagePath() { return imagePath; }
}
