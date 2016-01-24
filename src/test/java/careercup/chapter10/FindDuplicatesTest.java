package careercup.chapter10;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test for {@link FindDuplicates}
 *
 * Created by akhalikov on 22/01/16
 */
public class FindDuplicatesTest {
  @Test
  public void testPrintDuplicates() throws Exception {
    int[] arr = {1, 1, 23, 1, 5, 31999, 34, 10, 10, 11, 1, 54, 2, 6, 88, 7};
    FindDuplicates.printDuplicates(arr);
  }
}