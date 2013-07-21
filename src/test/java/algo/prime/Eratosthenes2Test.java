package algo.prime;

import algo.prime.Eratosthenes2;
import algo.prime.PrimeTest;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test {@link algo.prime.Eratosthenes2}
 *
 * @author Artur Khalikov
 */
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
