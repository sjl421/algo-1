package algo.tree;

import algo.queue.LinkedQueue;
import algo.queue.Queue;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Top view of a binary tree is the set of nodes visible when the tree is viewed from the top.
 * A node x is in a 'Top view' if x is the topmost node at its horizontal distance.
 * Horizontal distance of left child of a node x is equal to horizontal distance of x minus 1,
 * and that of right child is horizontal distance of x plus 1.
 * See also: {@link VerticalTraversal}
 */
class TopView {
  /**
   * Solution based on vertical-order traversal
   * Compared to {@link VerticalTraversal}, only node with minimal height is stored.
   */
  static void printTopView1(Tree tree) {
    Map<Integer, MapItem> map = new TreeMap();
    fillVerticalOrderMap(tree.getRoot(), 0, 0, map);
    map.keySet().forEach(key ->
        System.out.print(map.get(key).data + " ")
    );
  }

  private static void fillVerticalOrderMap(Tree.Node node, int hd, int height,
                                           Map<Integer, MapItem> map) {
    if (node == null)
      return;

    MapItem item = map.get(hd);
    if (item == null
      || (item != null && height < item.height)) {
      map.put(hd, new MapItem(node.getData(), height));
    }
    fillVerticalOrderMap(node.getLeft(), hd-1, height+1, map);
    fillVerticalOrderMap(node.getRight(), hd+1, height+1, map);
  }

  static class MapItem {
    Object data;
    int height;

    MapItem(Object data, int height) {
      this.data = data;
      this.height = height;
    }
  }

  /**
   * Solution based on level order traversal
   * Does not maintain vertical order
   * @param tree
   */
  static void printTopView2(Tree tree) {
    if (tree == null || tree.getRoot() == null)
      return;

    final Set<Integer> seen = new HashSet();

    final Queue<QueueNode> queue = new LinkedQueue();
    QueueNode qn = new QueueNode(tree.getRoot(), 0);
    queue.add(qn);

    while (!queue.isEmpty()) {
      qn = queue.remove();

      int hd = qn.hd;
      Tree.Node node = qn.node;
      if (!seen.contains(hd)) {
        // found topmost node
        seen.add(hd);
        System.out.print(node.getData() + " ");
      }
      if (node.getLeft() != null)
        queue.add(new QueueNode(node.getLeft(), hd - 1));
      if (node.getRight() != null)
        queue.add(new QueueNode(node.getRight(), hd + 1));
    }
  }

  private static class QueueNode {
    Tree.Node node;
    int hd;

    QueueNode(Tree.Node node, int hd) {
      this.node = node;
      this.hd = hd;
    }
  }
}
