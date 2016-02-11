package utils;

import java.util.Comparator;

public class Comparators {
  private Comparators() {}

  public static <T> Comparator<T> naturalOrder() {
    return new NaturalOrder<>();
  }

  private static class NaturalOrder<T> implements Comparator<T> {
    @Override
    public int compare(T left, T right) {
      final Comparable<T> comp;
      if (left instanceof Comparable) {
        comp = (Comparable<T>) left;
        return comp.compareTo(right);
      } else if (right instanceof Comparable) {
        comp = (Comparable<T>) right;
        return -comp.compareTo(left);
      }
      throw new IllegalArgumentException("At least one argument " +
        "should implement Comparable interface");
    }
  }
}
