package ru.ngteam.toast_news.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import ru.ngteam.toast_news.dto.SignInDto;
import ru.ngteam.toast_news.dto.SignUpDto;
import ru.ngteam.toast_news.dto.TokenDto;
import ru.ngteam.toast_news.dto.UserDto;
import ru.ngteam.toast_news.exceptions.AuthException;
import ru.ngteam.toast_news.model.User;
import ru.ngteam.toast_news.services.AuthorizationService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthorizationController {
    private final AuthorizationService authorizationService;

    @PostMapping("/sign-up")
    TokenDto signUp(@RequestBody SignUpDto request) throws AuthException {
        return authorizationService.signUp(request);
    }
    @PostMapping("/sign-in")
    TokenDto signIn(@RequestBody SignInDto request) throws AuthException {
        return authorizationService.signIn(request);
    }
}