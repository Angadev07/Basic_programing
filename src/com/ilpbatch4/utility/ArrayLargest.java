package com.ilpbatch4.utility;

public class ArrayLargest {
	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 6, 8, 5 };
		System.out.println("Largest is " + largestOfArray(array));
		SecondLargestOfArray(array);
	}

	private static int largestOfArray(int[] array) {
		int largest = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > largest) {
				largest = array[i];
			}

		}
		return largest;

	}
	
	private static void SecondLargestOfArray(int[] array) {
		int largest = 0;
		int secondLargest = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > largest) {
				secondLargest = largest;
				largest = array[i];
			}
			else if (array[i] > secondLargest) {
				secondLargest = array[i];
			}

		}
		System.out.println("Largest is " + largest + " Second Largest is " + secondLargest);

	}
}
