package careercup;

import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Write a method to decide if two strings are anagrams or not.
 * Example: Mary => Army
 */
public class Anagrams {
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
	
	@Test 
	public void testIsAnagram() {
		assertEquals(true, isAnagram("a", "A"));
		assertEquals(true, isAnagram("Army", "Mary"));
		assertEquals(false, isAnagram("aaaa", "Mary"));		
		assertEquals(true, isAnagram("Debit card", "Debitc Ard"));
	}
}
