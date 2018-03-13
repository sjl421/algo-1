package interview.atlassian;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FindAListTest {
  @Test
  public void find() {
    int[] a = {1};
    int[] b = {1};

    assertEquals(0, FindAList.find(a, b));

    b = new int[]{0};
    assertEquals(-1, FindAList.find(a, b));

    a = new int[]{3, 0, 9, 9, 9};
    b = new int[]{9, 9};
    assertEquals(2, FindAList.find(a, b));
  }
}