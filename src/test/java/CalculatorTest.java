import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator( 27, 9);
    }
    @Test
    public void canAdd(){
        assertEquals(36, calculator.add(), 0.01);
    }
    @Test
    public void canSubtract(){
        assertEquals(18, calculator.subtract(), 0.01);
    }
    @Test
    public void canMultiply(){
        assertEquals(243, calculator.multiply(), 0.01);
    }
    @Test
    public void canDivide(){
        assertEquals(3, calculator.divide(), 0.01);
    }
}
