package ru.ngteam.toast_news.mapper;

import org.springframework.stereotype.Service;
import ru.ngteam.toast_news.dto.SignUpDto;
import ru.ngteam.toast_news.dto.UserDto;
import ru.ngteam.toast_news.model.User;

import java.util.UUID;

@Service
public class UserMapper {
    public UserDto toDto(User user) {
        return UserDto.builder()
                .id(user.getId())
                .name(user.getName())
                .email(user.getEmail())
                .avatarId(UUID.randomUUID())
                .build();
    }

    public User toUser(UserDto dto) {
        return User.builder()
                .id(dto.getId())
                .email(dto.getEmail())
                .avatarId(dto.getAvatarId())
                .build();
    }

    public User toUser(SignUpDto signUpDto) {
        return User.builder()
                .name(signUpDto.getName())
                .email(signUpDto.getEmail())
                .passwordHash(signUpDto.getPassword())
                .build();
    }
}