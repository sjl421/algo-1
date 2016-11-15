package algo.batch;

import com.ahalikov.toolkit.utils.ArrayUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BatchProcessing {
  private static final int[][] ids = {{20, 31}, {10, 20}, {0, 10}};
  private static final int[] numbers = {30, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 13, 12, 11, 10, 9, 8, 6, 5, 4, 3};

  public static void main(String[] args) {
    ArrayUtils.print(numbers);
    System.out.println();

    List<Integer> buffer = new ArrayList<>();
    final int batchSize = 5;
    Integer lastProcessedId;

    for (int[] id : ids) {
      int minId = id[0], maxId = id[1];
      List<Integer> numbersFromRange = selectNumbersFromRange(minId, maxId);

      System.out.print(String.format("Selected(%d): [%d, %d) = ", numbersFromRange.size(), minId, maxId));
      numbersFromRange.forEach(n -> System.out.print(n + " "));

      buffer.addAll(0, numbersFromRange);

      System.out.print("\nBuffer(" + buffer.size() + "): ");
      buffer.forEach(n -> System.out.print(n + " "));
      System.out.println();

      while (buffer.size() >= batchSize) {
        List<Integer> batch = buffer.subList(buffer.size() - batchSize, buffer.size());
        processBatch(batch);
        lastProcessedId = batch.get(0);
        System.out.println(String.format("lastProcessedId=%d \n", lastProcessedId));
        batch.clear();
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

  static void processBatch(List<Integer> batch) {
    System.out.print(String.format("Processing(%d): ", batch.size()));
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
