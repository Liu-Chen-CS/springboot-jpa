package com.liuchen.repositories;

import com.liuchen.models.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Package: com.liuchen.repositories
 * Description:
 *
 * @Author: Liu-Chen-CS
 * @Create: 3/30/2024 - 2:37 PM
 * @Version: v1.0
 */

@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {

}
