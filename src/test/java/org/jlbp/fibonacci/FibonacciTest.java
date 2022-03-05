package org.jlbp.fibonacci;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Fibonacci sequence:
 * Fib(0) = 0
 * Fib(1) = 1
 * Fib(2) = Fib(0) + Fib(1) = 0 + 1 = 1
 * Fib(3) = Fib(1) + Fib(2) = 1 + 1 = 2
 * Fib(4) = Fib(2) + Fib(3) = 1 + 2 = 3
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
        int expectedValue = 0;
        int obtainedValue = fibonacci.compute(0);
        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    public void computeShouldReturnOneIfNumberIsOne(){
        int expectedValue = 1;
        int obtainedValue = fibonacci.compute(1);
        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    public void computeShouldReturnOneIfNumberIsTwo(){
        int expectedValue = 1;
        int obtainedValue = fibonacci.compute(2);
        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    public void computeShouldReturnTwoIfNumberIsThree(){
        int expectedValue = 2;
        int obtainedValue = fibonacci.compute(3);
        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    public void computeShouldReturnThreeIfNumberIsFour(){
        int expectedValue = 3;
        int obtainedValue = fibonacci.compute(4);
        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    public void computeShouldThrowRuntimeExceptionIfNumberIsNonPositive(){
        assertThrows(RuntimeException.class, () -> fibonacci.compute(-1));
    }
}