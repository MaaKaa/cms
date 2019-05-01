package pl.marzenakaa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.marzenakaa.Author.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
