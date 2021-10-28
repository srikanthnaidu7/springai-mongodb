package com.test.interviewquestions;

public class Dog extends Animal{
	
	public static void barking() {
		System.out.println("Dog Barking...");
	}
	
	@Override
	public void animalMethod() {
		System.out.println("Dog class Method:::");
	}
}
