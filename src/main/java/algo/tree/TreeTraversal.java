package algo.tree;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Tree traversal methods
 *
 * @author ahalikov
 */
public class TreeTraversal {
    /**
     * Breadh-first or level-order traversal of a tree
     * @param root Root node
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
     * @param root Root node
     */
    static void preOrder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    /**
     * In-order traversal: left, root, right
     * Complexity: Time O(n), Space O(h), where h = height of a tree
     * in most cases h = O(log n)
     * @param root Root node
     */
    static void inOrder(Node root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    /**
     * Post-order traversal: left, right, root
     * Complexity: Time O(n), Space O(h), where h = height of a tree
     * in most cases h = O(log n)
     * @param root Root node
     */
    static void postOrder(Node root) {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
}
