package algo.structures;

import java.util.Comparator;

/**
 * Created by akhalikov on 10/02/16
 */
public class Heap<E> implements PriorityQueue<E> {
  private Object[] items;
  int size;

  @Override
  public boolean isEmpty() {
    return false;
  }

  @Override
  public E max() {
    return null;
  }

  @Override
  public E extractMax() {
    return null;
  }

  @Override
  public void add(E element) {

  }

  @Override
  public int getSize() {
    return 0;
  }

  @Override
  public Comparator<E> getComparator() {
    return null;
  }
}
