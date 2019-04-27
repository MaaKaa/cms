package pl.marzenakaa.Author;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class AuthorDAO {
    @PersistenceContext
    EntityManager entityManager;


}
