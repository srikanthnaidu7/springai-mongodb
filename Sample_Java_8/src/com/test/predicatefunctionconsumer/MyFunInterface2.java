package com.test.predicatefunctionconsumer;

public interface MyFunInterface2 {

	
	//void m1();
	public default void display() {
	      System.out.println("display method of MyInterface2");
	   }
	
	public static void staticM() {
	      System.out.println("display method of MyInterface");
	   }
}
