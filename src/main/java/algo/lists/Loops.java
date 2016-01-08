package algo.lists;

/**
 * Finding loop in a linked list
 *
 * @author akhalikov
 */
public class Loops {
  static class Node {
    int data;
    Node next;

    public Node(int data, Node next) {
      this.data = data;
      this.next = next;
    }
  }

  /**
   * Detect cycle in a linked list
   *
   * @return true if the input list has cycle, false otherwise
   * <p>
   * Floyd's Tortoise-Hare O(n) algorithm
   */
  static boolean hasLoop(Node head) {
    if (head == null || head.next == null)
      return false;
    if (head.next == head)
      return true;

    Node tortoise = head, // slowest pointer
      p,            // middle pointer
      hare = head;  // hare - fastest pointer

    while (tortoise != null
      && (p = hare.next) != null
      && (hare = p.next) != null) {
      if (tortoise == p || tortoise == hare) return true;
      tortoise = tortoise.next;
    }
    return false;
  }

  /**
   * Returns node where loop starts
   *
   * @param head
   * @return
   */
  static Node findLoop(Node head) {
    if (head == null || head.next == null)
      return null;
    if (head.next == head)
      return head;

    Node pSlow = head, pFast = head, temp;
    Node meetNode = null;
    while (pSlow != null
      && (temp = pFast.next) != null
      && (pFast = temp.next) != null) {
      if (pSlow == temp || pSlow == pFast) {
        meetNode = pSlow;
      } else {
        pSlow = pSlow.next;
      }
    }
    if (meetNode != null) {
      // we have a loop, let's find where it starts
      pSlow = head;
      temp = meetNode;
      while (temp != pSlow) {
        temp = temp.next;
      }
    }
    return null;
  }
}
