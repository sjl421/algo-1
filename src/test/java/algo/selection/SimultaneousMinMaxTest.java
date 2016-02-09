package algo.selection;

import algo.selection.SimultaneousMinMax.MinMax;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link SimultaneousMinMax}
 *
 * Created by akhalikov on 09/02/16
 */
public class SimultaneousMinMaxTest {
  @Test
  public void testFindMinMax() throws Exception {
    int[] numbers = {-5, 9, 3, 0, 12, 0, -8, 14, 29, 15, 22, -40, 123};
    MinMax p = SimultaneousMinMax.findMinMax(numbers);
    assertEquals(-40, p.min);
    assertEquals(123, p.max);
    System.out.println("Comparisons: " + p.comparisonsNum + ", n=" + numbers.length);
  }

  @Test
  public void testFindMinMax2() throws Exception {
    int[] numbers = {-5, 9, 3, 0, 12, 0, -8, 14, 29, 15, 22, -40, 123};
    MinMax p = SimultaneousMinMax.findMinMax2(numbers);
    assertEquals(-40, p.min);
    assertEquals(123, p.max);
    System.out.println("Comparisons: " + p.comparisonsNum + ", n=" + numbers.length);
  }
}