package algo.tree;

public class Node<E> {

    E data;
    Node left;
    Node right;

    public Node(E data) {
        this.data = data;
    }

    public Node(E data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public E getData() {
        return data;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }
}
