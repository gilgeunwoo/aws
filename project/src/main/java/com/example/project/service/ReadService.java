package com.example.project.service;

import com.example.project.domain.Post;
import com.example.project.domain.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ReadService {

    private final PostRepository postRepository;

    public List<Post> execute() {
        return postRepository.findAll();
    }
}
