package algo.prime;

import algo.Stopwatch;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test {@link Eratosthenes}
 *
 * @author Artur Khalikov
 */
public class EratosthenesTest {
    @Test
    public void testSieve1() throws Exception {
        int n = 1000*1000;
        boolean[] primes = Eratosthenes.sieve1(n);
        assertFalse(primes[0]);
        assertFalse(primes[1]);
        assertTrue(primes[2]);
        assertTrue(primes[3]);
        for (int i = 4; i < n; i+=2) {
            assertFalse("i=" + i, primes[i]);
        }
        for (int i = 9; i < n; i+=3) {
            assertFalse("i=" + i, primes[i]);
        }
        for (int i = 10; i < n; i+=5) {
            assertFalse("i=" + i, primes[i]);
        }
    }

    @Test
    public void testSievePerformance() {
        System.out.println("Testing sieve performance");

        int n = 1000; // 10^3
        Stopwatch.start();
        Eratosthenes.sieve(n);
        Stopwatch.stop(n);

        n *= 1000; // 10^6
        Stopwatch.start();
        Eratosthenes.sieve(n);
        Stopwatch.stop(n);

        n *= 100; // 10^8
        Stopwatch.start();
        Eratosthenes.sieve(n);
        Stopwatch.stop(n);
    }
}
