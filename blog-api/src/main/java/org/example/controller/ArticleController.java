package org.example.controller;

import org.example.service.ArticleService;
import org.example.vo.Result;
import org.example.vo.params.PageParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("articles")
public class ArticleController {
    @Autowired
    private ArticleService articleService;
    @PostMapping
    public Result listArticle(@RequestBody PageParams pageParams){
        System.out.println("hello");
      //  return "hello";
        return articleService.listArticle(pageParams);
    }
}
