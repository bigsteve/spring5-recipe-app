package learn.thymeleaf.domain;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

/**
 * @author stefan
 *
 */
public class CategoryTest {
    
    Category category;
    Recipe recipe;
    
    @Before
    public void seup() {

        category = new Category();
        
    }

    /**
     * Test method for {@link learn.thymeleaf.domain.Category#getId()}.
     */
    @Test
    public void testGetId() {
        Long longVaLong = 4L;
        category.setId(longVaLong);
        assertEquals(longVaLong, category.getId());
    }

    /**
     * Test method for {@link learn.thymeleaf.domain.Category#getDescription()}.
     */
    @Test
    public void testGetDescription() {
        String desc = "bla";
        category.setDescription(desc);
        assertEquals(desc, category.getDescription());
    }

    /**
     * Test method for {@link learn.thymeleaf.domain.Category#getRecipes()}.
     */
    @Test
    public void testGetRecipes() {
        recipe = new Recipe();
        Set<Recipe> recipes = new HashSet<>();
        recipes.add(recipe);
        category.setRecipes(recipes);
        assertEquals(recipes, category.getRecipes());
    }

}
