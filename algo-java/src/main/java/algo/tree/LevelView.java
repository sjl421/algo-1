package algo.tree;

import algo.tree.Tree.Node;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Level-order view of a tree
 */
public class LevelView {

  static void printLevelOrder(Tree tree) {
    printLevelOrder(tree.getRoot());
  }

  private static void printLevelOrder(Node root) {
    if (root == null)
      return;

    // New line marker
    final Node nlMarker = new Node(null);

    // Level order queue
    final Queue<Node> q = new LinkedList<>();
    q.add(root);
    q.add(nlMarker);

    while (!q.isEmpty()) {
      Node n = q.poll();
      if (n == nlMarker) {
        System.out.println();
        if (!q.isEmpty())
          q.add(nlMarker);
      } else {
        System.out.print(n.getData() + " ");
        if (n.getLeft() != null)
          q.add(n.getLeft());

        if (n.getRight() != null)
          q.add(n.getRight());
      }
    }
  }

  public static void main(String[] args) {
    Tree<Integer> tree = new BinarySearchTree<>(12, 5, 9, 2, 17, 19, 18);
    printLevelOrder(tree);
  }
}
