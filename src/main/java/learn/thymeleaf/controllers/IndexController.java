package learn.thymeleaf.controllers;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import learn.thymeleaf.domain.Category;
import learn.thymeleaf.domain.Recipe;
import learn.thymeleaf.domain.UnitOfMeasure;
import learn.thymeleaf.repo.CategoryRepository;
import learn.thymeleaf.repo.UnitOfMeasureRepository;
import learn.thymeleaf.service.RecipeServiceImpl;
import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author stefan
 *
 */
@Slf4j
@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;
    @Autowired
    private RecipeServiceImpl recipeServiceImpl;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
        log.debug("IndexController in action...");
    }

    @RequestMapping({ "", "/", "/index" })
    public String getIndexPage(Model model) {
        Set<Recipe> recipes = recipeServiceImpl.getRecipes();
        model.addAttribute("recipes", recipes);

        Optional<Category> categoryOptional = categoryRepository.findByDescription("Italian");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Cat id is: " + categoryOptional.get().getId());
        System.out.println("UitOfMeasure id is: " + unitOfMeasureOptional.get().getId());

        return "index";
    }

}
