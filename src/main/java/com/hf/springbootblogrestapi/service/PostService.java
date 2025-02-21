package com.hf.springbootblogrestapi.service;

import com.hf.springbootblogrestapi.DTOS.PostDTO;
import com.hf.springbootblogrestapi.DTOS.PostResponse;

import java.util.List;

public interface PostService {
    PostDTO creatPost(PostDTO postDTO);

    List<PostDTO> createMultiplePosts(List<PostDTO> postDTOs);

    PostResponse getAllPosts(int pageNo, int pageSize,String sortBy,String sortDir);

    PostDTO getPostbyId(long Id);

    PostDTO UpdatePostById(long id, PostDTO postDTO);

    void deletePost(long id);

}
