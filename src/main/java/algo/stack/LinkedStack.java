package algo.stack;

/**
 * Basic implementation of a LIFO stack based on linked list.
 */
public class LinkedStack<E> implements Stack<E> {
  /**
   * Top element of a stack
   */
  private StackNode top;

  @Override
  public void push(E item) {
    StackNode node = new StackNode(item);
    node.next = top;
    top = node;
  }

  @Override
  public E pop() {
    if (top == null)
      throw new RuntimeException("Stack is empty");
    Object data = top.data;
    top = top.next;
    return (E) data;
  }

  @Override
  public E peek() {
    if (top == null)
      throw new RuntimeException("Stack is empty");
    return (E) top.data;
  }

  @Override
  public boolean isEmpty() {
    return top == null;
  }

  /**
   * Node of a stack
   * @param <E>
   */
  private static class StackNode<E> {
    private Object data;
    private StackNode<E> next;

    StackNode(E data) {
      this.data = data;
    }
  }
}
