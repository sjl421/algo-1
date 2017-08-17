package algo.recursion;

class BinaryCalculator {
  /**
   * Calculates binary equivalent of decimal number
   *
   * O(log n) - the time and space requirements are estimated
   * by the number of recursive calls.
   */
  static String getBinary(long decimalNum) {
    if (decimalNum < 0)
      throw new IllegalArgumentException("Expected only positive numbers");

    return calculateRec(decimalNum);
  }

  private static String calculateRec(long num) {
    // Base case
    if (num <= 1)
      return Long.toString(num);
    else
      return calculateRec(num / 2) + Long.toString(num % 2);
  }
}
