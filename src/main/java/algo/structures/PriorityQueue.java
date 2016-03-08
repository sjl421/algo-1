package algo.structures;

import java.util.Comparator;

public interface PriorityQueue<E> {

  boolean isEmpty();
  E max();
  E extractMax();
  void insert(E key);
  int getSize();
  Comparator<E> getComparator();
}
