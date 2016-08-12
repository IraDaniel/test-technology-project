package com.company.controller;

import com.company.dao.ArticleDao;
import com.company.dao.impl.ArticleDaoImpl;
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

    ArticleDao dao = new ArticleDaoImpl();

    @RequestMapping(value = "/article", method = RequestMethod.GET)
    public Article getArticle() {
        return dao.getArticleByTitle("Java");
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Article> getListArticles() {
        return dao.getAllArticles();
    }


}
