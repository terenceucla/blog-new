package org.example.service;

import org.example.vo.Result;
import org.example.vo.params.PageParams;
import org.springframework.stereotype.Service;

public interface ArticleService {
    Result listArticle(PageParams pageParams);

    Result hotArticle(int limit);

    Result newArticles(int limit);

    Result listArchives();
}
