package com.test.practice;

public class FactorialNum {

	public static void main(String[] args) {
		
		int num = 5;
		
		System.out.println("The given "+ num+" factorial of:"+factorial(num));

	}

	private static int factorial(int num) {
		
		if(num==0)
			return 1;
		
		return num*factorial(num-1);
	}

}
