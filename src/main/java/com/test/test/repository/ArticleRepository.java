package com.test.test.repository;

import com.test.test.entity.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface ArticleRepository extends CrudRepository<Article, Long> {
    // <관리할 엔티티, 대포값의 type>

}
