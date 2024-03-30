package com.liuchen.repositories;

import com.liuchen.models.ArticleData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Package: com.liuchen.repositories
 * Description:
 *
 * @Author: Liu-Chen-CS
 * @Create: 3/30/2024 - 2:37 PM
 * @Version: v1.0
 */

@Repository
public interface ArticleDataRepository extends JpaRepository<ArticleData, Integer> {


    @Modifying
    @Transactional
    @Query("update ArticleData ad set ad.content = ?1 where ad.article.aid = ?2")
    void updateContentByAid(String content, Integer aid);

    @Modifying
    @Transactional
    @Query("delete from ArticleData ad where ad.article.aid = ?1")
    void deleteById(Integer id);

}
