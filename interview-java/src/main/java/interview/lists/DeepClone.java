package interview.lists;

/**
 * Deep clone singly linked list with random links
 */
public class DeepClone {

  public static Node clone(Node head) {
    Node clone;
    Node curr = head;
    while (curr != null) {
      clone = new Node();
      clone.data = curr.data;
      clone.next = curr.random;

      curr = curr.next;
    }
    return null;
  }

  static class Node {
    int data;
    Node next;
    Node random;
  }
}
