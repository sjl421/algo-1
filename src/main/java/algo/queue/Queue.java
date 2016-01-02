package algo.queue;

/**
 * Basic interface for FIFO queue
 */
public interface Queue<E> {
  /**
   * Add an item to the end of the list
   * @param item
   * @return
   */
  boolean add(E item);

  /**
   * Remove and return the first item in the queue
   * @return removed item
   */
  E remove();

  /**
   * Return the first item in the list
   * @return first item
   */
  E peek();

  /**
   * Return true if and only if queue is empty
   * @return boolean
   */
  boolean isEmpty();
}
