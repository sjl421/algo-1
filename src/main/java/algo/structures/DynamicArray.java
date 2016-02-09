package algo.structures;

import java.util.Arrays;

/**
 * Dynamic array demo: to show how array resizing works
 *
 * @author akhalikov
 */
public class DynamicArray<E> {

  private int size;
  private Object[] data;

  private int arrayGrowCounter;
  private int arrayGrowSum;

  public DynamicArray(int initialCapacity) {
    this.data = new Object[initialCapacity];
  }

  public void add(E item) {
    int minCapacity = size + 1;
    if (minCapacity > data.length) {
      // no enough room to add new items
      grow(minCapacity);
    }
    data[size++] = item;
  }

  public E get(int index) {
    return (E) data[index];
  }

  public void set(int index, E value) {
    if (index >= size)
      throw new IndexOutOfBoundsException("Index: "+ index + ", size: " + size);
    data[index] = value;
  }

  public int size() {
    return size;
  }

  private void grow(int minCapacity) {
    int oldCapacity = data.length;
    int newCapacity = oldCapacity << 1; // * 2;
    if (newCapacity - minCapacity < 0)
      newCapacity = minCapacity;
    data = Arrays.copyOf(data, newCapacity);
    arrayGrowCounter++;
    arrayGrowSum += oldCapacity;
    System.out.println(arrayGrowCounter + ": "+ oldCapacity + "->" + newCapacity);
  }

  public static void main(String[] args) {
    DynamicArray<Integer> array = new DynamicArray(10);
    for (int i = 0; i < 1000; i++) {
      array.add(i);
    }

    System.out.println("Number of resizes: " + array.arrayGrowCounter);
    System.out.println("Current capacity: " + array.data.length);
    System.out.println("Grow sum: " + array.arrayGrowSum);
  }
}
