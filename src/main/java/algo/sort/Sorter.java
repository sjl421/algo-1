package algo.sort;

import algo.Algorithm;

public abstract class Sorter<T> implements Algorithm {

  public abstract void sort(T[] array);

  protected void validate(T[] array) {
    if (array == null)
      throw new NullPointerException("Input array must not be null");
  }
}
