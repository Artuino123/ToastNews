package ru.ngteam.toast_news.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.ngteam.toast_news.dto.SignInDto;
import ru.ngteam.toast_news.dto.SignUpDto;
import ru.ngteam.toast_news.dto.TokenDto;
import ru.ngteam.toast_news.exceptions.AuthException;
import ru.ngteam.toast_news.mapper.UserMapper;
import ru.ngteam.toast_news.model.User;
import ru.ngteam.toast_news.repository.UserRepository;
import ru.ngteam.toast_news.services.AuthorizationService;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AuthorizationServiceImpl implements AuthorizationService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public TokenDto signUp(SignUpDto request) throws AuthException {
        if(userRepository.existsByName(request.getName())) {
            throw new AuthException("Name " + request.getName() + " already taken");
        }
        User user = userMapper.toUser(request);
        String token = UUID.randomUUID().toString();
        user.setToken(token);
        userRepository.save(user);
        return new TokenDto(token);
    }

    @Override
    public TokenDto signIn(SignInDto request) throws AuthException {
        Optional<User> optionalUser = userRepository.findByEmail(request.getEmail());
        if (optionalUser.isEmpty()) {
            throw new AuthException("User with email " + request.getEmail() + " not found");
        }
        User user = optionalUser.get();
        String token = UUID.randomUUID().toString();
        user.setToken(token);
        userRepository.save(user);
        return new TokenDto(token);
    }
}