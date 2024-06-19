package com.ilpbatch4.utility;

public class SumOfSeries {


	public static void main(String[] args) {
		int input = 10;
		sumOfTheSeries(input);
	}
	
	private static void sumOfTheSeries(int input) {
		int sum =0;
		for (int i=0; i<=input; i++) {
			sum = sum + i;
		}
		System.out.println("Sum = " + sum);
	}
}
