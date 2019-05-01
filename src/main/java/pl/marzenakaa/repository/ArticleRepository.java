package pl.marzenakaa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.marzenakaa.Article.Article;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Long> {

    @Query(value = "SELECT * FROM articles ORDER BY created DESC LIMIT 5", nativeQuery = true)
    List<Article> findLatestArticles();

    @Query(value = "SELECT * FROM articles WHERE draft=true", nativeQuery = true)
    List<Article> findDrafts();
}
