package algo.lists;

/**
 * Finding a loop in a linked list
 */
public class Loops {
  /**
   * Detect cycle in a linked list
   * Classic approach: Floyd's Tortoise-Hare O(n) algorithm
   *
   * @return true if the input list has cycle, false otherwise
   */
  static boolean hasLoop(Node head) {
    if (head == null || head.next == null)
      return false;
    if (head.next == head)
      return true;

    Node slow = head;    // slowest pointer
    Node fast;           // middle pointer
    Node fastest = head; // fastest pointer

    while (slow != null
      && (fast = fastest.next) != null
      && (fastest = fast.next) != null) {

      if (slow == fast || slow == fastest) return true;
      slow = slow.next;
    }
    return false;
  }

  /**
   * Returns node where loop starts
   */
  static Node findLoop(Node head) {
    if (head == null || head.next == null)
      return null;
    if (head.next == head)
      return head;

    Node slow = head, fast = head, temp;
    Node meetNode = null;
    while (slow != null
      && (temp = fast.next) != null
      && (fast = temp.next) != null) {
      if (slow == temp || slow == fast) {
        meetNode = slow;
      } else {
        slow = slow.next;
      }
    }
    if (meetNode != null) {
      // we have a loop, let's find where it starts
      slow = head;
      temp = meetNode;
      while (temp != slow) {
        temp = temp.next;
      }
    }
    return null;
  }

  static class Node {
    int data;
    Node next;

    public Node(int data, Node next) {
      this.data = data;
      this.next = next;
    }
  }
}
