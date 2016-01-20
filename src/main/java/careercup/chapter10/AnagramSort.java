package careercup.chapter10;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Write a method to sort an array of strings so that all the anagrams are next to each other.
 *
 * @author ahalikov
 */
class AnagramSort {

  static String[] sort(String[] a) {
    Comparator<String> comp = new Comparator<String>() {
      String sortChars(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
      }

      @Override
      public int compare(String o1, String o2) {
        return sortChars(o1).compareTo(sortChars(o2));
      }
    };
    Arrays.sort(a, comp);
    return a;
  }
}
