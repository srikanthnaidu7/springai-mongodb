package com.test.interviewquestions;

public class AutoBoxUnboxing {

	public static void main(String[] args) {
		
		Integer i1 = new Integer(1);
		int i2 = 1;
		
		if(i1.equals(i2)) {
			System.out.println("Both are same");
		}else {
			System.out.println("Not equal values");
		}
		
		if(i1==i2) {
			System.out.println("Both are same");
		}else {
			System.out.println("Not equal values");
		}
		
		
		Integer i3 = new Integer(1);
		Integer i4 = new Integer(1);
		
		System.out.println("hascodes:"+i3.hashCode()+"i4 hascode:"+i4.hashCode());
		
		if(i3.equals(i4)) {
			System.out.println("Both are same");
		}else {
			System.out.println("Not equal values");
		}
		
		if(i3==i4) {
			System.out.println("Both are same");
		}else {
			System.out.println("Not equal values");
		}
	}

}
