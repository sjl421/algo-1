package codeeval.easy;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * The Fibonacci series is defined as: F(0) = 0; F(1) = 1; F(n) = F(n–1) + F(n–2) when n>1.
 * Given an integer n≥0, print out the F(n).
 *
 * @author ahalikov
 */
public class FibonacciSeries {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));

        String s;
        while ((s = reader.readLine()) != null) {
            int n = Integer.parseInt(s);
            System.out.println(fibonacciNumber(n));
        }
        reader.close();
    }

    private static long fibonacciNumber(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacciNumber(n-1) + fibonacciNumber(n-2);
    }
}
