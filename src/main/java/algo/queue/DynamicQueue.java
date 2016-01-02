package algo.queue;

import algo.Collection;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Basic implementation of queue supporting dynamic size.
 *
 * @author akhalikov
 */
public class DynamicQueue<E> implements Queue<E>, Collection<E> {

  private static final int DEFAULT_CAPACITY = 10;
  private Object[] elements = new Object[DEFAULT_CAPACITY];
  private int capacity = DEFAULT_CAPACITY;
  private int tail, head;

  @Override
  public boolean add(E item) {
    int newTail = tail + 1;
    if (newTail > capacity) {
      capacity += capacity >> 1;
      elements = Arrays.copyOf(elements, capacity);
      // + ensure new capacity is not more MAX_INT
    }
    elements[newTail] = item;
    tail = newTail;
    return true;
  }

  @Override
  public E remove() {
    E item = (E) elements[head];
    elements[head] = null;
    head++;
    return item;
  }

  @Override
  public E peek() {
    return (E) elements[head];
  }

  @Override
  public boolean isEmpty() {
    return tail == head && tail == 0;
  }

  @Override
  public int size() {
    return tail - head;
  }

  @Override
  public Iterator<E> iterator() {
    return null;
  }

  @Override
  public Object[] toArray() {
    return elements;
  }
}
