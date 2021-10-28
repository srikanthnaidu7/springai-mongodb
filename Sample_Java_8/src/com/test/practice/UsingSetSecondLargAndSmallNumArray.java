package com.test.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UsingSetSecondLargAndSmallNumArray {

	public static void main(String[] args) {

		Integer a[]={1,2,5,6,3,2}; 
		Integer b[]={44,66,99,77,33,22,55}; 
		List<Integer> list = Arrays.asList(a);
		
		Set<Integer> set = new TreeSet<Integer>(list);
		int startIndex = 0;
		int desiredIndex = set.size()-2;
		for (Integer integer : set) {
			if(startIndex == desiredIndex) {
				System.out.println("second largest value :"+integer);
			}
			startIndex++;
		}
		
	}

}
