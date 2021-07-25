package com.test.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.test.optional.Employee;

public class MapCollectionSort {

	public static <E> void main(String[] args) {

		Map map = new HashMap<String, Integer>();
		map.put("Rakesh", 1);
		map.put("Hari",4);
		map.put("Shiva",2);
		map.put("Karthik",5);
		map.put("Sri",3);
		map.put("Aravind",8);
		
		List<Entry<String, Integer>> entries= new ArrayList(map.entrySet());
		
		Collections.sort(entries, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				
				return o1.getKey().compareTo(o2.getKey());
			}
			
		});
		
		for(Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() +":"+entry.getValue());
		}
		
		
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("Rakesh", 1);
		map1.put("Hari",4);
		map1.put("Shiva",2);
		map1.put("Karthik",5);
		map1.put("Sri",3);
		map1.put("Aravind",3);
		List<Entry<String, Integer>> entries1= new ArrayList<Entry<String, Integer>>(map1.entrySet());
		Collections.sort(entries1, (Entry<String, Integer> o1, Entry<String, Integer> o2)-> o1.getKey().compareTo(o2.getKey()));
		System.out.println("With lambda::");
		for(Entry<String, Integer> entry : entries1) {
			System.out.println(entry.getKey() +":"+entry.getValue());
		}
		
		Collections.sort(entries1, (o1,o2)-> o1.getKey().compareTo(o2.getKey()));
		System.out.println("With lambda:: without arguments");
		for(Entry<String, Integer> entry : entries1) {
			System.out.println(entry.getKey() +":"+entry.getValue());
		}
		
		System.out.println("With streams with sorted()::");
		entries1.stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		entries1.stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		System.out.println("With streams and lambda::");
		entries1.stream().sorted((o1,o2)->o1.getKey().compareTo(o2.getKey())).forEach(System.out::println);
		entries1.stream().sorted((o1,o2)->o1.getValue().compareTo(o2.getValue())).forEach(System.out::println);
		
		Stream<Entry<String, Integer>> sorted = map1.entrySet().stream().sorted(Comparator.comparing(Map.Entry<String,Integer>::getValue).
				thenComparing(Map.Entry<String,Integer>::getKey));
		
		for (Entry<String, Integer> entry : entries1) {
			System.out.println("test::"+entry);
		}
		
		String key = map1.entrySet().stream().sorted(Comparator.comparing(Map.Entry<String,Integer>::getKey).
				thenComparing(Map.Entry<String,Integer>::getValue)).findFirst().get().getKey();
		System.out.println("key:"+key);
		
		
		String key1 = map1.entrySet().stream().sorted(Comparator.comparing(Map.Entry<String,Integer>::getKey).
				thenComparing(Map.Entry<String,Integer>::getValue).reversed()).findFirst().get().getKey();
		System.out.println("key1:"+key1);
		
		
		
		HashMap<Employee, String> employeeMap = new HashMap<>();
		employeeMap.put(new Employee(1, "sri", "IT", 50000), "Dev");
		employeeMap.put(new Employee(1, "Arvaind", "IT", 40000), "Manager");
		employeeMap.put(new Employee(1, "Karthik", "IT", 60000), "Dev");
		
		//employeeMap.entrySet().stream().sorted(Comparator.comparing(Map.Entry<Employee,String>::getKey)).forEach(System.out::println);
		
		employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed())). 
		forEach(System.out::println);
		
		Map<Employee, String> collect = employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary))). 
		collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		collect.forEach((keydata,value)->System.out.println(keydata + " "+value));
	}

}
