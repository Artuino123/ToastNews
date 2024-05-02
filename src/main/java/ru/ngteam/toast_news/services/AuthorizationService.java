package ru.ngteam.toast_news.services;

import ru.ngteam.toast_news.dto.SignInDto;
import ru.ngteam.toast_news.dto.SignUpDto;
import ru.ngteam.toast_news.dto.TokenDto;
import ru.ngteam.toast_news.dto.UserDto;
import ru.ngteam.toast_news.exceptions.AuthException;

public interface AuthorizationService {
    TokenDto signUp(SignUpDto request) throws AuthException;
    TokenDto signIn(SignInDto request) throws AuthException;
    UserDto getProfile();
}