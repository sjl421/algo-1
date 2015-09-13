package algo;

/**
 * Counting Fibonacci numbers
 *
 * F(0) = 0
 * F(1) = 1
 * F(2) = F(1) + F(0) = 1 + 0 = 1
 * ...
 * F(n) = F(n-1) + F(n-2)
 *
 * 0 1 1 2 3 5 8 13 ...
 *
 * @author ahalikov
 */
public class FibonacciNumbers {

    /**
     * Iterative solution runs for O(n) time and O(1) memory
     *
     * @param n Input number
     * @return Fibonacci number
     */
    public static long calc(int n) {
        if (n == 0) return 0;
        long prev = 0, curr = 1;
        for (int i = 2; i <= n; i++) {
            long temp = curr;
            curr += prev;
            prev = temp;
        }
        return curr;
    }

    /**
     * Recursive solution is elegant,
     * but runs for O(phi ^ n) time and O(n) memory (mac call stack depth).
     *
     * @param n Input number
     * @return Fibonacci number
     */
    public static long calcRec(int n) {
        if (n == 0 || n == 1) return n;
        return calcRec(n - 1) + calcRec(n - 2);
    }
}
