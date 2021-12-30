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
