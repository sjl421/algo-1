package careercup.chapter2;

import careercup.chapter2.CheckPalindrome.Node;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test for {@link CheckPalindrome}
 *
 * @author akhalikov
 */
public class CheckPalindromeTest {
  @Test
  public void testIsPalindrome() throws Exception {
    Node head = new Node(4, new Node(3, new Node(2, new Node(1,
      new Node(2, new Node(3, new Node(4, null)))))));
    assertTrue(CheckPalindrome.isPalindrome(head));
  }

  @Test
  public void testIsPalindrome2() throws Exception {
    Node head = new Node(4, new Node(3, new Node(2,
      new Node(2, new Node(3, new Node(4, null))))));
    assertTrue(CheckPalindrome.isPalindrome(head));
  }

  @Test
  public void testIsPalindrome3() throws Exception {
    Node head = new Node(33, null);
    assertTrue(CheckPalindrome.isPalindrome(head));
  }

  @Test(expected = NullPointerException.class)
  public void testIsPalindrome4() throws Exception {
    assertTrue(CheckPalindrome.isPalindrome(null));
  }
}