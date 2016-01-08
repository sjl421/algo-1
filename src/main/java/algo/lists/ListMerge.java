package algo.lists;

/**
 * Merging linked lists
 *
 * @author akhalikov
 */
public class ListMerge {
  static class Node {
    int data;
    Node next;

    public Node(int data, Node next) {
      this.data = data;
      this.next = next;
    }
  }

  /**
   * Merging of two sorted linked lists recursively
   */
  static Node merge1(Node list1, Node list2) {
    if (list1 == null) return list2;
    if (list2 == null) return list1;
    if (list1.data < list2.data) {
      list1.next = merge1(list1.next, list2);
      return list1;
    } else {
      list2.next = merge1(list1, list2.next);
      return list2;
    }
  }

  /**
   * Merging of two sorted linked lists iteratively
   */
  static Node merge2(Node list1, Node list2) {
    if (list1 == null) return list2;
    if (list2 == null) return list1;
    return list1;
  }
}
