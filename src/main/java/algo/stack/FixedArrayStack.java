package algo.stack;

import algo.Collection;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Iterator;

/**
 * Basic implementation of a stack based on array of fixed size.
 * Stack is LIFO (last in - first out) dynamic set.
 *
 * @author akhalikov
 */
public class FixedArrayStack<E> implements Stack<E>, Collection<E> {
  private Object[] elements;
  private int capacity;

  /**
   * Next free cell from the top element of a stack
   */
  private int head;

  public FixedArrayStack(int capacity) {
    this.capacity = capacity;
    this.elements = new Object[capacity];
  }

  @Override
  public void push(E item) {
    if (capacity - head <= 0)
      throw new RuntimeException("Stack is full");
    elements[head++] = item;
  }

  @Override
  public E pop() {
    E item = (E) elements[head - 1];
    elements[--head] = null;
    return item;
  }

  @Override
  public E peek() {
    return (E) elements[head - 1];
  }

  @Override
  public boolean isEmpty() {
    return head == 0;
  }

  @Override
  public int size() {
    return head;
  }

  @Override
  public Iterator<E> iterator() {
    throw new NotImplementedException();
  }

  @Override
  public Object[] toArray() {
    return elements;
  }
}
