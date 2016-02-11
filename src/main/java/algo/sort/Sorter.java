package algo.sort;

import algo.Algorithm;

public abstract class Sorter<E> implements Algorithm {

  public abstract void sort(E[] array);

  protected void validate(E[] array) {
    if (array == null)
      throw new NullPointerException("Input array must not be null");
  }
}
