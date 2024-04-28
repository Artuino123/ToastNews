package ru.ngteam.toast_news.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class SignUpDto {
    private String name;
    private String email;
    private String password;
}