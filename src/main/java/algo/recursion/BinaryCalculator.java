package algo.recursion;

class BinaryCalculator {

    /**
     * Calculates binary equivalent of decimal number
     *
     * O(log n) - the time and space requirements are estimated
     * by the number of recursive calls.
     */
    public static String getBinary(int decimalNum) {
        if (decimalNum < 0)
            throw new IllegalArgumentException("Expected only positive numbers");

        return calculateRecursively(decimalNum);
    }

    private static String calculateRecursively(int decimalNum) {
        // Simplest case
        if (decimalNum <= 1)
            return Integer.toString(decimalNum);
        else
            return calculateRecursively(decimalNum / 2)
                    + Integer.toString(decimalNum % 2);
    }
}
