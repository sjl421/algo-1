package careercup.chapter2;

import algo.stack.LinkedStack;
import algo.stack.Stack;

/**
 * Implement a function to check if a linked list is a palindrome.
 *
 * Assumptions:
 *  - singly-linked list
 *
 * @author akhalikov
 */
public class CheckPalindrome {
  static class Node {
    int data;
    Node next;

    public Node(int data, Node next) {
      this.data = data;
      this.next = next;
    }
  }

  /**
   * Algorithm:
   *  - push first half into stack
   *  - compare second part of a list with values from stack
   *
   * Time complexity: O(n)
   * Space complexity: O(n)
   *
   * @param head List
   * @return true if LL is palindrome
   */
  static boolean isPalindrome(Node head) {
    if (head == null)
      throw new NullPointerException("List's head is null");
    Stack<Integer> stack = new LinkedStack<>();
    Node n = head;
    int len = getLength(head),
        mid = len / 2,
        i = 0;
    while (n != null) {
      // pushing first half into stack
      if (i < mid)
        stack.push(n.data);
      else if (i > mid) {
        // compare second half with stack values
        if (stack.pop() != n.data)
          return false;
      }
      n = n.next;
    }
    return true;
  }

  /**
   * Time/space complexity: O(n)
   * @param head List's head
   * @return Length of the list
   */
  private static int getLength(Node head) {
    int len = 0;
    while (head != null) {
      head = head.next;
      len++;
    }
    return len;
  }
}
