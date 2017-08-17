package algo.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {
  @Test
  public void testInsert() throws Exception {
    BinarySearchTree<Integer> tree = new BinarySearchTree<>();
    tree.insert(12, 5, 9, 2, 17, 19, 18);
    assertEquals(7, tree.size());
    tree.insert(13);
    assertEquals(8, tree.size());
  }

  @Test
  public void testRemove() throws Exception {
    System.out.println("testRemove start");
    Tree<Integer> tree = new BinarySearchTree<>(12, 5, 9, 2, 17, 19, 18);
    LevelView.printLevelOrder(tree);
    tree.remove(18);

    Tree.Node node = TreeSearch.find(tree, 19);
    assertNull(node.getLeft());
    assertNull(node.getRight());

    System.out.println("After remove 5 and 18");
    tree.remove(5);
    LevelView.printLevelOrder(tree);
    System.out.println("testRemove finish");
  }
}