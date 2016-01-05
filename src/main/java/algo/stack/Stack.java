package algo.stack;

/**
 * Stack interface
 */
public interface Stack<E> {
  /**
   * Add an item to the top of the stack
   *
   * @param item
   */
  void push(E item);

  /**
   * Remove the top item from the stack
   *
   * @return item
   */
  E pop();

  /**
   * Return the top item of the stack
   *
   * @return item
   */
  E peek();

  /**
   * Return true if and only if stack is empty
   */
  boolean isEmpty();
}
