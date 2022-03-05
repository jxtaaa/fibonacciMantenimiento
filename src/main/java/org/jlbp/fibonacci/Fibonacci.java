package org.jlbp.fibonacci;

/**
 * Class providing a method that computes
 * the nth value of the Fibonacci sequence.
 *
 * @author José L. Bueno Pachón
 */

public class Fibonacci {
    public int compute(int n) {
        if (n > 1) {
            return compute(n - 1) + compute(n - 2);
        } else if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            throw new RuntimeException("Valor no válido: " + n);
        }
    }
}
