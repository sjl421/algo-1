package arrays;

import org.junit.Test;

public class TwoRepeatingTest {
  @Test
  public void testPrintRepeatingPair() throws Exception {
    int[] a = {4, 2, 4, 5, 2, 3, 1};
    TwoRepeating.printRepeatingPair(a, 5);
  }

  @Test
  public void testPrintRepeating() throws Exception {
    int[] a = {4, 2, 4, 5, 2, 3, 1};
    TwoRepeating.printRepeatingPair2(a, 5);
  }
}