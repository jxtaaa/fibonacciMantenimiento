package org.jlbp.fibonacci;

import java.math.BigInteger;

/**
 * Class providing a method that computes
 * the nth value of the Fibonacci sequence.
 *
 * @author José L. Bueno Pachón
 */

public class Fibonacci {
    public BigInteger compute(int n) {
        if(n < 0){
            throw new RuntimeException("ERROR: Input cannot be negative.");
        }

        if (n == 1 || n == 2) {
            return BigInteger.ONE;
        }

        BigInteger fibo1 = BigInteger.ONE;
        BigInteger fibo2 = BigInteger.ONE;
        BigInteger fibonacci = BigInteger.ZERO;
        for (int i = 3; i <= n; i++) {
            fibonacci = fibo1.add(fibo2);
            fibo1 = fibo2;
            fibo2 = fibonacci;
        }
        return fibonacci;
    }
}
