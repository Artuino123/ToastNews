package ru.ngteam.toast_news.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Post {
    @Id
    private UUID id;
    private String title;
    private String text;
    @ManyToOne(fetch = FetchType.EAGER)
    private User author;
    private Instant creationDate;
}