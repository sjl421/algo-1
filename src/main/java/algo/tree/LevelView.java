package algo.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Level-order view of a tree
 *
 * @author akhalikov
 */
public class LevelView {

  public static void printLevelOrder(Tree tree) {
    printLevelOrder(tree.getRoot());
  }

  static void printLevelOrder(Tree.Node root) {
    if (root == null)
      return;

    // New line marker
    final Tree.Node nlMarker = new Tree.Node(null);

    // Level order queue
    final Queue<Tree.Node> q = new LinkedList<>();
    q.add(root);
    q.add(nlMarker);

    while (!q.isEmpty()) {
      Tree.Node n = q.poll();
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
