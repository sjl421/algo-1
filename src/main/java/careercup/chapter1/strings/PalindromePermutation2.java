package careercup.chapter1.strings;

/**
 * Small optimization for {@link PalindromePermutation}
 */
public class PalindromePermutation2 {

  /**
   * Assumptions:
   *  - letter case does not matter
   *  - only check alphabetic characters -> ASCII
   *  - I can use buffer
   *
   * Time complexity O(n)
   * Space complexity: O(1)
   */
  static boolean isPalindromePermutation(String str) {
    if (str == null)
      throw new NullPointerException("str is null");
    if (str.length() == 0)
      return false;

    int countOdd = 0;
    int[] table = new int[PalindromePermutation.getSize('a', 'z')];
    for (char c: str.toCharArray()) {
      int val = PalindromePermutation.getCharNumber(c);
      if (val > 0) {
        table[val]++;
        if (table[val] % 2 == 1)
          countOdd++;
        else
          countOdd--;
      }
    }
    return countOdd <= 1;
  }

  /**
   * Time & space complexity: O(1)
   */
  static int getCharNumber(char c) {
    int a = Character.getNumericValue('a');
    int z = Character.getNumericValue('z');
    int A = Character.getNumericValue('A');
    int Z = Character.getNumericValue('Z');
    int val = Character.getNumericValue(c);
    if (a <= val && val >= z)
      return val - a;
    else if (A <= val && val >= Z)
      return val - A;
    else
      return -1;
  }
}
