package com.test.interviewquestions;

import java.util.Scanner;

public class IntegerDivide {

	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter firstnum:");
		num1 = sc.nextInt();
		System.out.println("Enter second:");
		num2 = sc.nextInt();
		int value = DivideNumber(num1,num2);
		System.out.println("value:"+value);
	}

	private static int DivideNumber(int num1, int num2) {
		int value = 0;
		
		if(num1 >1 && num2 <=10000) {
			return num2/num1;
		}
		
		return 0;
	}

}
