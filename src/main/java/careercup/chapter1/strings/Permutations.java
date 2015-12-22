package careercup.chapter1.strings;

import java.util.ArrayList;
import java.util.List;

/**
 * Design an algorithm to print all permutations of a string.
 * For simplicity, assume all characters are unique.
 *
 * @author akhalikov
 */
class Permutations {

    private static List<String> perms = new ArrayList<String>();

    public static List<String> find(String s) {
        permute("", s);
        return perms;
    }

    private static void permute(String prefix, String s) {
        int n = s.length();
        if (n == 0)
            perms.add(prefix);
        else {
            for (int i = 0; i < n; i++)
                permute(prefix + s.charAt(i), s.substring(0, i) + s.substring(i+1, n));
        }
    }
}
