package careercup.chapter1.strings;

import scala.xml.Null;

/**
 * Given a string, write a function to check if it is a permutation of a palindrome.
 * Palindrome is a word or phrase that is the same forwards and backwards.
 * Example:
 *  Input: "Tact Coa"
 *  Output: True (permutations: "taco cat", "atco cta", etc)
 *
 * Questions to interviewer:
 *  - check should be case sensitive or not ?
 *  - spaces are ignored or not ?
 *  - ASCII or Unicode ?
 *
 * Algorithm:
 *  - find permutations until first palindrome
 *
 * @author akhalikov
 */
public class PalindromePermutation {

  private static String palindrome;

  /**
   * Let's assume that:
   *  - check is case insensitive
   *  - spaces are ignored
   *  - ASCII charset
   */
  static boolean isPalindromePermutation(String str) {
    if (str == null)
      throw new NullPointerException("str is null");
    if (str.length() == 0)
      return false;

    permute("", str);
    if (palindrome != null) {
      System.out.println("palindrome permutation=" + palindrome);
      return true;
    }
    return false;
  }

  private static void permute(String prefix, String s) {
    int n = s.length();
    if (n == 0) {
      if (isPalindrome(prefix)) {
        palindrome = prefix;
        return;
      }
    } else {
      for (int i = 0; i < n; i++) {
        permute(
          prefix + s.charAt(i),
          s.substring(0, i) + s.substring(i + 1));
      }
    }
  }

  /**
   * O(n) check (n/2 operations)
   */
  static boolean isPalindrome(String str) {
    if (str == null)
      throw new NullPointerException("str is null");
    if (str.length() == 0)
      return false;
    if (str.length() < 2)
      return true;
    int i = 0, j = str.length() - 1;
    while (j >= i) {
      if (str.charAt(i) == ' ')
        i++;
      if (str.charAt(j) == ' ')
        j--;
      if (Character.toLowerCase(str.charAt(i++)) != Character.toLowerCase(str.charAt(j--)))
        return false;
    }
    return true;
  }
}
