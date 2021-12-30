package learn.thymeleaf.controllers;

import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import learn.thymeleaf.domain.Recipe;
import learn.thymeleaf.services.RecipeService;
import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author stefan
 *
 */
@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }


    @RequestMapping({ "", "/", "/index" })
    public String getIndexPage(Model model) {
        Set<Recipe> recipes = recipeService.getRecipes();
        model.addAttribute("recipes", recipes);

        return "index";
    }

}
