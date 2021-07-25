package com.test.predicatefunctionconsumer;

@FunctionalInterface
public interface MyFunInterface {

	abstract void myMethod();
	
	public default void display() {
	      System.out.println("display method of MyInterface");
	   }
	
	public static void staticM() {
	      System.out.println("display method of MyInterface");
	   }
}
