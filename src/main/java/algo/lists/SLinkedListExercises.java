package algo.lists;

import java.util.Stack;

/**
 * Some exercises with singly-linked list
 * @author ahalikov
 */
class SLinkedListExercises {

    static class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
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
        if (list1.data < list2.data) {
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

    /**
     * Counting backwards from the tail node of the linked list,
     * get the value of the node at the given position.
     *
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
     *
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

    /**
     * Remove duplicate node-values from sorted linked list.
     * Input list is sorted in ascending order.
     *
     * 1->2->3->3->3->6->8->11->Null
     */
    static Node removeDuplicates(Node head) {
        if (head == null) return null;
        Node curr = head, prev = null;
        while (curr != null) {
            if (prev != null && curr.data == prev.data) {
                // removing current node
                prev.next = curr.next;
                curr.data = 0;
                curr.next = null;
                curr = prev.next;
            } else {
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }

    /**
     * Detect cycle in a linked list
     * @return true if the input list has cycle, false otherwise
     *
     * Floyd's Tortoise-Hare O(n) algorithm
     */
    static boolean hasLoop(Node head) {
        if (head == null || head.next == null) return false;
        if (head.next == head) return true;

        Node tortoise = head, // slowest pointer
                p,            // middle pointer
                hare = head;  // hare - fastest pointer
        while (tortoise != null
                && (p = hare.next) != null
                && (hare = p.next) != null) {
            if (tortoise == p || tortoise == hare) return true;
            tortoise = tortoise.next;
        }
        return false;
    }

    /**
     * Returns node where loop starts
     * @param head
     * @return
     */
    static Node findLoop(Node head) {
        if (head == null || head.next == null) return null;
        if (head.next == head) return head;

        Node pSlow = head, pFast = head, temp;
        Node meetNode = null;
        while (pSlow != null
                && (temp = pFast.next) != null
                && (pFast = temp.next) != null) {
            if (pSlow == temp || pSlow == pFast) {
                meetNode = pSlow;
            } else {
                pSlow = pSlow.next;
            }
        }
        if (meetNode != null) {
            // we have a loop, let's find where it starts
            pSlow = head;
            temp = meetNode;
            while (temp != pSlow) {
                temp = temp.next;
            }
        }
        return null;
    }
}
