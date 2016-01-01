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
    assertTrue("Tact Coa", PalindromePermutation.isPalindromePermutation("baba"));
    assertTrue("Tact Coa", PalindromePermutation.isPalindromePermutation("Tact Coa"));
    assertFalse("empty string", PalindromePermutation.isPalindromePermutation(""));
  }

  @Test
  public void testIsPalindrome() throws Exception {
    assertFalse("empty string is not a palindrome",
      PalindromePermutation.isPalindrome(""));

    assertTrue("bab is palindrome",
      PalindromePermutation.isPalindrome("bab"));

    assertTrue("taco cat is palindrome",
      PalindromePermutation.isPalindrome("Taco Cat"));
  }
}