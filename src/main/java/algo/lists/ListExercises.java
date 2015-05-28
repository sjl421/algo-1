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

    /**
     * Reversing a single linked list recursively
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
     * Merging of two sorted linked lists recursively
     */
    static Node mergeLists1(Node list1, Node list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        if (list1.item < list2.item) {
            list1.next = mergeLists1(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeLists1(list1, list2.next);
            return list2;
        }
    }
    
    /**
     * Merging of two sorted linked lists iteratively
     */
    static Node mergeLists2(Node list1, Node list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        return list1;
    }
}
