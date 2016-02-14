package algo.numbers;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test for {@link Arithmetics}
 */
public class ArithmeticsTest {
  @Test
  public void testMod() {
    assertEquals(1, Arithmetics.mod(5, 2));
  }

  @Test(expected = ArithmeticException.class)
  public void testModZero() {
    Arithmetics.mod(5, 0);
  }

  @Test
  public void testDiv() {
    assertEquals(1, Arithmetics.div(10, 10));
    assertEquals(11, Arithmetics.div(33, 3));
    assertEquals(281, Arithmetics.div(562, 2));
  }

  @Test(expected = ArithmeticException.class)
  public void testDivByZero() {
    Arithmetics.div(10, 0);
  }

  @Test
  public void testSqrt() {
    assertEquals(4, Arithmetics.sqrt(16));
    assertEquals(12, Arithmetics.sqrt(256));
    assertEquals(-1, Arithmetics.sqrt(33));
  }
}