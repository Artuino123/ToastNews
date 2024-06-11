package ru.ngteam.toast_news.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ngteam.toast_news.model.FileInfo;

import java.util.UUID;

public interface FileRepository extends JpaRepository<FileInfo, UUID> {

}
