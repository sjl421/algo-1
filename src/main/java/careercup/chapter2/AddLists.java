package careercup.chapter2;

/**
 * You have two numbers represented by a linked list,
 * where each node contains a single digit.
 * The digits are stored in reverse order,
 * such that the 1’s digit is at the head of the list.
 * Write a function that adds the two numbers and returns the sum as a linked list.
 *
 * EXAMPLE
 * Input: (3 -> 1 -> 5) + (5 -> 9 -> 2)
 * Output: 8 -> 0 -> 8
 */
class AddLists {
    static class Node {
        int data;
        Node next;

        public Node() {
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    static Node sum(Node list1, Node list2) {
        return null;
    }
}
