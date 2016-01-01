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

  @Test
  public void testIsPalindromePermutation2() throws Exception {
    assertTrue("baba", PalindromePermutation2.isPalindromePermutation("baba"));
    assertTrue("babaY", PalindromePermutation2.isPalindromePermutation("babaY"));
    assertTrue("Tact Coa", PalindromePermutation2.isPalindromePermutation("Tact Coa"));
    assertFalse("empty string", PalindromePermutation2.isPalindromePermutation(""));
  }
}