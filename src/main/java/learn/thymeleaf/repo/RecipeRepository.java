package learn.thymeleaf.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import learn.thymeleaf.domain.Recipe;

@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
