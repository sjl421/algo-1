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
    
    static void removeNode(Node p) {
        Node q = p.next;
        p.data = q.data;
        p.next = q;
    }
}
