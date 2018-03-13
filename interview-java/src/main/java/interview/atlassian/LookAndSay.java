package interview.atlassian;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * LookAndSay(1) = 11     because 1 is read off as "one 1" or 11
 * LookAndSay(11) = 21    because 1 is read off as "two 1s" or 21
 * LookAndSay(21) = 1211  ...
 * LookAndSay(1211) = 111221
 * LookAndSay(111221) = 312211
 *
 * Given a number start and a number of iteration n, calculate the n-th
 * number in a Look And Say sequence starting with start.
 *
 * LookAndSay(11, 2) = 1211 because LookAndSay(LookAndSay(11)) = 1211
 */
public class LookAndSay {

  private static String lookAndSay(String seq) {
    StringBuilder result = new StringBuilder();

    Deque<Character> stack = new ArrayDeque<>();
    for (int index = 0; index < seq.length(); index++) {
      char item = seq.charAt(index);

      if (!stack.isEmpty() && stack.peekFirst() != item) {
        result.append(stack.size());
        result.append(stack.peekFirst());
        stack.clear();
      }

      stack.push(item);
    }

    if (!stack.isEmpty()) {
      result.append(stack.size());
      result.append(stack.peekFirst());
    }

    return result.toString();
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //int start = scanner.nextInt();
    //int n = scanner.nextInt();
    System.out.println(lookAndSay("123"));
  }
}
