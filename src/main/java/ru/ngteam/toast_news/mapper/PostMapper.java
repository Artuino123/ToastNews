package ru.ngteam.toast_news.mapper;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.ngteam.toast_news.dto.PostDto;
import ru.ngteam.toast_news.model.Post;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostMapper {
    private final UserMapper userMapper;

    public PostDto toDto(Post post) {
        return PostDto.builder()
                .author(userMapper.toDto(post.getAuthor()))
                .title(post.getTitle())
                .text(post.getText())
                .creationDate(post.getCreationDate())
                .build();
    }

    public Post toPost(PostDto dto) {
        return Post.builder()
                .author(userMapper.toUser(dto.getAuthor()))
                .title(dto.getTitle())
                .text(dto.getText())
                .build();
    }

    public List<PostDto> toDtoList(List<Post> posts) {
        return posts.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }
}
