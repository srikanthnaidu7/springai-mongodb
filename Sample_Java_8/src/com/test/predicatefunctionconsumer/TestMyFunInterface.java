package com.test.predicatefunctionconsumer;

public class TestMyFunInterface implements MyFunInterface,MyFunInterface2{

	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		//MyFunInterface.super.display();
	}
	
	private void staticm() {
		// TODO Auto-generated method stub
		MyFunInterface.staticM();
	}
	
	public static void main(String[] args) {
		TestMyFunInterface testMyFunInterface = new TestMyFunInterface();
		testMyFunInterface.display();
	}

	@Override
	public void myMethod() {
		// TODO Auto-generated method stub
		
	}
	
}
