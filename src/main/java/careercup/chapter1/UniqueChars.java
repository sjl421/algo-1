package careercup.chapter1;

/**
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you can not use additional data structures?
 */
public class UniqueChars {

    public static boolean isUniqueChars(String str) {
        boolean chars[] = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (chars[val])
                return false;
            else
                chars[val] = true;
        }
        return true;
    }

    public static boolean isUniqueChars2(String str) {
        int checker = 0;
        for (int i = 0; i < str.length(); ++i) {
            int val = str.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) return false;
            checker |= (1 << val);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isUniqueChars2("aba"));
    }
}
