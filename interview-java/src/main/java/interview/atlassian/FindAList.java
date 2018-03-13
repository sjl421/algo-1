package interview.atlassian;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Given 2 always defined non-empty lists, find the starting index
 * where the second list occurs as a sub-list in the first list.
 * Return -1 if the sub-list cannot be found.
 */
public class FindAList {

  static int find(int[] list1, int[] list2) {
    if (list2.length > list1.length) {
      return -1;
    }

    Map<Integer, Integer> list1Indexes = createIndexMap(list1);

    int firstIndex = 0, countMatches = 0, prevIndex = -1;

    for (int key: list2) {
      if (!list1Indexes.containsKey(key)) {
        return -1;
      }
      int nextIndex = list1Indexes.get(key);
      if (prevIndex < 0) {
        firstIndex = nextIndex;
        countMatches += 1;
      } else if (nextIndex - prevIndex == 1) {
        countMatches += 1;
      }
      prevIndex = nextIndex;
    }
    return countMatches == list2.length ? firstIndex : -1;
  }

  private static Map<Integer, Integer> createIndexMap(int[] numbers) {
    Map<Integer, Integer> indexMap = new HashMap<>();
    for (int index = 0; index < numbers.length; index++) {
      int key = numbers[index];
      indexMap.put(key, index);
    }
    return indexMap;
  }

  private static int[] readNumbers(final Scanner scanner) {
    int length = scanner.nextInt();
    if (length == 0) {
      return new int[]{};
    }
    int[] numbers = new int[length];
    for (int i = 0; i < length; i++) {
      numbers[i] = scanner.nextInt();
    }
    return numbers;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] list1 = readNumbers(scanner);
    int[] list2 = readNumbers(scanner);

    int result = find(list1, list2);

    System.out.println(result);
  }
}
