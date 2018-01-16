package algo.sort.comparison;

import algo.sort.Sorter;
import utils.Comparators;

import java.util.Comparator;

public abstract class ComparisonSort<T> extends Sorter<T> {
  private Comparator<T> comp = Comparators.naturalOrder();
  int comparisons;

  protected int compare(T left, T right) {
    return comp.compare(left, right);
  }

  boolean less(T left, T right) {
    return comp.compare(left, right) < 0;
  }

  boolean lessOrEqual(T left, T right) {
    int c = comp.compare(left, right);
    return c < 0 || c == 0;
  }

  boolean greater(T left, T right) {
    return comp.compare(left, right) > 0;
  }

  public Comparator<T> getComparator() {
    return comp;
  }

  public void setComparator(Comparator<T> comparator) {
    if (comparator == null)
      throw new NullPointerException("comparator must not be null");
    this.comp = comparator;
  }

  int getComparisonsAndReset() {
    int oldComparisons = comparisons;
    comparisons = 0;
    return oldComparisons;
  }
}
