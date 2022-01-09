package learn.thymeleaf.controllers;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import learn.thymeleaf.commands.RecipeCommand;
import learn.thymeleaf.domain.Recipe;
import learn.thymeleaf.services.RecipeService;
import lombok.extern.slf4j.Slf4j;

/**
 * @author stefan
 *
 */

@Slf4j
@Controller
@RequestMapping("/recipe")
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping("/{id}/show/")
    public String showById(@PathVariable String id, Model model){
        Recipe r = recipeService.findById(Long.valueOf(id));
        model.addAttribute("recipe", r);
        return "recipe/show";
    }
    

    @RequestMapping("/new")
    public String newRecipe(Model model){
        model.addAttribute("recipe", new RecipeCommand());

        return "recipe/recipeform";
    }

    @RequestMapping("/{id}/update/")
    public String updateRecipe(@PathVariable String id, Model model){
        model.addAttribute("recipe", recipeService.findCommandById(Long.valueOf(id)));
        return  "recipe/recipeform";
    }

    @RequestMapping("/{id}/delete/")
    public String deleteRecipe(@PathVariable String id, Model model){
        recipeService.deleteCommandById(Long.valueOf(id));
        return "redirect:/";
    }

    @PostMapping("/")
    public String saveOrUpdate(@Valid @ModelAttribute("recipe") RecipeCommand command, BindingResult bindingResult){
        
        if(bindingResult.hasErrors()) {
            bindingResult.getAllErrors().forEach(e -> {
                log.debug(e.toString());
            });
            return "recipe/recipeForm";
        }
        RecipeCommand savedCommand = recipeService.saveRecipeCommand(command);

        return "redirect:/recipe/"+savedCommand.getId()+"/show/";
    }

}