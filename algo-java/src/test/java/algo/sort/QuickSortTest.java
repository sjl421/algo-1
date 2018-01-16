package algo.sort;

import org.junit.Test;

public class QuickSortTest {
  @Test
  public void testSort() throws Exception {
    int[] a = {3, 2, 5, 1, 8, 0};
    QuickSort.sort(a);
    for (int i : a)
      System.out.print(i + " ");
  }
}