package learn.thymeleaf.controllers;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.Model;

import learn.thymeleaf.domain.Recipe;
import learn.thymeleaf.services.RecipeService;

/**
 * @author stefan
 *
 */
public class IndexControllerTest {
    
    @Mock
    RecipeService recipeService;
    
    @Mock
    Model model;

    IndexController indexController;

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        indexController = new IndexController(recipeService);
    }

    /**
     * @throws Exception 
     * 
     */
    @Test
    public void testMockMvc() throws Exception {
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(indexController).build();
        mockMvc.perform(get("/")).andExpect(status().isOk())
        .andExpect(view().name("index"));
        
        
    }
    
    /**
     * Test method for {@link learn.thymeleaf.controllers.IndexController#getIndexPage(org.springframework.ui.Model)}.
     */
    @Test
    public void testGetIndexPage() throws Exception {
        
        Set<Recipe> recipes = new HashSet<>();
        Recipe r1 = new Recipe();
        r1.setId(1L);
        Recipe r2 = new Recipe();
        r2.setId(2L);
        recipes.add(r1);
        recipes.add(r2);
        
        when(recipeService.getRecipes()).thenReturn(recipes);
        ArgumentCaptor<Set<Recipe>> argumentCaptor = ArgumentCaptor.forClass(Set.class);
        
        String viewName = indexController.getIndexPage(model);
        assertEquals("index", viewName);
        verify(recipeService, times(1)).getRecipes();
        verify(model, times(1)).addAttribute(eq("recipes"), argumentCaptor.capture());
        Set<Recipe> controllerRecipesSet = argumentCaptor.getValue();
        assertEquals(controllerRecipesSet.size(), 2);
    }

}
