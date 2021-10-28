package com.test.practice;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class LogFileRepetaingIP {

	public static void main(String[] args) {
		
		String str[] = {"10.0.0.1 user1 2017-06-12 info log details…. Testt1",
						"10.0.0.1 user1 2017-06-21 info log details…. Testt2",
						"10.0.0.2 user1 2017-06-21 info log details…. Testt3",
						"10.0.0.1 user1 2017-06-15 info log details…. Testt4",
						"10.0.0.3 user1 2017-06-21 info log details…. Testt5"};
		
		findRepeatedIpAddress(str);

	}

	private static void findRepeatedIpAddress(String[] str) {
		
		Map<String, Integer> map = new HashMap<>();
		
		for (String string : str) {
			
			String strArr[] = string.split(" ");
			
			map.put(strArr[0], map.containsKey(strArr[0])?map.get(strArr[0])+1:1);
			
		}
		
		for (Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() +" "+entry.getValue());
		}
		
		
		List<String> mostFrequent = new ArrayList<>();
        int freq = 0;
        
        for(String ip : map.keySet()){
            freq = Math.max(freq, map.get(ip)); 
        }
        
        for(String ip : map.keySet()){
            if(map.get(ip) == freq) mostFrequent.add(ip);
        }
        
        System.out.println(mostFrequent);
	}

}
