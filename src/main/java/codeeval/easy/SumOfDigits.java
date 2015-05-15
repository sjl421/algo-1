package codeeval.easy;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Given a positive integer, find the sum of its constituent digits.
 *
 * @author ahalikov
 */
public class SumOfDigits {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        String s;
        while ((s = reader.readLine()) != null) {
            System.out.println(recursiveSum(Long.parseLong(s)));
        }
        reader.close();
    }

    private static long recursiveSum(long n) {
        return (n / 10 == 0) ? n: recursiveSum(n / 10) + (n % 10);
    }
}