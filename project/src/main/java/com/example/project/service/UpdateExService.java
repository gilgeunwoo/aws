package com.example.project.service;

import com.example.project.domain.Post;
import com.example.project.domain.PostRepository;
import com.example.project.dto.request.PostRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UpdateExService {

    private final PostRepository postRepository;

    public void execute(PostRequest postRequest, Long id) {
        postRepository.deleteById(id);
        postRepository.save(Post.builder()
                .title(postRequest.getTitle())
                .content(postRequest.getContents())
                .build());

    }
}
