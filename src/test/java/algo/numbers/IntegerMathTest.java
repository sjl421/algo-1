package algo.numbers;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test for {@link IntegerMath}
 */
public class IntegerMathTest {
  @Test
  public void testMod() {
    assertEquals(1, IntegerMath.mod(5, 2));
  }

  @Test(expected = ArithmeticException.class)
  public void testModZero() {
    IntegerMath.mod(5, 0);
  }

  @Test
  public void testDiv() {
    assertEquals(1, IntegerMath.div(10, 10));
    assertEquals(11, IntegerMath.div(33, 3));
    assertEquals(281, IntegerMath.div(562, 2));
  }

  @Test(expected = ArithmeticException.class)
  public void testDivByZero() {
    IntegerMath.div(10, 0);
  }

  @Test
  public void testSqrt() {
    assertEquals(4, IntegerMath.sqrt(16));
    assertEquals(12, IntegerMath.sqrt(256));
    assertEquals(-1, IntegerMath.sqrt(33));
  }
}