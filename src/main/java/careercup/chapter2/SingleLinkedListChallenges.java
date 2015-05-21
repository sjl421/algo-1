package careercup.chapter2;

import algo.lists.SingleLinkedList;

/**
 * Challenges with SingleLinkedList
 *
 * @author ahalikov
 */
public class SingleLinkedListChallenges {

    static class Node {
        int item;
        Node next;

        public Node(int item) {
            this.item = item;
        }

        void addLast(int n) {
            Node end = new Node(n);
            Node prev = next;
            next = end;
        }
    }

    /**
     * Implement an algorithm to find the n-th to last element of a singly linked list.
     */
    public <E> void removeNthLast(SingleLinkedList<E> list, int n) {
        /**
         * Assumption: size(list) >= n
         */

    }
}
