package algo.lists;

import java.util.Stack;

/**
 * Traversing a linked list
 *
 * @author akhalikov
 */
public class ListTraversal {
  public static class Node {
    int data;
    Node next;

    public Node(int data, Node next) {
      this.data = data;
      this.next = next;
    }
  }

  /**
   * Counting backwards from the tail node of the linked list,
   * get the value of the node at the given position.
   * <p>
   * Implementation using stack
   * Run time = O(n), memory = O(n)
   */
  static int getNode1(Node head, int n) {
    Stack<Integer> stack = new Stack<>();
    Node curr = head;
    while (curr.next != null) {
      curr = curr.next;
      stack.push(curr.data);
    }
    int data = 0;
    while (n > 0) {
      data = stack.pop();
      n--;
    }
    return data;
  }

  /**
   * Counting backwards from the tail node of the linked list,
   * get the value of the node at the given position.
   * <p>
   * Simple two-run implementation
   * RunTime = O(n), Memory = O(1)
   */
  static int getNode2(Node head, int n) {
    Node curr = head;
    int size = 1;
    while (curr.next != null) {
      curr = curr.next;
      size++;
    }
    curr = head;
    int index = 1, data = 0;
    while (curr != null) {
      if (index++ == size - n) {
        data = curr.data;
        break;
      }
      curr = curr.next;
    }
    return data;
  }
}
