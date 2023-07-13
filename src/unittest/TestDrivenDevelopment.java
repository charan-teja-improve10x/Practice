package unittest;



import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestDrivenDevelopment {

    @Test
    public void zingZing (){
        Fibonacci fibonacci = new Fibonacci();
        int negativeNumber = fibonacci.getFibonacciNumber(-10);
        assertEquals(-1, negativeNumber);
    }

    @Test
    public void givenZero_returnZero(){
        Fibonacci fibonacci = new Fibonacci();
        int negativeNumber = fibonacci.getFibonacciNumber(0);
        assertEquals(0, negativeNumber);
    }

    @Test
    public void givenOne_returnOne (){
        Fibonacci fibonacci = new Fibonacci();
        int negativeNumber = fibonacci.getFibonacciNumber(1);
        assertEquals(1, negativeNumber);
    }

    @Test
    public void givenThree_returnThree (){
        Fibonacci fibonacci = new Fibonacci();
        int negativeNumber = fibonacci.getFibonacciNumber(3);
        assertEquals(2, negativeNumber);
    }

    @Test
    public void givenSix_returnEight (){
        Fibonacci fibonacci = new Fibonacci();
        int negativeNumber = fibonacci.getFibonacciNumber(6);
        assertEquals(8, negativeNumber);
    }
}
