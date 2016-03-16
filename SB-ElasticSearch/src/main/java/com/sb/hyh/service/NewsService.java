package com.sb.hyh.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.hyh.entities.News;
import com.sb.hyh.repository.NewsRepository;

@Service
public class NewsService {
    @Autowired
    private NewsRepository repository;

    public Iterable<News> findAll() {
        return repository.findAll();
    }

    public void deleteAll() {
        this.repository.deleteAll();
    }

    public void save() {
        News news = new News();
        news.setContent("中文");
        news.setCreatedDateTime(new Date());
        news.setLink("http://www.baidu.com");
        this.repository.save(news);
    }
}
