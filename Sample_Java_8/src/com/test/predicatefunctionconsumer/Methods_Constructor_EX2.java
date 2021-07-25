package com.test.predicatefunctionconsumer;


interface Interf{
	public void add(int i);
	default void m1() {
		System.out.println("hello");
	}
}

public class Methods_Constructor_EX2{
	
	public static void sum(int a) {
		System.out.println("the value :"+(a+a));
	}
	

	public static void main(String[] args) {

		Interf i = (x)->System.out.println("the value :"+(x+x));
		i.add(10);
		
		
		Interf i1 = Methods_Constructor_EX2::sum;
		i1.add(10);
		i1.m1();
	}


	

}
