package careercup.chapter1;

import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Write a method to decide if two strings are anagrams or not.
 * Example: Mary => Army
 */
public class Anagrams {
    /**
     * Implementation using sorting
	 * Complexity: Time O(n log n), Space O(n)
     */
    public static boolean isAnagram(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		char[] chars1 = s1.toLowerCase().toCharArray();
		char[] chars2 = s2.toLowerCase().toCharArray();
		Arrays.sort(chars1);
		Arrays.sort(chars2);
		return Arrays.equals(chars1, chars2);
	}

    /**
     * Implementation using ASCII arrays
	 * Complexity: Time O(n), Space O(n)
     */
    public static boolean isAnagram2(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
        int[] chars1 = new int[256];
		int[] chars2 = new int[256];
		for (int i = 0; i < s1.length(); i++) {
			int val = Character.toLowerCase(s1.charAt(i));
			chars1[val]++;
			val = Character.toLowerCase(s2.charAt(i));
			chars2[val]++;
		}
		for (int i = 0; i < 256; i++) {
			if (chars1[i] != chars2[i])
				return false;
		}
		return true;
    }

	/**
	 * Soluton using hash maps
	 * Complexity: Time O(n), Space O(n)
	 */
	public static boolean isAnagram3(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;			
		Map<Character, Integer> chars1 = new HashMap();	
		Map<Character, Integer> chars2 = new HashMap();		
		for (int i = 0; i < s1.length(); i++) {
			Character c = Character.valueOf(Character.toLowerCase(s1.charAt(i)));
			int value = (chars1.get(c) != null) ? chars1.get(c)+1 : 1;
			chars1.put(c, value);
			
			c = Character.valueOf(Character.toLowerCase(s2.charAt(i)));
			value = (chars2.get(c) != null) ? chars2.get(c)+1 : 1;
			chars2.put(c, value);
		}
		for (Character c: chars1.keySet()) {
			if (chars1.get(c) != chars2.get(c))
				return false;
		}
		return true;
	}
}
