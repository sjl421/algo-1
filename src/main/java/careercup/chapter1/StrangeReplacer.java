package careercup.chapter1;

/**
 * Write a method to replace all spaces in a string with '%20'.
 *
 * Created by ahalikov on 24/04/15.
 */
class StrangeReplacer {

    /**
     * Solution using String.replace method (JDK method uses pattern-matching)
     */
    public static String replaceString(String str) {
        if (str == null)
            throw new IllegalArgumentException("str is null");
        if (str.length() == 0)
            return str;
        return str.replace(" ", "%20");
    }

    /**
     * Solution for char array
     * Complexity: Time O(n), Space O(n)
     */
    public static char[] replaceChars(char[] str) {
        if (str == null || str.length == 0)
            return str;
        int spacesNumber = 0;
        for (char c: str) {
            if (c == ' ') spacesNumber++;
        }
        int n = str.length + spacesNumber*2;
        char[] chars = new char[n];
        int j = 0;
        for (char c: str) {
            if (c == ' ') {
                chars[j++] = '%';
                chars[j++] = '2';
                chars[j++] = '0';
            } else {
                chars[j++] = c;
            }
        }
        return chars;
    }
}
