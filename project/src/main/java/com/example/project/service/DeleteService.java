package com.example.project.service;

import com.example.project.domain.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class DeleteService {

    private final PostRepository postRepository;

    @Transactional
    public void execute(Long id) {
        postRepository.deleteById(id);
    }
}
