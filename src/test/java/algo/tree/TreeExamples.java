package algo.tree;

class TreeExamples {
  /**
   *       3
   *      / \
   *     /   \
   *    5    2
   *   / \  / \
   *  1  4 6  7
   *  \      /
   *   9    8
   */
  static Tree tree1() {
    Tree.Node n4 = new Tree.Node(1, null, new Tree.Node(9));
    Tree.Node n7 = new Tree.Node(7, new Tree.Node(8), null);
    Tree.Node n2 = new Tree.Node(5, n4, new Tree.Node(4));
    Tree.Node n3 = new Tree.Node(2, new Tree.Node(6), n7);
    Tree.Node root = new Tree.Node(3, n2, n3);
    return new BinarySearchTree<>(root);
  }

  /**
   *       1
   *     /   \
   *    2    3
   *    \
   *    4
   *     \
   *     5
   *      \
   *      6
   */
  static Tree tree2() {
    Tree.Node n2 = new Tree.Node(2, null,
      new Tree.Node(4, null, new Tree.Node(5, null,
        new Tree.Node(6))));
    Tree.Node root = new Tree.Node(1, n2, new Tree.Node(3));
    return new BinarySearchTree<>(root);
  }
}
