package com.hf.springbootblogrestapi.DTOS;

import com.hf.springbootblogrestapi.entity.Comment;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentDTO {
    private long id;
    @NotEmpty
    @Size(max = 255,min = 5 ,message = "Name should be between 5 and 255 characters")
    private String name;
    @NotEmpty
    @Size(max = 255,min = 10 ,message = "Body should be between 10 and 255 characters")
    private String body;
    @NotEmpty
    @Email
    @Size(max = 255,message = "Email shouldn't exceed 255 characters")
    private String email;
    private Long postId;

    public CommentDTO(Comment comment){
        this.id = comment.getId();
        this.name = comment.getName();
        this.body = comment.getBody();
        this.email = comment.getEmail();
        this.postId = comment.getPost().getId();
    }

}
