package careercup.chapter2;

/**
 * Implement an algorithm to delete a node in the middle of a single linked list, 
 * given only access to that node.
 */
public class RemoveNode {
    
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
    
    static boolean removeNode(Node n) {
        if (n == null || n.next == null) {
            return false;
        }
        Node next = n.next;
        n.data = next.data;
        n.next = next.next;
        return true;
    }
}
