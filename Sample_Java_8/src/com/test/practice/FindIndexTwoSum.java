package com.test.practice;

import java.util.HashMap;
import java.util.Map;

public class FindIndexTwoSum {

	public static void main(String[] args) {
		
		//ex: {2,4,3,7,9} find when two values added that number indexes to find ex : 5 indexes are 0 and 2
		int a[] = {2,4,3,7,9};
		int target = 16;
		int arr[] = findIndexTwoSum(a,target);
		System.out.println("index:"+arr[1] + "," +arr[0]);
	}

	private static int[] findIndexTwoSum(int[] a, int target) {
		
		Map<Integer, Integer> visitedNum = new HashMap<Integer, Integer>();
		for(int i=0;i<a.length;i++) {
			
			int delta = target - a[i];
			if(visitedNum.containsKey(delta))
				return new int[] {i,visitedNum.get(delta)};
			
			visitedNum.put(a[i],i);
		}
		
		return new int[] {-1,-1};
		
		
	}

}
