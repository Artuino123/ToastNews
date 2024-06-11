package ru.ngteam.toast_news.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
@RestController
@RequiredArgsConstructor
public class FileController {

    @PostMapping("/file")
    String uploadFile(@RequestPart MultipartFile file) {
        System.out.println(file.getOriginalFilename());
        System.out.println(file.getSize());
        return "OK";
    }
}