package arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class SearchPeakTest {
  @Test
  public void testFindPeak() {
    int[] arr = {-1, 2, 3, 4, 5, 6, 7, 8, 4, 3, 0};
    assertEquals(7, SearchPeak.findPeak(arr));
  }
}