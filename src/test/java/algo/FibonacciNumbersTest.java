package algo;

import algo.dynamic.FibonacciNumbers;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciNumbersTest {

  @Test
  public void testCalculate() throws Exception {
    assertEquals(0, FibonacciNumbers.calc(0));
    assertEquals(1, FibonacciNumbers.calc(1));
    assertEquals(1, FibonacciNumbers.calc(2));
    assertEquals(2, FibonacciNumbers.calc(3));
    assertEquals(13, FibonacciNumbers.calc(7));
    assertEquals(55, FibonacciNumbers.calc(10));
  }

  @Test
  public void testCalRec() throws Exception {
    assertEquals(0, FibonacciNumbers.calcRec(0));
    assertEquals(1, FibonacciNumbers.calcRec(1));
    assertEquals(1, FibonacciNumbers.calcRec(2));
    assertEquals(2, FibonacciNumbers.calcRec(3));
    assertEquals(13, FibonacciNumbers.calcRec(7));
    assertEquals(55, FibonacciNumbers.calcRec(10));
  }
}