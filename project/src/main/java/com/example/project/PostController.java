package com.example.project;

import com.example.project.domain.Post;
import com.example.project.dto.request.PostRequest;
import com.example.project.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PostController {

    private final CreateService createService;
    private final UpdateService updateService;
    private final ReadService readService;
    private final DeleteService deleteService;
    private final UpdateExService updateExService;

    @PostMapping("/post")
    public void create(@RequestBody PostRequest postRequest) {
        createService.execute(postRequest);
    }

    @PutMapping("/put/{id}")
    public void update(@RequestBody PostRequest request, @PathVariable Long id) {
        updateService.execute(request, id);
    }

    @GetMapping("/get")
    public List<Post> read() {
        return readService.execute();
    }

    @PatchMapping("/patch/{id}")
    public void updateEx(@RequestBody PostRequest request, Long id) {
        updateExService.execute(request ,id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        deleteService.execute(id);
    }
}
