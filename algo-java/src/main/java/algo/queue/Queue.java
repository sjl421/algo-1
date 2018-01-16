package algo.queue;

/**
 * Basic interface for FIFO queue
 */
public interface Queue<E> {
  /**
   * Add an item to the end of the list
   */
  boolean add(E item);

  /**
   * Remove and return the first item in the queue
   */
  E remove();

  /**
   * Return the first item in the list
   */
  E peek();

  /**
   * Return true if and only if queue is empty
   */
  boolean isEmpty();
}
