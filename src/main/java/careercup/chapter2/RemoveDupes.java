package careercup.chapter2;

import java.util.HashSet;

/**
 * Write code to remove duplicates from an unsorted linked list (single-linked list).
 * FOLLOW UP
 * How would you solve this problem if a temporary buffer is not allowed?
 *
 * @author ahalikov
 */
class RemoveDupes {
    public static class Node {
        int data;
        Node next;

        public Node() {
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    /**
     * Solution using hash-table to track duplicate elements
     */
    static Node removeDupes(Node head) {
        if (head == null || head.next == null)
            return head;

        Node curr = head.next,
             prev = head;
        HashSet<Integer> seen = new HashSet<>();
        while (curr != null) {
            if (seen.contains(curr.data)) {
                // removing duplicate element
                prev.next = curr.next;
                curr.next = null;
            } else {
                seen.add(curr.data);
            }
            prev = curr;
            curr = curr.next;
        }
        return head;
    }
}
