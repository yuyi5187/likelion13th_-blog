package likelion13th.blog.Service;

import likelion13th.blog.Domain.Article;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleService {
    private final List<Article> articleDB = new ArrayList<>();
    private Long nextId = 1L;

    // 게시글 생성 메서드
    public Article create(Article article) {
        if (article.getTitle() == null
        || article.getContent() == null
        || article.getAuthor() == null) {
            throw new IllegalArgumentException("제목, 내용, 작성자는 필수 입력 항목입니다.");
        }
        Article newArticle = new Article(nextId++, article.getTitle()
                , article.getContent()
                , article.getAuthor()
                , article.getPassword()
        );
        articleDB.add(newArticle);
        return newArticle;
    }

    //게시글 전체 조회
    public List<Article> findAll(){
        return articleDB;
    }
}
