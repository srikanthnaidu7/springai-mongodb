package com.test.predicatefunctionconsumer;

public class SingletonClass {
	
	private static SingletonClass singletonClass;
	
	private SingletonClass() {
		System.out.println("Inside Constructor:::");
	}
	
	
	
	public static synchronized SingletonClass getInstance() {
		
		if(singletonClass == null) {
			singletonClass =  new SingletonClass();
		}
		return singletonClass;
	}

}
