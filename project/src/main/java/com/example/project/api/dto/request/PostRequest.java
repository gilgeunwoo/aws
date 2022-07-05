package com.example.project.api.dto.request;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PostRequest {

    private String title;
    private String contents;
}
