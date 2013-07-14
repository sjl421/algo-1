package src.test.java.algo.prime;

import algo.prime.PrimeTest;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Test {@link algo.prime.PrimeTest}
 *
 * @author Artur Khalikov
 */
public class PrimeTestTest {

    @Test
    public void testIsPrime2() throws Exception {
        long maxN = 1000*1000;

        for (long i = 4; i <= maxN; i += 2)
            assertFalse("i=" + i, PrimeTest.isPrime2(i));

        for (long i = 9; i < maxN; i += 3)
            assertFalse("i=" + i, PrimeTest.isPrime2(i));

        for (long i = 10; i < maxN; i += 5)
            assertFalse("i=" + i, PrimeTest.isPrime2(i));

        assertTrue(PrimeTest.isPrime2(2));
        assertTrue(PrimeTest.isPrime2(3));
        assertTrue(PrimeTest.isPrime2(5));
        assertTrue(PrimeTest.isPrime2(7));
        assertTrue(PrimeTest.isPrime2(11));
        assertTrue(PrimeTest.isPrime2(13));
    }

    @Test
    public void testIsPrime1() throws Exception {
        long maxN = 10000*1000;

        for (long i = 4; i <= maxN; i += 2)
            assertFalse("i=" + i, PrimeTest.isPrime2(i));

        for (long i = 9; i < maxN; i += 3)
            assertFalse("i=" + i, PrimeTest.isPrime2(i));

        for (long i = 10; i < maxN; i += 5)
            assertFalse("i=" + i, PrimeTest.isPrime2(i));

        assertTrue(PrimeTest.isPrime2(2));
        assertTrue(PrimeTest.isPrime2(3));
        assertTrue(PrimeTest.isPrime2(5));
        assertTrue(PrimeTest.isPrime2(7));
        assertTrue(PrimeTest.isPrime2(11));
        assertTrue(PrimeTest.isPrime2(13));
    }
}
