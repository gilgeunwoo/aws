package com.example.project.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class PostResponse {

    private String title;
    private String contents;
    private String a;
}
