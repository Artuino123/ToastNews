package ru.ngteam.toast_news.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ngteam.toast_news.dto.PostDto;
import ru.ngteam.toast_news.dto.UserDto;
import ru.ngteam.toast_news.mapper.PostMapper;
import ru.ngteam.toast_news.model.Post;
import ru.ngteam.toast_news.model.User;
import ru.ngteam.toast_news.repository.PostRepository;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class NewsController {
    private final PostRepository postRepository;
    private final PostMapper postMapper;

    @GetMapping("/news")
    List<PostDto> getPosts() {
        List<Post> posts = postRepository.findAll();
        return postMapper.toDtoList(posts);
    }
    /*
    @PostMapping("/news")
    PostDto createPost() {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
    */
}