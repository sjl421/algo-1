package careercup.chapter1.strings;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Test for {@link PalindromePermutation}
 *
 * @author akhalikov
 */
public class PalindromePermutationTest {

  @Test
  public void testIsPalindromePermutation() throws Exception {
    assertTrue("baba", PalindromePermutation.isPalindromePermutation("baba"));
    assertTrue("babaY", PalindromePermutation.isPalindromePermutation("babaY"));
    assertTrue("Tact Coa", PalindromePermutation.isPalindromePermutation("Tact Coa"));
    assertFalse("empty string", PalindromePermutation.isPalindromePermutation(""));
  }
}