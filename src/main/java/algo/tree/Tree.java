package algo.tree;

import java.util.Iterator;

/**
 * Binary search tree data structure
 */
public class Tree<E> {
  private Node<E> root;
  private int size;

  public Tree() {
  }

  public Tree(Node<E> root) {
    this.root = root;
    this.size = TreeProperties.height(root);
  }

  public Tree(E... items) {
    insert(items);
  }

  /**
   * Method to insert new item into a binary search tree.
   * The worst case time complexity: is O(h) where h is height of BST
   * @param data Item
   */
  public void insert(E data) {
    insertRecursively(root, data, root);
  }

  public void insert(E... items) {
    for (E data: items)
      insertRecursively(root, data, root);
  }

  /**
   * Remove node and return
   * @param data
   * @return
   */
  public void remove(E data) {
    removeRecursively(root, data);
  }

  public Node<E> getRoot() {
    return root;
  }

  public int getSize() {
    return size;
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
   * Tree node
   * @param <E>
   */
  public static class Node<E> {
    private E data;
    private Node<E> parent;
    private Node<E> left;
    private Node<E> right;

    public Node(E data) {
      this.data = data;
    }

    public Node(E data, Node<E> left, Node<E> right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }

    public Node(E data, Node<E> parent, Node<E> left, Node<E> right) {
      this.data = data;
      this.parent = parent;
      this.left = left;
      this.right = right;
    }

    public E getData() {
      return data;
    }

    public void setData(E data) {
      this.data = data;
    }

    public Node<E> getParent() {
      return parent;
    }

    public void setParent(Node<E> parent) {
      this.parent = parent;
    }

    public Node<E> getLeft() {
      return left;
    }

    public void setLeft(Node<E> left) {
      this.left = left;
    }

    public Node<E> getRight() {
      return right;
    }

    public void setRight(Node<E> right) {
      this.right = right;
    }
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
