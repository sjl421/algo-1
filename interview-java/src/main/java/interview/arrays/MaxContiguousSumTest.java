package interview.arrays;

import interview.arrays.MaxContiguousSum.MaxSum;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxContiguousSumTest {
  @Test
  public void testFind() throws Exception {
    int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    MaxSum maxSum = MaxContiguousSum.find(arr);
    assertEquals(6, maxSum.sum);
    assertEquals(3, maxSum.start);
    assertEquals(6, maxSum.end);
  }

  @Test
  public void testFind0() throws Exception {
    int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    assertEquals(6, MaxContiguousSum.find0(arr));
  }
}