package pl.marzenakaa.Article;

import org.springframework.stereotype.Repository;
import pl.marzenakaa.Author.Author;
import pl.marzenakaa.Category.Category;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class ArticleDAO {
    @PersistenceContext
    EntityManager entityManager;

    public void save(Article entity) {
        entityManager.persist(entity);
    }

    public void edit(Article entity){
        entityManager.merge(entity);
    }

    public Article findById(long id) {
        return entityManager.find(Article.class, id);
    }

    public List<Article> findAll(){
        Query query = entityManager.createQuery("SELECT a FROM Article a");
        List<Article> articles = query.getResultList();
        return articles;
    }

    public List<Article> findLatest(int number){
        Query query = entityManager.createQuery("SELECT a FROM Article a order by created desc").setMaxResults(number);
        List<Article> articles = query.getResultList();
        return articles;
    }

    public List<Article> findDrafts(){
        Query query = entityManager.createQuery("SELECT a FROM Article a WHERE draft=true");
        List<Article> drafts = query.getResultList();
        return drafts;
    }


    public void remove(long id) {
        Article article = findById(id);
        if (article != null) {
            entityManager.remove(article);
        }

    }
}
