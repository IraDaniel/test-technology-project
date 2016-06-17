package com.company.controller;

import com.company.entity.Article;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Irina_Daniel on 6/17/2016.
 */
@RestController
public class ArticleController {

    @RequestMapping(value = "/article", method = RequestMethod.GET)
    public Article getString() {
        Article article = new Article();
        article.setTitle("Java");
        article.setText("Java is a programming language");

        return article;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Article> getListArticles() {
        List<Article> articles = new ArrayList<>();
        articles.add(new Article("Ada", "Programming language"));
        articles.add(new Article("Java", "Programming language"));

        return articles;
    }


}
