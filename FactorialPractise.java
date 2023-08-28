package com.coding.pratice;

public class FactorialPractise {
	
	
	public int getFactorial(int n) {
		if(n==1) {
			return 1;
		} else {
			
			return n*(getFactorial(n-1));
		}
			
	}

	public static void main(String[] args) {
		int number = 4;
		FactorialPractise fP = new FactorialPractise();
		System.out.println(fP.getFactorial(number));

	}

}
