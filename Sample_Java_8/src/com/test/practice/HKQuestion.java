package com.test.practice;


class A4{
	static int a = 10;
	int x = 30;
	A4(){
		System.out.println("A4 class constructor..");
		x = 5;
	}
}

public class HKQuestion extends A4{
	
	static int b = 20;
	int y = 40;
	HKQuestion(){
		System.out.println("HKQuestion class constructor..");
		y = 6;
	}

	public static void main(String[] args) {
		
		HKQuestion b = new HKQuestion();
		System.out.println(a);
		System.out.println(b);
		System.out.println(b.x);
		System.out.println(b.y);
	}

}
