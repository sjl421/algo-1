package careercup.chapter1.strings;

/**
 * Given two strings, write a function to check if they are one edit (or zero edits) away.
 * 3 types of edits: insert, remove, or replace a character.
 *
 * @author akhalikov
 */
public class OneAway {
  static boolean isOneAway(String s1, String s2) {
    if (Math.abs(s1.length() - s2.length()) > 1)
      return false;

    int editsCount = 0, i = 0, j = 0;
    while (i < s1.length() && j < s2.length()) {
     if (s1.charAt(i) != s2.charAt(j)) {
       editsCount++;
       if (s1.length() > s2.length()) i++;
       else if (s1.length() < s2.length()) j++;
       else {
         i++;
         j++;
       }
     } else {
       i++;
       j++;
     }
    }
    return editsCount <= 1;
  }
}
