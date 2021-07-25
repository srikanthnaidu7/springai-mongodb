package com.test.predicatefunctionconsumer;

public class SingletonDesginPattern {

	public static void main(String[] args) {

		Runnable r = () -> {
			SingletonClass obj = SingletonClass.getInstance();
			
		};
		
		Thread t1 = new Thread(()->{
			System.out.println(SingletonClass.getInstance());
		});
		t1.start();
		
		
		Thread t2 = new Thread(r);
		t2.start();
		
		
	}

}
