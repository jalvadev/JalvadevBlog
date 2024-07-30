package com.jalvadev.blog.dtos;

public class PostCompleteDTO {
    
    private String id;

    private String title;

    private String imagePath;

    private String postContent;

    public PostCompleteDTO(String id, String title, String imagePath, String postContent){
        this.id = id;
        this.title = title;
        this.imagePath = imagePath;
        this.postContent = postContent;
    }

    public String getId(){ return this.id; }
    
    public String getTitle() { return title; }

    public String getImagePath() { return imagePath; }

    public String getPostContent() { return postContent; }
}
