package com.liuchen;

import com.liuchen.models.Article;
import com.liuchen.models.ArticleData;
import com.liuchen.services.ArticleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.Optional;

@SpringBootTest
class SpringbootApplicationTests {

    @Autowired
    ArticleService articleService;

    @Test
    void test_saveArticle(){
        ArticleData articleData = ArticleData.builder()
                .content("Donald John Trump is an American politician, media personality, and businessman who served as " +
                        "the 45th president of the United States from 2017 to 2021.")
                .build();
        Article article = Article.builder()
                .author("Donald Trump")
                .title("Donald Trump droht Prinz Harry: Drogen-Beichte sorgt für Ärger")
                .description("Donald Trump is the presumptive nominee of the Republican Party")
                .createTime(new Date())
                .build();

        article.setArticleData(articleData);
        articleData.setArticle(article);

        articleService.saveArticle(article);
    }

    @Test
    void test_updateArticle(){
        Article article = Article.builder()
                .author("Donald Trump")
                .title("Donald Trump droht Prinz Harry: Drogen-Beichte sorgt für Ärger")
                .description("Donald Trump is the presumptive nominee of the Republican Party")
                .createTime(new Date())
                .aid(2)
                .build();

        ArticleData articleData = ArticleData.builder()
                .content("Hello, I am updating the content")
                .build();

        article.setArticleData(articleData);

        articleService.updateArticle(article);
    }

    @Test
    void test_deleteArticle(){
        articleService.deleteById(3);
    }

}
