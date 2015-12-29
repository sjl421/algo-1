package careercup.chapter1.strings;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author akhalikov
 */
public class PalindromePermutationTest {

  @Test
  public void testIsPalindromePermutation() throws Exception {

    assertTrue(PalindromePermutation.check("Tact Coa"));
    assertFalse(PalindromePermutation.check(""));
  }
}