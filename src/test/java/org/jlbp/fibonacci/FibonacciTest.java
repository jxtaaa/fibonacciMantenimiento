package org.jlbp.fibonacci;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Fibonacci sequence:
 * Fib(0) = 0 <br>
 * Fib(1) = 1 <br>
 * Fib(2) = Fib(0) + Fib(1) = 0 + 1 = 1 <br>
 * Fib(3) = Fib(1) + Fib(2) = 1 + 1 = 2 <br>
 * Fib(4) = Fib(2) + Fib(3) = 1 + 2 = 3 <br>
 *
 */

class FibonacciTest {
    private Fibonacci fibonacci;

    @BeforeEach
    public void setup() {
        fibonacci = new Fibonacci();
    }

    @AfterEach
    public void finish(){
        fibonacci = null;
    }

    @Test
    public void computeShouldReturnZeroIfNumberIsZero(){
        BigInteger expectedValue = BigInteger.ZERO;
        BigInteger obtainedValue = fibonacci.compute(0);
        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    public void computeShouldReturnOneIfNumberIsOne(){
        BigInteger expectedValue = BigInteger.ONE;
        BigInteger obtainedValue = fibonacci.compute(1);
        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    public void computeShouldReturnOneIfNumberIsTwo(){
        BigInteger expectedValue = BigInteger.ONE;
        BigInteger obtainedValue = fibonacci.compute(2);
        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    public void computeShouldReturnTwoIfNumberIsThree(){
        BigInteger expectedValue = BigInteger.valueOf(2);
        BigInteger obtainedValue = fibonacci.compute(3);
        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    public void computeShouldReturnThreeIfNumberIsFour(){
        BigInteger expectedValue = BigInteger.valueOf(3);
        BigInteger obtainedValue = fibonacci.compute(4);
        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    public void computeShouldThrowRuntimeExceptionIfNumberIsNonPositive(){
        assertThrows(RuntimeException.class, () -> fibonacci.compute(-1));
    }

    @Test
    public void computeShouldReturnAPositiveAndValidValueForABigInput(){
        System.out.println(fibonacci.compute(200));
    }
}