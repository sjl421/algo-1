package algo.numbers;

import org.junit.Test;

import static org.junit.Assert.*;

public class PowerTest {
  @Test
  public void testPow() {
    assertEquals(1, Power.pow(1000, 0));
    assertEquals(1, Power.pow(1, 1));
    assertEquals(8, Power.pow(2, 3));
    assertEquals(16807, Power.pow(7, 5));
  }

  @Test
  public void testPow2() {
    assertEquals(1, Power.pow2(1000, 0));
    assertEquals(1, Power.pow2(1, 1));
    assertEquals(729, Power.pow2(3, 6));
    assertEquals(16807, Power.pow2(7, 5));
  }

  @Test
  public void testPow3() {
    assertEquals(1, Power.pow3(1000, 0));
    assertEquals(1, Power.pow3(1, 1));
    assertEquals(6561, Power.pow3(3, 8));
    assertEquals(2187, Power.pow3(3, 7));
    assertEquals(16807, Power.pow3(7, 5));
  }
}