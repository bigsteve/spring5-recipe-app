package learn.thymeleaf.services;

import java.util.Set;

import learn.thymeleaf.commands.RecipeCommand;
import learn.thymeleaf.domain.Recipe;

/**
 * @author stefan
 *
 */
public interface RecipeService {
    
    
    Set<Recipe> getRecipes();

    Recipe findById(Long l);
    
    void deleteCommandById(Long l);
    
    Set<Recipe> findAll();

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    RecipeCommand findCommandById(Long l);
    
}
