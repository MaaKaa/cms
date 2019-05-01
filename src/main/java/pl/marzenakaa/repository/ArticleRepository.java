package pl.marzenakaa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.marzenakaa.Article.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
