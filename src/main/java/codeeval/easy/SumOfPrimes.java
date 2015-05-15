package codeeval.easy;

import java.util.Arrays;

/**
 * Write a program which determines the sum of the first 1000 prime numbers.
 */
public class SumOfPrimes {
    public static void main(String[] args) {
        boolean[] primes = sieve(7920);
        long sum = 0;
        for (int i = 0; i < primes.length; i++) {
            if (primes[i])
                sum += i;
        }
        System.out.println(sum);
    }

    /**
     * Eratosthenes sieve
     * @param n Upper bound
     */
    private static boolean[] sieve(int n) {
        boolean[] sieve = new boolean[n];
        Arrays.fill(sieve, true);
        sieve[0] = false;
        sieve[1] = false;
        for (int i = 2; i*i < n; i++) {
            if (sieve[i])
                for (int j = i*i; j < n; j+=i)
                    sieve[j] = false;
        }
        return sieve;
    }
}
