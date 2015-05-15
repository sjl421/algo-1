package codeeval.moderate;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Write a program which determines the number of 1 bits
 * in the internal representation of a given integer.
 *
 * @author ahalikov
 */
public class NumberOfOnes {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        String s;
        while ((s = reader.readLine()) != null) {
            String binStr = getBinary(Long.parseLong(s));
            int ones = 0;
            for (char c: binStr.toCharArray())
                if (c == '1') ones++;
            System.out.println(ones);
        }
        reader.close();
    }

    private static String getBinary(long n) {
        // Simplest case
        return (n <= 1)
                ? Long.toString(n)
                : getBinary(n / 2) + Long.toString(n % 2);
    }
}
