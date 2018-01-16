package arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KthLargestElementTest {
  @Test
  public void testFind() throws Exception {
    int[] a = {3, 1, 2, 1, 4};
    int k = 3;
    assertEquals(2, KthLargestElement.find(a, k));
  }
}