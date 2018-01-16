package rand;

import java.util.Random;

/**
 * Write a function that returns true or false for given percentage
 */
class PercentageSplit {
  private static final Random RANDOM = new Random();

  static boolean split(int percentage) {
    if (percentage < 0 || percentage > 100) {
      throw new IllegalArgumentException("percentage should be between 0 and 100");
    }

    return RANDOM.nextInt(100) < percentage;
  }
}
