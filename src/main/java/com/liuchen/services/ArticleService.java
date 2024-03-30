package com.liuchen.services;

import com.liuchen.models.Article;

/**
 * Package: com.liuchen.services
 * Description:
 *
 * @Author: Liu-Chen-CS
 * @Create: 3/30/2024 - 2:41 PM
 * @Version: v1.0
 */
public interface ArticleService {

    void saveArticle(Article article);

    void updateArticle(Article article);

    void deleteById(Integer id);

}
