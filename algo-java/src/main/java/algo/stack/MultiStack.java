package algo.stack;

/**
 * Multi stack interface
 *
 * @author akhalikov
 */
public interface MultiStack<E> {

  void push(int stackId, E item);

  E pop(int stackId);

  E peek(int stackId);

  boolean isEmpty(int stackId);
}
