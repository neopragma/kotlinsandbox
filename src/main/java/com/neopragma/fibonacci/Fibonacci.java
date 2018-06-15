package com.neopragma.fibonacci;

import java.util.List;

public class Fibonacci {
	
	Generator generator;
	
	public Fibonacci(FibonacciMethod method, int limit) {
		switch (method) {
		    case ITERATIVE : generator = new IterativeGenerator(limit);
		                     break;
		    case RECURSIVE : generator = new RecursiveGenerator(limit);
            				 break;
		    case LAMBDA : generator = new LambdaGenerator(limit);
            				 break;
		    default        : throw new IllegalArgumentException("Driver passed invalid arguments to Fibonacci constructor");                 
		}
	}
	
	public void run() {
		generator.run();
	}
	
	public List<Integer> result() {
		return generator.result();
	}
		
}
