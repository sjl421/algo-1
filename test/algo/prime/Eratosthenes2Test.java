package algo.prime;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test {@link Eratosthenes2}
 *
 * @author Artur Khalikov
 */
public class Eratosthenes2Test {

    @Test
    public void testSieve() throws Exception {        
        int m = 100;
        int n = 200;
        boolean[] result = Eratosthenes2.sieve(m, n);        
        for (int i = m; i < n; i++) {
            if (PrimeTest.isPrime2(i))
                assertTrue(i + " is not prime?", result[i]);
            else
                assertFalse(i + " is prime?", result[i]);
        }
    }
}
