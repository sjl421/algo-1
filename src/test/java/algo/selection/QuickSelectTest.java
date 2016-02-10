package algo.selection;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test for {@link QuickSelect}
 *
 * Created by akhalikov on 10/02/16
 */
public class QuickSelectTest {
  @Test
  public void testSelect() throws Exception {
    int[] a = {3, 1, 2, 1, 4, 10, 6, -12};
    // sorted: -12 1 1 2 3 4 6 10
    assertEquals(2, QuickSelect.select(a, 3));
    assertEquals(1, QuickSelect.select(a, 2));
    assertEquals(4, QuickSelect.select(a, 5));
    assertEquals(10, QuickSelect.select(a, 7));
  }

  @Test
  public void testRandomPivot() throws Exception {
    for (int i = 0; i < 100; i++) {
      int p = QuickSelect.randomPivot(0, 7);
      assertTrue("p=" + p, p >= 0 && p < 10);
    }
  }
}