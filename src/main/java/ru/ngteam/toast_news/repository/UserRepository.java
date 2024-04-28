package ru.ngteam.toast_news.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ngteam.toast_news.model.User;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    Optional<User> findByName(String name);
}
