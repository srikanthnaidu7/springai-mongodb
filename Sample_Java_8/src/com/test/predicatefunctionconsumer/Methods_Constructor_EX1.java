package com.test.predicatefunctionconsumer;

public class Methods_Constructor_EX1 {

	public static void m1() {
		for(int i=0;i<10;i++) {
			System.out.println("run:"+i);
		}
	}
	
	public static void main(String[] args) {

		Runnable r = Methods_Constructor_EX1::m1;
		Thread thread = new Thread(r);
		thread.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main:"+i);
		}
	}

}
