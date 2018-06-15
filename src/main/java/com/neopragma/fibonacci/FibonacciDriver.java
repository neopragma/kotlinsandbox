package com.neopragma.fibonacci;

import java.util.Scanner;

public class FibonacciDriver {
	
	private static Fibonacci fibonacci;
	
	public static void main(String[] args) {
		FibonacciMethod method = null;
		Scanner console = new Scanner(System.in);
		System.out.println("Welcome to the Fibonacci series generator!");
		System.out.println("Please enter 1 for iterative or 2 for recursive:");
		int methodCode = console.nextInt();
		switch (methodCode) {
		    case 1 : method = FibonacciMethod.ITERATIVE;
		             break;
		    case 2 : method = FibonacciMethod.RECURSIVE;
		             break;
		    default : System.out.println("Sorry, you blew it!");
		             System.exit(1);
		}             
		System.out.println("Please enter the number of " + (method == FibonacciMethod.ITERATIVE ? "iterations:" : "recursive calls:"));
        int passes = console.nextInt();
        fibonacci = new Fibonacci(method, passes);
        fibonacci.run();
        System.out.println("Result:");
        for (int value : fibonacci.result()) {
        	System.out.println(value);
        }
        System.exit(0);
	}
	
	 

}
