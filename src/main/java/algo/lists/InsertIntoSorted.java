package algo.lists;

/**
 * Insert a node into a sorted doubly linked list
 * todo: review
 *
 * @author ahalikov
 */
class InsertIntoSorted {
/*
  static sortedInsert(Node<Integer> head, int data) {
    if (head == null) {
      // creating new list
      head = new Node(data);
    } else {
      Node curr = head;
      while (curr != null) {
        if (curr.getItem() < data && curr.next != null && data <= curr.next.data) {
          // Inserting after current node
          Node p = new Node();
          p.data = data;
          p.prev = curr;
          p.next = curr.next;

          // Swapping links in prev in next nodes
          curr.next.prev = p;
          curr.next = p;
          return head;
        } else if (curr.data < data && curr.next == null) {
          // Adding node into the tail
          Node p = new Node();
          p.data = data;
          p.prev = curr;
          curr.next = p;
          return head;
        } else if (curr.data >= data) {
          // Inserting node to the head
          Node p = new Node();
          p.data = data;
          p.next = curr;
          curr.prev = p;
          return p;
        }
        curr = curr.next;
      }
    }
  }
*/
}
