package Mod10;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


public class CalculatorTest {
    Calculator calculator = new Calculator();
    @Before
    public void setUp() {
        calculator = new Calculator();
    }
    @After
    public void tearDown() {
        calculator = null;
    }
    //add tests
    @Test
    public void testAddTwoPositiveNumbers() {
        assertEquals(2, calculator.add(1, 1));
    }
    @Test
    public void testAddOneNegativeOnePositiveNumbers() {
        assertEquals(0, calculator.add(-1, 1));
    }
    @Test
    public void testAddThoNegativeNumbers(){
        assertEquals(-2, calculator.add(-1, -1));
    }
    @Test
    public void testAddTwoNegativeOnePositiveNumbers() {
        assertEquals(1, calculator.add(-1, -1, 3));
    }
    @Test
    public void testAddThreePositiveNumbers() {
        assertEquals(9, calculator.add(3, 3, 3));
    }
    @Test
    public void testAddTwoPositiveOneNegativeNumbers() {
        assertEquals(3, calculator.add(3, 3, -3));
    }
    //sub tests
    @Test
    public void testSubstractPositive() {
        assertEquals(3, calculator.subtract(6,3));
    }
    @Test
    public void testSubstractNegative() {
        assertEquals(-9, calculator.subtract(-6,3));
    }
    //divide test
    @Test
    public void testDividePositive() {
        assertEquals(1, calculator.divide(3, 3));
    }
    @Test
    public void testDivideNegative() {
        assertEquals(-1, calculator.divide(-3, 3));
    }
    @Test
    public void testDivideByZero() {
        try {
            calculator.divide(10, 0);
            fail("Division by zero error");
        }catch(ArithmeticException e) {
            assertEquals("/ by zero", e.getMessage());
        }
    }
    //multiply test
    @Test
    public void testMultiplyPositive() {
        assertEquals(9, calculator.multiply(3, 3));
    }
    @Test
    public void testMultiplyOneNegative() {
        try {
            calculator.multiply(-4, 5);
            fail("Expected InvalidInputException to be thrown");
        } catch (InvalidInputException e) {
            assertEquals("Negative numbers are not allowed", e.getMessage());
        }
    }
    @Test
    public void testMultiplyThoNegative() {
        try {
            calculator.multiply(4, -5);
            fail("Expected InvalidInputException to be thrown");
        } catch (InvalidInputException e) {
            assertEquals("Negative numbers are not allowed", e.getMessage());
        }
    }
}
