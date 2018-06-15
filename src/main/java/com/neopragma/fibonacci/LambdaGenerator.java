package com.neopragma.fibonacci;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class LambdaGenerator implements Generator {
	
	private int limit;
	private List<Integer> result;
	
	public LambdaGenerator(int limit) {
		this.limit = limit;
	}

	/**
	 * Execute the algorithm to generate the Fibonacci series.
	 */
	@Override
	public void run() {
		result =
			Stream.iterate(new int[]{0, 1}, s -> new int[]{s[1], s[0] + s[1]})
				.limit(limit)
				.map(n -> n[0])
				.collect(toList());

	}

	/**
	 * @return List containing the generated values.
	 */
	@Override
	public List<Integer> result() {
        return result;
	}

}
