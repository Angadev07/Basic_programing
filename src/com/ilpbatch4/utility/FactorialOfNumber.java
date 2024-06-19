package com.ilpbatch4.utility;

public class FactorialOfNumber {

	public static void main(String[] args) {
		int input = 10;
		factorialOfNumber(input);
	}
	
	private static void factorialOfNumber(int input) {
		int fact = 1;
		for (int i=1; i<=10; i++) {
			fact = fact * i;
		}
		System.out.print(fact);
	}
	
}
