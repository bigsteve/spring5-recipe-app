package learn.thymeleaf.services;

import learn.thymeleaf.commands.IngredientCommand;

/**
 * @author stefan
 *
 */
public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);
}