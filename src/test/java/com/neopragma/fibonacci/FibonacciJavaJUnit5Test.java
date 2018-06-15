package com.neopragma.fibonacci;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciJavaJUnit5Test {

    private List<Integer> expectedResult =
        Arrays.asList(new Integer[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34});

    @Test
    void itReturnsFibonacciSeriesTo34UsingIteration() {
        Fibonacci fibonacci = new Fibonacci(FibonacciMethod.ITERATIVE,10);
        fibonacci.run();
        assertEquals(expectedResult, fibonacci.result());
    }

    @Test
    void itReturnsFibonacciSeriesTo34UsingRecursion() {
        Fibonacci fibonacci = new Fibonacci(FibonacciMethod.RECURSIVE,10);
        fibonacci.run();
        assertEquals(expectedResult, fibonacci.result());
    }

    @Test
    void itReturnsFibonacciSeriesTo34UsingLambda() {
        Fibonacci fibonacci = new Fibonacci(FibonacciMethod.LAMBDA,10);
        fibonacci.run();
        assertEquals(expectedResult, fibonacci.result());
    }
}
