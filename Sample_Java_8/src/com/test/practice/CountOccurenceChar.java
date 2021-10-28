package com.test.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountOccurenceChar {

	public static void main(String[] args) {
		
		String str = "aabbbbccb";
		
		CountOccurenceChar(str);

	}

	private static void CountOccurenceChar(String str) {
		
		
		Map<Character,Integer> map = new HashMap<Character,Integer>(str.length());
		
		for (Character ch : str.toCharArray()) {
			map.put(ch, map.containsKey(ch)?map.get(ch)+1:1);
		}
		for (Entry<Character,Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " "+entry.getValue());
		}
		
	}

}
