package com.liuchen.services.impl;

import com.liuchen.models.Article;
import com.liuchen.repositories.ArticleDataRepository;
import com.liuchen.repositories.ArticleRepository;
import com.liuchen.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Package: com.liuchen.services.impl
 * Description:
 *
 * @Author: Liu-Chen-CS
 * @Create: 3/30/2024 - 2:44 PM
 * @Version: v1.0
 */

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    ArticleRepository articleRepository;

    @Autowired
    ArticleDataRepository articleDataRepository;

    @Override
    public void saveArticle(Article article) {
        articleDataRepository.save(article.getArticleData());
        articleRepository.save(article);
    }

    @Override
    public void updateArticle(Article article) {
        //update article
        Article articleParam = new Article();
        articleParam.setAid(article.getAid());
        articleParam.setTitle(article.getTitle());
        articleParam.setDescription(article.getDescription());
        articleParam.setAuthor(article.getAuthor());
        articleParam.setCreateTime(article.getCreateTime());
        articleRepository.save(articleParam);
        // update articleData
        articleDataRepository.updateContentByAid(article.getArticleData().getContent(), article.getAid());
    }

    @Override
    public void deleteById(Integer id) {
        // delete articleData
        articleDataRepository.deleteById(id);
        // delete article
        articleRepository.deleteById(id);
    }


}
