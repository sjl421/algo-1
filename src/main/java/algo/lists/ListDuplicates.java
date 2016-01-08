package algo.lists;

/**
 * Identifying duplicates in a linked list
 *
 * @author akhalikov
 */
public class ListDuplicates {
  static class Node {
    int data;
    Node next;

    public Node(int data, Node next) {
      this.data = data;
      this.next = next;
    }
  }

  /**
   * Remove duplicate node-values from sorted linked list.
   * Input list is sorted in ascending order.
   * <p>
   * 1->2->3->3->3->6->8->11->Null
   */
  static Node removeDuplicates(Node head) {
    if (head == null) return null;
    Node curr = head, prev = null;
    while (curr != null) {
      if (prev != null && curr.data == prev.data) {
        // removing current node
        prev.next = curr.next;
        curr.data = 0;
        curr.next = null;
        curr = prev.next;
      } else {
        prev = curr;
        curr = curr.next;
      }
    }
    return head;
  }
}
