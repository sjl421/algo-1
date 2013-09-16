package careercup;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Write a method to decide if two strings are anagrams or not.
 * Example: Mary => Army
 */
public class Anagrams {
	public static boolean isAnagram(String s1, String s2) {
		return false;
	}
	
	@Test public void testIsAnagram() {
		assertEquals(true, isAnagram("a", "A"));
		assertEquals(true, isAnagram("Army", "Mary"));
		assertEquals(false, isAnagram("aaaa", "Mary"));		
		assertEquals(true, isAnagram("Debit card", "Debitc Ard"));
	}
}
