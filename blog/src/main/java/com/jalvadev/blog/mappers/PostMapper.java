package com.jalvadev.blog.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.jalvadev.blog.dtos.PostCompleteDTO;
import com.jalvadev.blog.dtos.PostSimpleDTO;
import com.jalvadev.blog.models.Post;

@Mapper(componentModel =  "spring")
public abstract class PostMapper {
    
    @Mapping(target = "id", source = "id")
    @Mapping(target = "title", source = "title")
    @Mapping(target = "imagePath", source = "imagePath")
    public abstract PostSimpleDTO postToPostSimpleDTO(Post post);

    public abstract PostCompleteDTO postToPostCompleteDTO(Post post);

    public abstract List<PostSimpleDTO> postListToPostSimpleDTOList(List<Post> post);
}
