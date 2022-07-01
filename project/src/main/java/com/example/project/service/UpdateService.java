package com.example.project.service;


import com.example.project.domain.PostRepository;
import com.example.project.dto.request.PostRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class UpdateService {

    private final PostRepository postRepository;

    @Transactional
    public void execute(PostRequest request, Long id) {
        postRepository.findById(id)
                .map(newPost -> newPost.update(
                        request.getTitle(),
                        request.getContents()
                ))
                .orElseThrow(RuntimeException::new);
    }
}
