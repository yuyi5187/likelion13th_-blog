package likelion13th.blog.controller;

import likelion13th.blog.domain.*;
import likelion13th.blog.dto.AddArticleRequest;
import likelion13th.blog.dto.ApiResponse;
import likelion13th.blog.dto.ArticleResponse;
import likelion13th.blog.service.*;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/articles")
public class ArticleController {
    private final ArticleService articleService;

    /*게시글 추가*/
    @PostMapping
    public ResponseEntity<ApiResponse> createArticle(@RequestBody AddArticleRequest request){
        ArticleResponse response=articleService.addArticle(request);
        return ResponseEntity.ok(new ApiResponse(true,201,"게시글 등록 성공",response));

    }

}
