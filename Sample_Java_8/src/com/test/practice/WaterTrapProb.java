package com.test.practice;

public class WaterTrapProb {

	public static void main(String[] args) {
		
		//int arr[]   = {2, 0, 2};
		int arr[]   = {3, 1, 2,4,0,1,3,2};
		int noOfBricks = waterTrap(arr);
		System.out.println("noOfBricks:"+noOfBricks);
	}

	private static int waterTrap(int[] arr) {
		
		int left[] = new int[arr.length];
		int right[] = new int[arr.length];
		
		left[0] = arr[0];
		for(int i=1;i<arr.length;i++) {
			left[i] = Math.max(left[i-1], arr[i]);
					
		}
		for (int i : left) {
			System.out.println(i);
		}
		right[arr.length-1] = arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--) {
			right[i] = Math.max(right[i+1], arr[i]);
					
		}
		
		for (int i : right) {
			System.out.println(i);
		}
		
		int noOfBricks = 0;
		
		for(int i=0;i<arr.length;i++) {
			noOfBricks += Math.min(left[i], right[i])-arr[i];
		}
		
		return noOfBricks;
	}

}
