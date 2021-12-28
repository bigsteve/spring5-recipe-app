/**

Copyright (c) 2021 Stefan Miller

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

*/
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
