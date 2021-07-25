package com.test.suplier;

import java.util.Date;
import java.util.function.Supplier;

public class Example1 {

	public static void main(String[] args) {

		Supplier<Date> sup = ()->{
			return new Date();
			};
			
			System.out.println(sup.get());
		}
		
	}

