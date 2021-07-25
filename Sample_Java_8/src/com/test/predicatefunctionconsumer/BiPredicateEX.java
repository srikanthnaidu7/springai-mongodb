package com.test.predicatefunctionconsumer;

import java.util.function.BiPredicate;

public class BiPredicateEX {

	public static void main(String[] args) {

		//TAke two arguments and check the conditions and return true or false
		BiPredicate<Integer, Integer> biPred = (num1,num2)->num1+num2>=5;
		
		System.out.println(biPred.test(2, 3));
		System.out.println(biPred.test(2, 2));
	}

}
