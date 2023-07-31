import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(10, 5, 4, 8);
    }

    @Test
    public void Add(){
        assertEquals(15, calculator.Add());
    }

    @Test
    public void Subtract(){
        assertEquals(5, calculator.Subtract());
    }

    @Test
    public void Multiply(){
        assertEquals(50, calculator.Multiply());
    }

    @Test
    public void Divide(){
        assertEquals(0.5, calculator.Divide(), 0.0);
    }
}
