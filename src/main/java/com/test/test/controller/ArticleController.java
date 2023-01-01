package com.test.test.controller;

import com.test.test.dto.ArticleForm;
import com.test.test.repository.ArticleRepository;
import com.test.test.entity.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/articles")
@Controller
@Slf4j
public class ArticleController {

    @Autowired
    private ArticleRepository articleRepository;

    @GetMapping("/new")
    public String newArticleForm() {
        return "articles/new";
    }

    @PostMapping("/create")
    public String createArticle(ArticleForm form) {
        log.info(form.toString());

        // 1. DTO 변환
        Article article = form.toEntity();
        log.info(article.toString());

        // 2. Repository에게 Entitiy를 DB에 저장하게 함
        Article saved = articleRepository.save(article);
        log.info(saved.toString());

        return "";
    }
}
