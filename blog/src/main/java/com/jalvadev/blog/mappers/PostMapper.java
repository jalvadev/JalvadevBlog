package com.jalvadev.blog.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.jalvadev.blog.dtos.PostSimpleDTO;
import com.jalvadev.blog.models.Post;

@Mapper(componentModel =  "spring")
public abstract class PostMapper {
    
    @Mapping(target = "id", source = "id")
    @Mapping(target = "title", source = "title")
    @Mapping(target = "imagePath", source = "imagePath")
    public abstract PostSimpleDTO postToPostSimpleDTO(Post post);
}
