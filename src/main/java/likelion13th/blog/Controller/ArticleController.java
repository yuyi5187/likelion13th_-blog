package likelion13th.blog.Controller;

import likelion13th.blog.Domain.*;
import likelion13th.blog.Service.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/articles")
public class ArticleController {
    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }


    @PostMapping()
    public ResponseEntity<Article> createArticle(@RequestBody Article article) {
        Article newArticle = articleService.create(article);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(newArticle);
    }


    @GetMapping()
    public ResponseEntity<List<Article>> getArticles() {
        return ResponseEntity.ok(articleService.findAll());
    }


}
