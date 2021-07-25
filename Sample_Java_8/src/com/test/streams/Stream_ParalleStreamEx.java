package com.test.streams;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Stream_ParalleStreamEx {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<String>();
		list.add("Karthik");
		list.add("Srikanth");
		list.add("Aravind");
		list.add("Hari");
		list.add("Shiva");
		long start;
		long end;
		
		start = System.currentTimeMillis();
		list.stream().forEach(e->System.out.println(e));
		end = System.currentTimeMillis();
		
		System.out.println("Time took for Stream() in milli seconds::"+(end-start));
		
		
		start = System.currentTimeMillis();
		list.parallelStream().forEach(System.out::println);
		end = System.currentTimeMillis();
		System.out.println("Time took for parallelStream() in milli seconds::"+(end-start));
		
		
		
		Set<String> set = new HashSet<String>();
		set.add("Karthik");
		set.add("Srikanth");
		set.add("Srikanth");
		set.add("Aravind");
		set.add("Hari");
		set.add("Shiva");
		
		start = System.currentTimeMillis();
		set.stream().forEach(e->System.out.println(e));
		end = System.currentTimeMillis();
		
		System.out.println("Time took for Stream() in milli seconds::"+(end-start));
		
		
		start = System.currentTimeMillis();
		set.parallelStream().forEach(System.out::println);
		end = System.currentTimeMillis();
		System.out.println("Time took for parallelStream() in milli seconds::"+(end-start));
	}

}
