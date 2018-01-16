package algo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {
  @Test
  public void testSearch() throws Exception {
    int[] a = {1, 2, 3, 4, 5, 6, 7};
    int actual = BinarySearch.search(a, 1);
    assertEquals(0, actual);

    actual = BinarySearch.search(a, 7);
    assertEquals(6, actual);

    actual = BinarySearch.search(a, 123);
    assertEquals(-1, actual);

    actual = BinarySearch.search(new int[]{}, 123);
    assertEquals(-1, actual);
  }
}
