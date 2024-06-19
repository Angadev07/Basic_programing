package com.ilpbatch4.utility;

public class Pattern1 {

	public static void main(String[] args) {
		int n=4;
		pattern(n);
		pattern1(n);
		patternTriangleThree(n);
	}
	
	private static void pattern(int n) {
		for (int i=1; i<=n; i++) {
			for (int j=1;j<=i; j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}
	}
	
	private static void pattern1(int n) {
		for (int i=1; i<=n; i++) {
			for (int j=1;j<=i; j++) {
				System.out.print(j);
				
				if(j % 2 == 0) {
					System.out.print("  ");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println(" ");
		}
	}
	
	

	private static void patternTriangleThree(int number) {
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				int alpha = 64;
				alpha += j;
				System.out.print(j + " ");
				System.out.print((char) alpha + " ");
			}
			System.out.println();
		}
	}
	
	

}


