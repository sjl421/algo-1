package algo.lists;

/**
 * @author ahalikov
 */
public class ListExercises {

    static class Node {
        int item;
        Node next;

        public Node(int item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    /**
     * Reversing a single linked list iteratively
     */
    static Node reverse1(Node head) {
        if (head == null)
            return null;

        Node prev = null,
                curr = head,
                next = curr.next;

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

    static Node head;

    /**
     * Reversing a single linked list recursively
     */
    static void reverse2(Node p) {
        if (p.next == null) {
            head = p;
            return;
        }
        reverse2(p.next);
        p.next.next = p;
        p.next = null;
    }

    /**
     * Merging of sorted linked lists
     */
    static Node mergeLists(Node list1, Node list2) {
        if (list1 == null && list2 == null)
            return null;
        if (list1 == null && list2 != null)
            return list2;
        if (list1 != null && list2 == null)
            return list1;

        Node temp = null, head2 = null, p1 = list1, p2 = list2;
        while (p1 != null || p2 != null) {
            if (p1 != null && p2 == null) {
                if (temp != null)
                    temp.next = p1;
                else
                    temp = p1;
            } else if (p1 == null && p2 != null) {
                if (temp != null)
                    temp.next = p2;
                else
                    temp = p2;
            } else if (p1.item < p2.item) {
                temp = p1;
                temp.next = p2;
            } else {
                temp = p2;
                temp.next = p1;
            }
            if (p1 != null) p1 = p1.next;
            if (p2 != null) p2 = p2.next;
            if (head2 == null) head2 = temp;
            if (temp.next != null) temp = temp.next.next;
        }
        return head2;
    }
}
