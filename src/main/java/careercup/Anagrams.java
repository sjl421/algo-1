package careercup;

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
     * @param s1
     * @param s2
     * @return
     */
    public static boolean isAnagram(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		int n = s1.length();	
		char[] chars1 = s1.toLowerCase().toCharArray();
		char[] chars2 = s2.toLowerCase().toCharArray();
		Arrays.sort(chars1);
		Arrays.sort(chars2);
		for (int i = 0; i < n; i++)
			if (chars1[i] != chars2[i])
				return false;
		return true;
	}

    /**
     * Implementation using ASCII arrays
     * @param s1
     * @param s2
     * @return
     */
    public static boolean isAnagram2(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		int n = s1.length();
        int[] chars1 = new int[256];
		int[] chars2 = new int[256];
		for (int i = 0; i < n; i++) {
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
	
	public static boolean isAnagram3(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;			
		Map<Character, Integer> chars1 = new HashMap();	
		Map<Character, Integer> chars2 = new HashMap();		
		int n = s1.length();
		for (int i = 0; i < n; i++) {
			Character c = Character.valueOf(Character.toLowerCase(s1.charAt(i)));
			int value = (chars1.get(c) != null) ? chars1.get(c)+1 : 1;
			chars1.put(c, value);
			
			c = Character.valueOf(Character.toLowerCase(s2.charAt(i)));
			value = (chars2.get(c) != null) ? chars2.get(c)+1 : 1;
			chars2.put(c, value);
		}
		for (Character c: chars1.keySet())
			if (chars1.get(c) != chars2.get(c))
				return false;
		return true;
	}
	
	@Test 
	public void testIsAnagram() {
        assertEquals(true, isAnagram("a", "A"));
        assertEquals(false, isAnagram("b", "A"));
        assertEquals(false, isAnagram("b", "BB"));
        assertEquals(true, isAnagram("aaaa", "AAAA"));
        assertEquals(true, isAnagram("Army", "Mary"));
        assertEquals(false, isAnagram("aaaa", "Mary"));
        assertEquals(true, isAnagram("Debit card", "Debitc Ard"));
	}
	
	@Test 
	public void testIsAnagram2() {
		assertEquals(true, isAnagram2("a", "A"));
		assertEquals(false, isAnagram2("b", "A"));
		assertEquals(false, isAnagram2("b", "BB"));
		assertEquals(true, isAnagram2("aaaa", "AAAA"));
		assertEquals(true, isAnagram2("Army", "Mary"));
		assertEquals(false, isAnagram2("aaaa", "Mary"));		
		assertEquals(true, isAnagram2("Debit card", "Debitc Ard"));
	}
	
	@Test 
	public void testIsAnagram3() {
		assertEquals(true, isAnagram3("a", "A"));
		assertEquals(false, isAnagram3("b", "A"));
		assertEquals(true, isAnagram3("Army", "Mary"));
		assertEquals(false, isAnagram2("b", "BB"));
		assertEquals(true, isAnagram2("aaaa", "AAAA"));
		assertEquals(true, isAnagram2("Debit card", "Debitc Ard"));
	}
}
