package algo.tree;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author ahalikov
 */
public class TreeTraversal {
    /**
     * Breadh-first or level-order traversal of a tree
     * @param root
     */
    static void breadthFirst(Node root) {
        if (root == null) return;
        Deque<Node> q = new ArrayDeque<>();
        q.offer(root);
        while (!q.isEmpty()) {
            Node curr = q.poll();
            System.out.print(curr.data + " ");
            if (curr.left != null)
                q.offer(curr.left);
            if (curr.right != null)
                q.offer(curr.right);
        }
        System.out.println();
    }

    /**
     * Pre-order traversal: root, left, right
     * @param root
     */
    static void preOrder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static class Node {
        char data;
        Node left;
        Node right;

        public Node(char data) {
            this.data = data;
        }

        public Node(char data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
}
