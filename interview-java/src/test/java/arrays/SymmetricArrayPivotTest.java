package arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static arrays.SymmetricArrayPivot.findPivot;

public class SymmetricArrayPivotTest {
  @Test
  public void testFindPivot0() throws Exception {
    assertEquals(-1, findPivot(null));
    assertEquals(-1, findPivot(new int[]{}));
  }

  @Test
  public void testFindPivot() throws Exception {
    assertEquals(1, findPivot(new int[]{1, 2, 1}));
    assertEquals(2, findPivot(new int[]{-1, 100, 1, 1, 98}));
  }
}