package codeeval.easy;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Print out the sum of integers read from a file.
 *
 * @author ahalikov
 */
public class SumOfIntegers {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));

        long sum = 0;
        String s;
        while ((s = reader.readLine()) != null) {
            sum += Integer.parseInt(s);
        }
        System.out.print(sum);
        reader.close();
    }
}
