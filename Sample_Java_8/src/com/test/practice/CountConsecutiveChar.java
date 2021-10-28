package com.test.practice;

public class CountConsecutiveChar {

	public static void main(String[] args) {

		String str = "";
		if(!str.isEmpty()) {
		CountConsecutiveChar(str);
		}
		else {
			System.out.println("Please enter any string::");
		}

	}

	private static void CountConsecutiveChar(String str) {

		for (int i = 0; i < str.length(); i++) {
			int count = 1;
			while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
				i++;
				count++;
			}
			System.out.print(str.charAt(i) + "" + count + " ");
		}

		System.out.println();
	}

}
