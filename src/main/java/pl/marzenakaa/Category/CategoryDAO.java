package pl.marzenakaa.Category;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class CategoryDAO {
    @PersistenceContext
    EntityManager entityManager;


}
