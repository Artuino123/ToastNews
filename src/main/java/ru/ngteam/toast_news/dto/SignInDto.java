package ru.ngteam.toast_news.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class SignInDto {
    private String email;
    private String password;
}