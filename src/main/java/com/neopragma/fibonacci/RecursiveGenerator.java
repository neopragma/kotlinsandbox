package com.neopragma.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class RecursiveGenerator implements Generator {
	
	private int limit;
	private List<Integer> result;
	
	public RecursiveGenerator(int limit) {
		this.limit = limit;
	}

	/**
	 * Execute the algorithm to generate the Fibonacci series.
	 */
	@Override
	public void run() {
	    result = new ArrayList<>();
        for(int i = 0 ; i < limit; i++) {
            result.add(fibonacci(i));
        }
	}

    private int fibonacci(int n){
        return (n < 2) ? n : fibonacci(n - 1) + fibonacci(n - 2);
    }

	/**
	 * @return List containing the generated values.
	 */
	@Override
	public List<Integer> result() {
        return result;
	}

}
