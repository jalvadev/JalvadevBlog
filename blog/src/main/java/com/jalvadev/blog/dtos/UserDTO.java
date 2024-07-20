package com.jalvadev.blog.dtos;

import java.util.List;

public class UserDTO {

    private  Long userId;

    private String userName;
    
    private String about;

    private List<PostSimpleDTO> posts;

    public UserDTO(Long userId, String userName, String about, List<PostSimpleDTO> posts){
        this.userId = userId;
        this.userName = userName;
        this.about = about;
        this.posts = posts;
    }


    public Long getUserId(){ return this.userId; }

    public String getUserName(){ return this.userName; }

    public String getAbout(){ return this.about; }

    public List<PostSimpleDTO> getPosts() { return posts; }
}
