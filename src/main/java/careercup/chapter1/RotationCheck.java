package careercup.chapter1;

/**
 * CareerCup Challenge #1.8
 */
public class RotationCheck {

    /**
     * Checks if s1 is a rotation of s2
     */
    public static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        return isSubstring(s2, s1+s1);
    }

    /**
     * Checks if s1 is substring of s2
     */
    static boolean isSubstring(String s1, String s2) {
        return s2.contains(s1);
    }
}
