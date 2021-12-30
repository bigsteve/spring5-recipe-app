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
package learn.thymeleaf.converters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import learn.thymeleaf.commands.UnitOfMeasureCommand;
import learn.thymeleaf.domain.UnitOfMeasure;

/**
 * @author stefan
 *
 */
public class UnitOfMeasureCommandToUnitOfMeasureTest {

    private final Long ID = 1L;
    private final String DESCRIPTION = "description";
    UnitOfMeasureCommandToUnitOfMeasure converter;
    
    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        converter = new UnitOfMeasureCommandToUnitOfMeasure();
    }
    
    @Test
    public void testNullParameter() {
        assertNull(converter.convert(null));
    }
    
    @Test
    public void testEmptyObject() {
        assertNotNull(converter.convert(new UnitOfMeasureCommand()));
    }

    /**
     * Test method for {@link learn.thymeleaf.converters.UnitOfMeasureCommandToUnitOfMeasure#convert(learn.thymeleaf.commands.UnitOfMeasureCommand)}.
     */
    @Test
    public void testConvert() {

        UnitOfMeasureCommand command = new UnitOfMeasureCommand();
        command.setId(ID);
        command.setDescription(DESCRIPTION);
        UnitOfMeasure uom = converter.convert(command);
        
        assertNotNull(uom);
        assertEquals(uom.getId(), ID);
        assertEquals(uom.getDescription(), DESCRIPTION);
    }

}
