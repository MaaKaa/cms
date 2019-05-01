package pl.marzenakaa.Author;

import org.springframework.stereotype.Repository;
import pl.marzenakaa.Article.Article;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class AuthorDAO {
    @PersistenceContext
    EntityManager entityManager;

    public void save(Author entity) {
        entityManager.persist(entity);
    }

    public void edit(Author entity){
        entityManager.merge(entity);
    }

    public Author findById(long id) {
        return entityManager.find(Author.class, id);
    }

    public List<Author> findAll(){
        Query query = entityManager.createQuery("SELECT a FROM Author a");
        List<Author> authors = query.getResultList();
        return authors;
    }

    public void remove(long id) {
        Author author = findById(id);
        if (author != null) {
            entityManager.remove(author);
        }
    }
}
