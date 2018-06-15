package com.neopragma.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class IterativeGenerator implements Generator {
	
	private int limit;
	private List<Integer> result;
	
	public IterativeGenerator(int limit) {
		this.limit = limit;
	}

	/**
	 * Execute the algorithm to generate the Fibonacci series.
	 */
	@Override
	public void run() {
	    result = new ArrayList<>();
	    int a = 0;
	    int b = 1;
        result.add(a);
        result.add(b);
        int sum;
        for( int i = 2; i < limit ; i++ ) {
            sum = a + b;
            a = b;
            b = sum;
            result.add(sum);
        }
	}

	/**
	 * @return List containing the generated values.
	 */
	@Override
	public List<Integer> result() {
        return result;
	}

}
