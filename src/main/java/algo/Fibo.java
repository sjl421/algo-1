import java.util.concurrent.atomic.AtomicReference;
// TODO: test

public class Fibo {
    
    private AtomicReference<BigDecimal> prev1 = new AtomicReference<BigDecimal>(BigDecimal.ZERO); 
    private AtomicReference<BigDecimal> prev2 = new AtomicReference<BigDecimal>(BigDecimal.ONE);
    
    public static void main(String[] args) {
        
    }
    
    
    public BigDecimal next() {
        BigDecimal val1 = prev1.get();
        BigDecimal val2 = prev2.get();
        BigDecimal val = val1.add(val2);
        prev1.set(val2);
        prev2.set(val);
        return val;
    }
}
