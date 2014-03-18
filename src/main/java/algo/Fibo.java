// TODO: test

public class Fibo {
    
    private BigDecimal prev1 = BigDecomal.ZERO; 
    private BigDecimal prev2 = BigDecimal.ONE;
    
    public static void main(String[] args) {
        
    }
    
    
    public BigDecimal next() {
        BigDecimal val = prev1 + prev2;
        prev1 = prev2;
        prev2 = val;
        return val;
    }
}
