package com.test.practice;

public class FinallyBlockEx {

	public static void main(String[] args) {
		
		RuntimeException test = test();
		System.out.println(test);
		/*
		
		try {
			
			throw new RuntimeException("Try block");
		}
		finally {
			System.out.println("finally block");
		}
		*/
	}

	private static RuntimeException test() {
		try {
			
			return new RuntimeException("runtime exception..");
		}
		finally {
			System.out.println("finally block");
		}
	}

}
