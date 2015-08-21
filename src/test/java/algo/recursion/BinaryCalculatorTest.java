package algo.recursion;

import org.junit.Test;
import static org.junit.Assert.*;

public class BinaryCalculatorTest {

    @Test(expected=IllegalArgumentException.class)
    public void testNegative() {
        BinaryCalculator.getBinary(-1);
    }

    @Test
    public void testNegative2() {
        System.out.println(Integer.toBinaryString(43));
        System.out.println(Integer.toBinaryString(-43));
    }

    @Test
    public void testSimplest() {
        assertEquals("0", BinaryCalculator.getBinary(0));
        assertEquals("1", BinaryCalculator.getBinary(1));
    }

    @Test
    public void testPositive() {
        assertEquals("1000", BinaryCalculator.getBinary(8));
    }
}
