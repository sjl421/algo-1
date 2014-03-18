/**
 * Simple not thread-safe implementation of Fibonacci sequence
 */
public class Fibo {

    private BigDecimal prev1 = BigDecimal.ZERO;
    private BigDecimal prev2 = BigDecimal.ONE;

    public BigDecimal next() {
        BigDecimal val = prev1.add(prev2);
        prev1 = prev2;
        prev2 = val;
        return val;
    }
}
