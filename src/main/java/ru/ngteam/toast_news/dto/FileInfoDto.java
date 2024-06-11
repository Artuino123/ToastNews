package ru.ngteam.toast_news.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
public class FileInfoDto {
    private UUID id;
    private String originalFileName;
    private String storageFileName;
    private Long size;
    private String type;
}
