package algo.sort.comparison;

import algo.sort.Sorter;
import utils.Comparators;

import java.util.Comparator;

public abstract class ComparisonSort<T> extends Sorter<T> {
  private Comparator<T> comp = Comparators.naturalOrder();
  protected int comparisons;

  protected int compare(T left, T right) {
    return comp.compare(left, right);
  }

  protected boolean less(T left, T right) {
    return comp.compare(left, right) < 0;
  }

  protected boolean lessOrEqual(T left, T right) {
    int c = comp.compare(left, right);
    return c < 0 || c == 0;
  }

  protected boolean greater(T left, T right) {
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

  public int getComparisonsAndReset() {
    int oldComparisons = comparisons;
    comparisons = 0;
    return oldComparisons;
  }
}
