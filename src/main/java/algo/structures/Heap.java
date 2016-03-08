package algo.structures;

import utils.Util;

import java.util.Comparator;

/**
 * Created by akhalikov on 10/02/16
 */
public class Heap<E> implements PriorityQueue<E> {

  private E[] items;
  private int size;

  public Heap(E[] arr) {
    buildHeap(arr);
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  @Override
  public E max() {
    if (isEmpty())
      throw new RuntimeException("Heap is empty");
    return items[0];
  }

  @Override
  public E extractMax() {
    if (isEmpty())
      throw new RuntimeException("Heap is empty");
    E max = items[0];
    items[0] = items[size];
    items[size] = null;
    size--;
    heapify(0);
    return null;
  }

  @Override
  public void insert(E key) {
    size++;
    int i = size;
    if (!(key instanceof Comparable))
      throw new IllegalArgumentException("item is not Comparable");
    while (i > 0) {
      E parent = items[parent(i)];
      int cmp = ((Comparable) key).compareTo(parent);
      if (cmp > 0) {
        items[i] = parent;
        i = parent(i);
      }
    }
    items[i] = key;
  }

  @Override
  public int getSize() {
    return size;
  }

  @Override
  public Comparator<E> getComparator() {
    return null;
  }

  private void buildHeap(Object[] arr) {
    size = arr.length;
    System.arraycopy(arr, 0, this.items, 0, size);
    for (int i = (size-1)/2; i >= 0; i--)
      heapify(i);
  }

  private void heapify(int index) {
    int largest = index,
        li = left(index),
        ri = right(index);

    if (!(items[largest] instanceof Comparable))
      throw new IllegalArgumentException(
        "Object " + items[largest] + " is not comparable");

    if (li <= size) {
      int cmp = ((Comparable) items[largest]).compareTo(items[li]);
      if (cmp < 0)
        largest = li;
    }
    if (ri <= size) {
      int cmp = ((Comparable) items[largest]).compareTo(items[ri]);
      if (cmp < 0)
        largest = ri;
    }
    if (largest != index) {
      Util.swap(items, index, largest);
      heapify(largest);
    }
  }

  private int left(int i) {
    return i*2 + 1;
  }

  private int right(int i) {
    return i*2 + 2;
  }

  private int parent(int i) {
    return (i - 1)/2;
  }
}
