package interview.atlassian;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class LookAndSay {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //int start = scanner.nextInt();
    //int n = scanner.nextInt();


    System.out.println(lookAndSay("123"));
  }

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
}
