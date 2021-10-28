package com.test.practice;

public class FindNumPowerOfTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num = 100;
		boolean flag = isPowerOfTen(num);
		if(flag)
		System.out.println("the given num is power of 10");
		else
			System.out.println("not power of 10");
	}
	public static boolean isPowerOfTen(long input) {
	    while (input > 1) {
	    	System.out.println(input % 10);
	        if (input % 10 != 0)
	            return false;
	        input /= 10;
	        System.out.println("input:"+input);
	    }

	    return input == 1;
	}

}
