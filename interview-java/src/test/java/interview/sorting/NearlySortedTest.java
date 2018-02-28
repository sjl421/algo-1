package interview.sorting;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class NearlySortedTest {
  @Test
  public void testSortK() throws Exception {
    int[] a = {1, 0, 6, 4, 2, 7, 19, 8, 33};
    int[] expected = {1, 0, 6, 4, 2, 7, 19, 8, 33};
    Arrays.sort(expected);

    NearlySorted.sortK(a, 2);
    assertArrayEquals(expected, a);
  }

  @Test
  public void testName() throws Exception {
    int[] a = {2, 6, 3, 12, 56, 8};
    int[] expected = {2, 3, 6, 8, 12, 56};

    NearlySorted.sortK(a, 2);
    assertArrayEquals(expected, a);
  }
}