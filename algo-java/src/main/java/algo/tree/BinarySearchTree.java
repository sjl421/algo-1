package algo.tree;

import java.util.Iterator;

/**
 * Binary search tree implementation
 */
public class BinarySearchTree<E> implements Tree<E> {
  private Tree.Node<E> root;
  private int size;

  BinarySearchTree() {
  }

  BinarySearchTree(Node<E> root) {
    this.root = root;
    this.size = TreeProperties.height(root);
  }

  BinarySearchTree(E... items) {
    insert(items);
  }

  /**
   * Method to insert new item into a binary search tree.
   * The worst case time complexity: is O(h) where h is height of BST
   * @param key
   */
  @Override
  public void insert(E key) {
    insertRecursively(root, key, root);
  }

  public void insert(E... keys) {
    for (E key: keys)
      insertRecursively(root, key, root);
  }

  /**
   * Remove node and return
   * @param key
   */
  @Override
  public void remove(E key) {
    removeRecursively(root, key);
  }

  @Override
  public Node<E> find(E key) {
    return TreeSearch.find(root, key);
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public Node<E> getRoot() {
    return root;
  }

  private Node<E> removeRecursively(final Node<E> node, E data) {
    if (node == null)
      return null;

    Comparable comp = (Comparable) data;
    int value = comp.compareTo(node.data);
    if (value < 0) {
      // continue traversing left subtree
      node.left = removeRecursively(node.left, data);
    } else if (value > 0) {
      node.right = removeRecursively(node.right, data);

      // if key's are the same, then this is the node to be deleted
    } else {

      // node with only one child or no child
      if (node.left == null)
        return node.right;
      else if (node.right == null)
        return node.left;

      // node with two children: get the in-order successor
      // (smallest in the right subtree)
      Node<E> min = findMin(node.right);
      node.data = min.data;

      // Delete the inorder successor
      node.right = removeRecursively(node.right, min.data);
    }
    return node;
  }

  /**
   * A recursive function to insert a new key into BST
   * @param node Node at which new item will be inserted
   * @param data New item
   * @param parent Parent item
   * @return Node
   */
  private Node<E> insertRecursively(Node<E> node, E data, Node<E> parent) {
    if (node == null) {
      final Node<E> newNode = new Node(data);
      if (this.root == null) {
        this.root = newNode;
      } else {
        newNode.parent = parent;
      }
      size++;
      return newNode;
    } else {
      int cmp = ((Comparable) data).compareTo(node.data);
      if (cmp < 0)
        node.left = insertRecursively(node.left, data, node);
      else if (cmp > 0)
        node.right = insertRecursively(node.right, data, node);
      return node;
    }
  }

  /**
   * Minimum node
   * @param root Node
   * @return E
   */
  private Node<E> findMin(Node<E> root) {
    Node<E> p = root;
    while (root.left != null)
      p = p.left;
    return p;
  }

  /**
   * In-order iterator implementation
   * todo: implement
   * @param <E>
   */
  private class InOrderIteratorImpl<E> implements Iterator<E> {
    @Override
    public boolean hasNext() {
      return false;
    }

    @Override
    public E next() {
      return null;
    }
  }
}
