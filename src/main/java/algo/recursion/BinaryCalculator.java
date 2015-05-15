package algo.recursion;

class BinaryCalculator {

    /**
     * Calculates binary equivalent of decimal number
     *
     * O(log n) - the time and space requirements are estimated
     * by the number of recursive calls.
     */
    public static String getBinary(long decimalNum) {
        if (decimalNum < 0)
            throw new IllegalArgumentException("Expected only positive numbers");

        return calculateRecursively(decimalNum);
    }

    private static String calculateRecursively(long num) {
        // Simplest case
        if (num <= 1)
            return Long.toString(num);
        else
            return calculateRecursively(num / 2) + Long.toString(num % 2);
    }
}
