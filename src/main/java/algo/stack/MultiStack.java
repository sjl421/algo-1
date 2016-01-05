package algo.stack;

/**
 * Multi stack interface
 *
 * @author akhalikov
 */
public interface MultiStack<E> {
  /**
   * Add an item into the stack, identified by stackId
   *
   * @param stackId
   * @param item
   */
  void push(int stackId, E item);

  /**
   * Remove the top item from the stack
   * @param stackId
   * @return item
   */
  E pop(int stackId);

  /**
   * Return the top item of the stack
   * @param stackId
   * @return item
   */
  E peek(int stackId);

  /**
   * Return true if and only if stack is empty
   */
  boolean isEmpty(int stackId);
}
