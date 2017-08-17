package algo.tree;

import algo.queue.LinkedQueue;
import algo.queue.Queue;

/**
 * Basic methods of traversing a binary tree
 */
class BasicTraversal {
  /**
   * Level-order (breadth-first) traversal of a tree
   *
   * @param root Root node
   */
  static void levelOrder(Tree.Node root) {
    if (root == null) return;
    Queue<Tree.Node> queue = new LinkedQueue<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      Tree.Node curr = queue.remove();
      System.out.print(root.getData() + " ");
      if (curr.getLeft() != null)
        queue.add(curr.getLeft());
      if (curr.getRight() != null)
        queue.add(curr.getRight());
    }
    System.out.println();
  }

  /**
   * Pre-order traversal: root, left, right
   *
   * @param root Root node
   */
  static void preOrder(Tree.Node root) {
    if (root == null) return;
    System.out.print(root.getData() + " ");
    preOrder(root.getLeft());
    preOrder(root.getRight());
  }

  /**
   * In-order traversal: left, root, right
   * Complexity: Time O(n), Space O(h), where h = height of a tree
   * in most cases h = O(log n)
   *
   * @param root Root node
   */
  static void inOrder(Tree.Node root) {
    if (root == null) return;
    inOrder(root.getLeft());
    System.out.print(root.getData() + " ");
    inOrder(root.getRight());
  }

  /**
   * Post-order traversal: left, right, root
   * Complexity: Time O(n), Space O(h), where h = height of a tree
   * in most cases h = O(log n)
   *
   * @param root Root node
   */
  static void postOrder(Tree.Node root) {
    if (root == null) return;
    postOrder(root.getLeft());
    postOrder(root.getRight());
    System.out.print(root.getData() + " ");
  }
}
