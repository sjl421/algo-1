package algo.recursion;

import org.junit.Test;
import static org.junit.Assert.*;

public class FactorialTest {

    @Test(expected=IllegalArgumentException.class)
    public void testCalculateMax() throws Exception {
        Factorial.calculate(21);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testCalculateNegative() throws Exception {
        Factorial.calculate(-5);
    }

    @Test
    public void testCalculateSimplest() throws Exception {
        assertEquals(1, Factorial.calculate(0));
        assertEquals(1, Factorial.calculate(1));
        assertEquals(2, Factorial.calculate(2));
    }

    @Test
    public void testCalculate5() throws Exception {
        assertEquals(120, Factorial.calculate(5));
    }

    @Test
    public void testCalculate20() throws Exception {
        assertEquals(2432902008176640000L, Factorial.calculate(20));
    }
}
