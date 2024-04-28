package ru.ngteam.toast_news.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.ngteam.toast_news.dto.SignUpDto;
import ru.ngteam.toast_news.dto.UserDto;
import ru.ngteam.toast_news.model.User;
import ru.ngteam.toast_news.repository.UserRepository;

@RestController
@RequiredArgsConstructor
public class AuthorizationController {
    private final UserRepository userRepository;

    @PostMapping("/sign-up")
    UserDto signUp(@RequestBody SignUpDto request) {
        User user = User.builder()
                .name(request.getName())
                .passwordHash(request.getPassword())
                .email(request.getEmail())
                .build();
        User saved = userRepository.save(user);
        return UserDto.builder()
                .id(saved.getId())
                .name(saved.getName())
                .email(saved.getEmail())
                .build();
    }
}