package learn.thymeleaf.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import learn.thymeleaf.domain.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {

}
