package com.test.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList();
		list.add(10);
		list.add(2);
		list.add(22);
		list.add(1);
		list.add(30);
		
		
		//Traditional approach
		Collections.sort(list,new Comparator<Integer>() {
			@Override
			public int compare(Integer i1, Integer i2) {
				// TODO Auto-generated method stub
				return -i1.compareTo(i2);
			}
		});
		System.out.println("Traditional approach:"+list);
		//using simple stream for natural 
		list.stream().sorted().forEach(System.out::println);
		System.out.println("*********");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println("Using reverse order:::");
		//using streams by using lamda expressions
		list.stream().sorted((i1,i2)->-i1.compareTo(i2)).forEach(System.out::println);
		
		
		//For Userdefined list objects
		List<Employee> list2 = new ArrayList();
		list2.add(new Employee(1, "sri", "IT", 10000));
		list2.add(new Employee(3, "karthk", "IT", 70000));
		list2.add(new Employee(6, "siva", "Ops", 40000));
		list2.add(new Employee(10, "Hari", "Devops", 30000));
		list2.add(new Employee(7, "sai", "Andriod", 50000));
		
		//Traditional approach
				Collections.sort(list2,new Comparator<Employee>() {

					@Override
					public int compare(Employee o1, Employee o2) {
						
						if(o1.getId() > o2.getId()) {
							return 11;
						}else if(o1.getId() < o2.getId()) {
							return -1;
						}
						return  0;
					}
					
				});
				System.out.println("Traditional approach:");
				for (Employee e : list2) {
					System.out.println(e.getId());
				}
				
				
				Collections.sort(list2,new Comparator<Employee>() {

					@Override
					public int compare(Employee o1, Employee o2) {
						return o1.getName().compareTo(o2.getName());
						
					}
					
				});
				System.out.println("Traditional approach:");
				for (Employee e1 : list2) {
					System.out.println(e1.getName());
				}
				System.out.println("Using lambda:id");
				list2.stream().sorted(Comparator.comparingInt(Employee::getId).reversed()).forEach(System.out::println);
				System.out.println("Using lambda:name another lambda");
				list2.stream().sorted(Comparator.comparing(emp->emp.getName())).forEach(System.out::println);
				
				System.out.println("Using lambda:String name::");
			list2.stream().sorted((o1,o2)->o1.getName().compareTo(o2.getName())).forEach(System.out::println);
	}

}
