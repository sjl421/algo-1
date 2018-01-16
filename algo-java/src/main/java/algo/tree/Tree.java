package algo.tree;

/**
 * Binary search tree data structure
 */
public interface Tree<E> {

  void insert(E key);

  Node<E> find(E key);

  void remove(E key);

  int size();

  Node<E> getRoot();

  /**
   * Tree node
   * @param <E>
   */
  class Node<E> {
    E data;
    Node<E> parent;
    Node<E> left;
    Node<E> right;

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
}
