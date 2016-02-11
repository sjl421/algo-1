package algo.sort.comparison;

import algo.sort.Sorter;
import utils.Comparators;

import java.util.Comparator;

public abstract class ComparisonSort<E> extends Sorter<E> {
  private Comparator<E> comp = Comparators.naturalOrder();
  protected int comparisons;

  protected int compare(E left, E right) {
    return comp.compare(left, right);
  }

  protected boolean less(E left, E right) {
    return comp.compare(left, right) < 0;
  }

  protected boolean greater(E left, E right) {
    return comp.compare(left, right) > 0;
  }

  public Comparator<E> getComparator() {
    return comp;
  }

  public void setComparator(Comparator<E> comparator) {
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
