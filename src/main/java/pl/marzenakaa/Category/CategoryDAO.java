package pl.marzenakaa.Category;

import org.springframework.stereotype.Repository;
import pl.marzenakaa.Article.Article;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class CategoryDAO {
    @PersistenceContext
    EntityManager entityManager;

    public void save(Category entity) {
        entityManager.persist(entity);
    }

    public void edit(Category entity){
        entityManager.merge(entity);
    }

    public Category findById(long id) {
        return entityManager.find(Category.class, id);
    }

    public List<Category> findAll(){
        Query query = entityManager.createQuery("SELECT c FROM Category c");
        List<Category> categories = query.getResultList();
        return categories;
    }

    public Category findByName(String name){
        Query query = entityManager.createQuery("SELECT c FROM Category c WHERE name= :name");
        query.setParameter("name", name);
        Category category = (Category) query.getSingleResult();
        return category;
    }

    public void remove(Category entity){
        entityManager.remove(entity);
    }
}
