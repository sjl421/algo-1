package algo.recursion;

/**
 * Worst time is O(2^n)
 *
 * Worst space is O(n)
 * n - is a maximum number of execution frames for each recursive call
 */
public class TowersOfHanoi {
  public static void main(String[] args) {
    System.out.println(moveDisks(-1, "T1", "T2", "T3"));
  }

  private static String moveDisks(int n, String orig, String dest, String temp) {
    if (n <= 0)
      throw new IllegalArgumentException("n <= 0");
    return move(n, orig, dest, temp);
  }

  private static String move(int n, String orig, String dest, String temp) {
    final String DIRECT_MOVE =
      "Move disk " + n + " from " + orig + " to " + dest + "\n";
    if (n == 1)
      return DIRECT_MOVE;
    String result = move(n - 1, orig, temp, dest);
    result += DIRECT_MOVE;
    result += move(n - 1, temp, dest, orig);
    return result;
  }
}