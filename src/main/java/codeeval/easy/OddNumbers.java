package codeeval.easy;

/**
 * Print the odd numbers from 1 to 99.
 *
 * @author ahalikov
 */
public class OddNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 99; i++)
            if (i % 2 == 1) System.out.println(i);
    }
}
