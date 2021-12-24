package learn.thymeleaf.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import learn.thymeleaf.domain.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
    
    Optional<Category> findByDescription(String description);

}