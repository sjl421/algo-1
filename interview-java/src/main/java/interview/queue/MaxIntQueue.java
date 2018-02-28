package interview.queue;

import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.TreeMap;

/**
 * Implement a data that returns max element in O(1)
 *
 * Follow up questions:
 *  1. what is the type of elements (objects, numbers or generic - it simplifies coding)
 *  2. can we use collections from java.util ?
 *  3. is size limited or not ?
 *
 * ... what else ?
 *
 * For this case:
 *  1. integer numbers
 *  2. yes
 *  3. not limited
 */
class MaxIntQueue {
  private final Queue<Integer> data = new ArrayDeque<>();
  private final TreeMap<Integer, Integer> max = new TreeMap<>();

  void enqueue(int element) {
    data.add(element);

    Integer count = max.get(element);
    if (count == null) { // can be replaced by max.merge
      max.put(element, 1);
    } else {
      max.put(element, count + 1);
    }
  }

  int dequeue() {
    int element = data.remove();

    Integer count = max.get(element);
    if (count == 1) {
      max.remove(element);
    } else {
      max.put(element, count - 1);
    }
    return element;
  }

  int max() {
    Integer val = max.lastKey();
    if (val == null) {
      throw new NoSuchElementException();
    }
    return val;
  }

  boolean isEmpty() {
    return data.isEmpty();
  }
}
