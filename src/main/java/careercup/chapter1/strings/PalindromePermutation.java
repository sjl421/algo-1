package careercup.chapter1.strings;

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
 */
public class PalindromePermutation {

  static boolean isPalindromePermutation(String str) {
    if (str == null)
      throw new NullPointerException("str is null");
    if (str.length() == 0)
      return false;
    int[] charFrequencyTable = countCharFrequency(str);
    return checkMaxOneOdd(charFrequencyTable);
  }

  static boolean checkMaxOneOdd(int[] table) {
    boolean foundOdd = false;
    for (int count: table) {
      if (count % 2 > 0) {
        if (foundOdd) {
          return false;
        }
        foundOdd = true;
      }
    }
    return true;
  }

  static int[] countCharFrequency(String str) {
    int n = Character.getNumericValue('z') - Character.getNumericValue('a');
    int[] arr = new int[n];
    for (char c: str.toCharArray()) {
      int val = getCharNumber(c);
      if (val > 0) arr[val]++;
    }
    return arr;
  }

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
