package com.test.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargAndSmallNumArray {

	public static void main(String[] args) {
		
		Integer a[]={1,2,5,6,3,2}; 
		Integer b[]={44,66,99,77,33,22,55}; 
		
		List<Integer> list = Arrays.asList(b);
		
		Collections.sort(list);
		
		System.out.println("Second Largest:"+list.get(list.size()-2));
		System.out.println("Second smallest:"+list.get(1));
		List<Integer> list1 = Arrays.asList(b);
		
		Collections.sort(list1);
		
		System.out.println("Second Largest:"+list1.get(list1.size()-2));
		System.out.println("Second smallest:"+list1.get(1));

	}

}
