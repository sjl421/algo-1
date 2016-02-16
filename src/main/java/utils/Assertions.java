package utils;

import org.junit.Assert;

/**
 * Custom assertions
 */
public class Assertions {

  public static void assertMatrixEquals(int[][] expected, int[][] actual) {
    Assert.assertEquals((long) expected.length, (long) actual.length);
    for(int i = 0; i < expected.length; ++i) {
      Assert.assertArrayEquals(expected[i], actual[i]);
    }
  }
}
