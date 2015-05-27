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
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        if (list1.item < list2.item) {
            list1.next = mergeLists(list1.next, list2); 
            return list1;
        } else {
            list2.next = mergeLists(list1, list2.next); 
            return list2;
        }
    }
}
