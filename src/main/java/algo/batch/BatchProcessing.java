package algo.batch;

import com.ahalikov.toolkit.utils.ArrayUtils;
import com.google.common.collect.Iterables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BatchProcessing {
  private static final int[][] ids = {{20, 31}, {10, 20}, {0, 10}};
  private static final int[] numbers = {30, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 13, 12, 11, 10, 9, 8, 6, 5, 4, 3};

  public static void main(String[] args) {
    ArrayUtils.print(numbers);
    System.out.println("");

    List<Integer> buffer = new ArrayList<>();
    final int batchSize = 5;
    Integer lastProcessedId = null;

    for (int i = 0; i < ids.length; i++) {
      int minId = ids[i][0], maxId = ids[i][1];
      System.out.print("Selected: [" + minId + ", " + maxId + ") = ");

      List<Integer> numbersFromRange = selectNumbersFromRange(minId, maxId);
      numbersFromRange.forEach(n -> System.out.print(n + " "));
      System.out.println();

      if (!buffer.isEmpty()) {
        numbersFromRange.addAll(buffer);
        buffer = new ArrayList<>();
      }

      buffer.addAll(numbersFromRange);
      System.out.print("Buffer(" + buffer.size() + "): ");
      buffer.forEach(n -> System.out.print(n + " "));
      System.out.println();

      while (buffer.size() >= batchSize) {
        List<Integer> batch = getBatch(buffer, batchSize);
        processBatch(batch);
        lastProcessedId = Iterables.getLast(batch);
        System.out.println("lastProcessedId=" + lastProcessedId);
      }
    }

    if (!buffer.isEmpty()) {
      processBatch(buffer);
    }
  }

  static List<Integer> selectNumbersFromRange(int min, int max) {
    List<Integer> numbersFromRange = new ArrayList<>();
    for (int number: numbers) {
      if (number >= min && number < max) {
        numbersFromRange.add(number);
      }
    }
    Collections.sort(numbersFromRange);
    return numbersFromRange;
  }

  static List<Integer> getBatch(List<Integer> buffer, int batchSize) {
    List<Integer> batch = new ArrayList<>();
    while (batch.size() < batchSize && !buffer.isEmpty()) {
      int lastIndex = buffer.size() - 1;
      batch.add(buffer.get(lastIndex));
      buffer.remove(lastIndex);
    }
    return batch;
  }

  static void processBatch(List<Integer> batch) {
    System.out.print("Processing: ");
    batch.forEach(i -> System.out.print(i + " "));
    System.out.println("");
  }

  static List<Integer> getNumbers(int fromNumber, int toNumber, boolean reverseOrder) {
    List<Integer> numbers = new ArrayList<>();
    for (int i = fromNumber; i <= toNumber; i++) {
      numbers.add(reverseOrder ? toNumber - i + 1 : i);
    }
    return numbers;
  }
}
