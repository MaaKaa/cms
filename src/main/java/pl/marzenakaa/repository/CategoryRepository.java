package pl.marzenakaa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.marzenakaa.Category.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
