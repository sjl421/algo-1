package algo.tree;

/**
 * Binary tree implementation
 */
public class Tree<E> {
  private Node<E> root;
  private int size;

  public Tree() {
  }

  public Tree(E... items) {
    insert(items);
  }

  public void insert(E data) {
    recursiveInsert(root, data, root);
  }

  public void insert(E... items) {
    for (E data: items) {
      recursiveInsert(root, data, root);
    }
  }

  private Node<E> recursiveInsert(Node<E> node, E data, Node<E> parent) {
    if (node == null) {
      Node<E> newNode = new Node(data, parent);
      if (root == null) {
        root = newNode;
      }
      size++;
      return newNode;
    } else {
      int cmp = ((Comparable) data).compareTo(node.data);
      if (cmp < 0)
        node.left = recursiveInsert(node.left, data, node);
      else
        node.right = recursiveInsert(node.right, data, node);
      return node;
    }
  }

  public Node<E> getRoot() {
    return root;
  }

  public int getSize() {
    return size;
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

    public Node(E data, Node<E> parent) {
      this.data = data;
      this.parent = parent;
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
}
