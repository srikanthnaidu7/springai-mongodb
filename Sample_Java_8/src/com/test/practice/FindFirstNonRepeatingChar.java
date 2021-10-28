package com.test.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindFirstNonRepeatingChar {

	public static void main(String[] args) {

		String str = "aaddbeeff";

		char findFirstNonRepeatingChar = findFirstNonRepeatingChar(str);
		System.out.println(findFirstNonRepeatingChar);
	}

	private static char findFirstNonRepeatingChar(String str) {

		Map<Character, Integer> map = new HashMap<Character, Integer>(str.length());

		for (Character ch : str.toCharArray()) {

			map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);

		}

		for (Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
			
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
			
		}

		throw new RuntimeException("didnt find any non repeated Character");
	}

}
