package algo.structures;

import java.util.Arrays;

class DynamicIntArray {
  private int size;
  private int[] data;

  private int growsCounter;
  private int growSum;

  DynamicIntArray() {
    this.data = new int[10]; // initial capacity is hard coded for simplicity
  }

  public void add(int val) {
    int minCapacity = size + 1;
    if (minCapacity > data.length) {
      // no enough room to add new items
      grow(minCapacity);
    }
    data[size++] = val;
  }

  public int get(int index) {
    return data[index];
  }

  public void set(int index, int val) {
    if (index >= size) {
      throw new IndexOutOfBoundsException("Index: " + index + ", size: " + size);
    }
    data[index] = val;
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
    growsCounter++;
    growSum += oldCapacity;
    System.out.println(growsCounter + ": "+ oldCapacity + "->" + newCapacity);
  }

  public static void main(String[] args) {
    DynamicIntArray ints = new DynamicIntArray();
    for (int i = 0; i < 1000; i++) {
      ints.add(i);
    }

    System.out.println("Growths number: " + ints.growsCounter);
    System.out.println("Current capacity: " + ints.data.length);
    System.out.println("Grow sum: " + ints.growSum);
  }
}
