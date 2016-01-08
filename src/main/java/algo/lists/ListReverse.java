package algo.lists;

/**
 * Reversing a linked list
 *
 * @author akhalikov
 */
class ListReverse {
  /**
   * Single linked-list node
   */
  static class Node {
    int data;
    Node next;

    public Node(int data, Node next) {
      this.data = data;
      this.next = next;
    }
  }

  /**
   * Reverse a single linked list iteratively
   */
  static Node reverse1(Node head) {
    if (head == null)
      return null;

    Node prev = null, curr = head, next = curr.next;
    while (curr != null) {
      curr.next = prev;
      // swap
      prev = curr;
      curr = next;
      if (curr != null)
        next = curr.next;
    }
    return prev;
  }

  /**
   * Reverse a single linked list recursively
   */
  static Node reverse2(Node curr, Node prev) {
    if (curr.next == null) {
      curr.next = prev;
      return curr;
    }
    Node next = curr.next;
    curr.next = prev;
    return reverse2(next, curr);
  }

  /**
   * Reverse a doubly-linked list
   *
   * In:  NULL <-- 2 <--> 4 <--> 6 --> NULL
   * Out: NULL <-- 6 <--> 4 <--> 2 --> NULL
   */
  static LinkedList.Node reverse3(LinkedList.Node first) {
    if (first == null)
      return null;
    if (first.getNext() == null)
      return first;
    LinkedList.Node curr = first, res = first;
    LinkedList.Node savedPrev, savedNext;
    while (curr != null) {
      savedPrev = curr.getPrev();
      savedNext = curr.getNext();
      curr.setPrev(curr.getNext());
      curr.setNext(savedPrev);
      if (savedNext == null) {
        res = curr;
      }
      curr = savedNext;
    }
    return res;
  }
}
