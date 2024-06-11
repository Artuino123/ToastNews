package ru.ngteam.toast_news;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.ngteam.toast_news.controller.FileController;

@SpringBootApplication
public class ToastNews {
    public static void main(String[] args) {
        SpringApplication.run(ToastNews.class, args);
    }
}