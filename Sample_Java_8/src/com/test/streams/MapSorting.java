package com.test.streams;


import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapSorting {
	public static void main(String[] args) {
		Map<String, LocalDate> map1  = new HashMap<>();
		map1.put("Sri", LocalDate.of(1993, 3, 5));
		
		map1.put("Hari", LocalDate.of(1995, 5, 6));
		
		map1.put("Karthik", LocalDate.of(1992, 3, 7));
		
		
		
		String oldestEmployee = map1.entrySet().stream().sorted(Comparator.comparing
				(Map.Entry<String,LocalDate>::getValue).
				thenComparing(Map.Entry<String,LocalDate>::getKey)).findFirst().get().getKey();
		System.out.println("oldestEmployee:"+oldestEmployee);
		
		String youngestEmployee = map1.entrySet().stream().sorted(Comparator.comparing
				(Map.Entry<String,LocalDate>::getValue).
				thenComparing(Map.Entry<String,LocalDate>::getKey).reversed()).findFirst().get().getKey();
		
		System.out.println("youngestEmployee:"+youngestEmployee);
	}
	
	
}
