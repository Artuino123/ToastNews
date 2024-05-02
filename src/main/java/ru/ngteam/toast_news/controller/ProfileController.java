package ru.ngteam.toast_news.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ngteam.toast_news.dto.UserDto;
import ru.ngteam.toast_news.services.AuthorizationService;

@RestController
@RequiredArgsConstructor
public class ProfileController {
    private final AuthorizationService authorizationService;

    @GetMapping("/profile")
    UserDto getProfile() {
        return authorizationService.getProfile();
    }
}
