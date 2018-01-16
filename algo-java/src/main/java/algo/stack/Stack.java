package algo.stack;

/**
 * Stack interface
 */
public interface Stack<E> {

  void push(E item);

  E pop();

  E peek();

  boolean isEmpty();
}
