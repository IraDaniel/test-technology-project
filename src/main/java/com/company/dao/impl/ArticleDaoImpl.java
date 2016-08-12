package com.company.dao.impl;

import com.company.dao.ArticleDao;
import com.company.entity.Article;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Irina_Daniel on 8/12/2016.
 */
public class ArticleDaoImpl implements ArticleDao {

    List<Article> articles;

    public ArticleDaoImpl() {
        articles = new ArrayList<>();
        articles.add(new Article(1L, "Java", "Java is a programming language"));
        articles.add(new Article(2L, "NLP", "Natural language processing"));
    }

    public List<Article> getAllArticles() {
        return articles;
    }

    public Article getArticleByTitle(String title) {
        for (Article article : articles) {
            if (article.getTitle().equals(title)) {
                return article;
            }
        }
        return null;
    }
}
