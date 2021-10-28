package com.test.practice;

import java.util.Arrays;

public class AnagramTest {

	public static void main(String[] args) {

		char str1[] = { 'c', 'a', 't' };
		char str2[] = { 'a', 'c', 't' };

		if (areAnagram(str1, str2))
			System.out.println("The two strings are anagram of each other");
		else
			System.out.println("The two strings are not anagram of each other");

		String angstr1 = "cat";
		String angstr2 = "act";

		
		areAnagramString(angstr1, angstr2);
	}

	private static void areAnagramString(String anstr1, String anstr2) {
		
		if(anstr1.length() != anstr2.length()) {
			System.out.println("Length is not equal strings not anagaram...");
		}
		else {
			char[] ch1= anstr1.toCharArray();
			char[] ch2= anstr2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if(Arrays.equals(ch1, ch2)) {
				System.out.println("two strings are anagaram...");
			}else {
				System.out.println("two strings are not anagram..");
			}
		}

	}

	private static boolean areAnagram(char[] str1, char[] str2) {

		if (str1.length != str2.length)
			return false;

		Arrays.sort(str1);
		Arrays.sort(str2);
		
		for (int i = 0; i < str1.length; i++)
			if (str1[i] != str2[i])
				return false;

		return true;

	}

}
