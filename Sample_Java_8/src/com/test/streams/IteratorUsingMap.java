package com.test.streams;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IteratorUsingMap {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Rakesh", 1);
		map.put("Hari",4);
		map.put("Shiva",2);
		map.put("Karthik",5);
		map.put("Sri",3);
		map.put("Aravind",8);

		System.out.println(" Map.Entry<K, V> ");
		 Iterator<Entry<String,Integer>> iterator = map.entrySet().iterator();
		 while(iterator.hasNext()) {
			 Map.Entry<String, Integer> entry = (Entry<String, Integer>) iterator.next();
			 System.out.println(entry.getKey() +":"+entry.getValue());
		 }
		
		 
		 System.out.println(" Map.Entry<K, V> :");
		 Iterator<Map.Entry<String, Integer>> iterator1 = map.entrySet().iterator();
		 while(iterator1.hasNext()) {
			 Map.Entry<String, Integer> entry =  iterator1.next();
			 System.out.println(entry.getKey() +":"+entry.getValue());
		 }
		 
		 System.out.println(" using for-each loop for iteration over Map.entrySet() :");
	        for (Map.Entry<String,Integer> entry : map.entrySet())
	            System.out.println("Key = " + entry.getKey() +
	                             ", Value = " + entry.getValue());
		
	        System.out.println(" using keySet() for iteration over keys :");
	        for (String key : map.keySet())
	            System.out.println("key: " + key);
	        System.out.println("  using values() for iteration over values :");
	        for (Integer value : map.values())
	            System.out.println("value: " + value);
	        
	        System.out.println(" using foreach iterator using lambda :");
	        map.forEach((k,v)->System.out.println("key:"+k +"value:"+v));
	        
	}

}
