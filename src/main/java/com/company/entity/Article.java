package com.company.entity;

import org.json.JSONObject;

/**
 * Created by Irina_Daniel on 6/17/2016.
 */
public class Article {

    private Long id;
    private String title;
    private String text;

    public Article(Long id, String title, String text) {
        this.id = id;
        this.title = title;
        this.text = text;
    }

    public Article() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


}
