package com.test.predicatefunctionconsumer;

class Sample{
	
	Sample(){
		System.out.println("sample object created::;");
	}
}


interface Interf1{
	public Sample get();
}

public class Methods_Constructor_EX3 {

	public static void main(String[] args) {

		
		Interf1 interf = Sample::new;
		Sample s1= interf.get();
		System.out.println(s1);
	}

}
