package ru.ngteam.toast_news.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ngteam.toast_news.model.Post;

import java.util.UUID;

public interface PostRepository extends JpaRepository<Post, UUID> {

}
