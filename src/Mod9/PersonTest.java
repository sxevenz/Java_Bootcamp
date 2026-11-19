package Mod9;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PersonTest {

    private Person person;

    @Before
    public void setUp() throws Exception {
        person = new Person();
    }

    @After
    public void tearDown() throws Exception {
        // TODO: Tear down person object (set to null)
        person = null;
    }

    @Test
    public void testGettersAndSetters() {
        // TODO: Test setWeight/getWeight and setHeight/getHeight
        person.setHeight(180);
        person.setHeight(600);
        person.setHeight(-1);
        person.setHeight(0);
        assertEquals(180, person.getHeight(), 0);

        person.setHeight(599);
        assertEquals(599, person.getHeight(), 0 );

        person.setWeight(80);
        person.setWeight(0);
        assertEquals(80, person.getWeight(), 0);

    }

    @Test
    public void testGetBodyMassIndex() {
        // TODO: Test valid BMI categories (Underweight, Normal weight, Overweight, Obese)
        // TODO: Test invalid and boundary inputs (zero, negative values, > 600 weight, > 3.0 height)
        assertEquals("Underweight", person.getBodyMassIndex(50, 1.80));
        assertEquals("Normal weight", person.getBodyMassIndex(70, 1.75));
        assertEquals("Overweight", person.getBodyMassIndex(85, 1.75));
        assertEquals("Obese", person.getBodyMassIndex(100, 1.75));

        assertEquals("Invalid input", person.getBodyMassIndex(0, 1.75));
        assertEquals("Invalid input", person.getBodyMassIndex(-10, 1.75));
        assertEquals("Invalid input", person.getBodyMassIndex(601, 1.75));
        assertEquals("Invalid input", person.getBodyMassIndex(70, 0));
        assertEquals("Invalid input", person.getBodyMassIndex(70, -1.75));
        assertEquals("Invalid input", person.getBodyMassIndex(70, 3.1));
    }
}