package learn.thymeleaf.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import learn.thymeleaf.domain.Category;
import learn.thymeleaf.domain.Recipe;
import learn.thymeleaf.domain.UnitOfMeasure;
import learn.thymeleaf.repo.CategoryRepository;
import learn.thymeleaf.repo.UnitOfMeasureRepository;
import learn.thymeleaf.service.RecipeService;

/**
 * 
 * @author stefan
 *
 */
@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;
    @Autowired
    private RecipeService recipeService;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({ "", "/", "/index" })
    public String getIndexPage(Model model) {
        List<Recipe> recipes = recipeService.findAll();
        model.addAttribute("recipes", recipes);

        Optional<Category> categoryOptional = categoryRepository.findByDescription("Italian");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Cat id is: " + categoryOptional.get().getId());
        System.out.println("UitOfMeasure id is: " + unitOfMeasureOptional.get().getId());

        return "index";
    }

}
