package algo.numbers.prime;

import org.junit.Test;
import static org.junit.Assert.*;

public class Eratosthenes2Test {

    @Test
    public void testSieve() throws Exception {        
        int m = 200;
        int n = 300;
        boolean[] result = Eratosthenes2.sieve(m, n);
        for (int i = 0; i < result.length; i++) {
            boolean isPrime = PrimeTest.isPrime2(m + i);
            if (isPrime)
                assertTrue((m+i) + " is not prime?", result[i]);
            else
                assertFalse((m+i) + " is prime?", result[i]);
        }
    }
}
