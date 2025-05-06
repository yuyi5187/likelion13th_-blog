package likelion13th.blog.Domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Getter
@Setter
public class Comment {
    private Long id;
    private Article article;
    private String content;
    private String author;
    private String password;
    private LocalDateTime createdAt;
}
