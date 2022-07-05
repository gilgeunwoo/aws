package com.example.project.service;

import com.example.project.domain.Post;
import com.example.project.domain.PostRepository;
import com.example.project.api.dto.request.PostRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CreateService {

    private final PostRepository postRepository;

    public void execute(PostRequest postRequest){
        postRepository.save(Post.builder()
                        .content(postRequest.getContents())
                        .title(postRequest.getTitle())
                .build());
    }
}
