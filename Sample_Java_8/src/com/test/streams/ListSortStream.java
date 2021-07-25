package com.test.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ListSortStream {

	public static void main(String[] args) {

		
		List<String> list = new ArrayList<String>();
		list.add("Karthik");
		list.add("Srikanth");
		list.add("Aravind");
		list.add("Hari");
		list.add("Shiva");
		/*
		Comparator<String> comp = new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				
				return -o1.compareTo(o2);
			}
		};
		*/
		Collections.sort(list,  new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				
				return -o1.compareTo(o2);
			}
		});
		System.out.println("Basic java sorting");
		System.out.println("List :"+list);
		
		List<String> list1 = new ArrayList<>();
		list1.add("Karthik");
		list1.add("Srikanth");
		list1.add("Aravind");
		list1.add("Hari");
		list1.add("Srikanth");
		
		System.out.println("distinct names:");
		list.stream().distinct().sorted((o1,o2)->-o1.compareTo(o2)).forEach(System.out::println);
		
		//Lambda
		System.out.println("Using Lambda  sorting");
		Collections.sort(list1,(o1,o2)->o1.compareTo(o2));
		System.out.println("List1 :"+list1);
		
		
		System.out.println("Using stream  sorting");
		List list2 = list1.stream().sorted().collect(Collectors.toList());
		System.out.println("list2"+list2);
		
		System.out.println("Using stream compartor sorting");
		List list3 = list1.stream().sorted((o1,o2)->-o1.compareTo(o2)).collect(Collectors.toList());
		System.out.println("list3"+list3);
		
		System.out.println("Using stream compartor sorting by for each");
		list1.stream().sorted((o1,o2)->-o1.compareTo(o2)).forEach(System.out::println);
		
		System.out.println("Using stream compartor sorting by for each funciton method");
		list1.stream().sorted(Comparator.comparing(i1->i1.length()>5)).forEach(System.out::println);
		
		
		List<Employee> list5 = new ArrayList<>();
		list5.add(new Employee(1, "Karthik", "IT", 10000));
		list5.add(new Employee(4, "Hari", "Computer", 2000));
		list5.add(new Employee(3, "Aravind", "Devops", 14000));
		list5.add(new Employee(5, "Srikanth", "Operations", 4000));
		list5.add(new Employee(2, "Bavani", "Apps", 4000));
		
		
		Collections.sort(list5,  new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				if(o1.getSalary()>o2.getSalary()) {
					return 1;
				}else if(o1.getSalary()<o2.getSalary()) {
					return -1;
				}else if(o1.getSalary() == o2.getSalary()) {
					return o1.getName().compareTo(o2.getName());
				}
				return 0;
			}
		});
		
		System.out.println("checking salary = list5"+list5);
		
		Collections.sort(list5);
		System.out.println("list5"+list5);
		
		System.out.println("collection userdefined class Using Lambda  sorting names");
		Collections.sort(list5,(o1,o2)->o1.getName().compareTo(o2.getName()));
		System.out.println("List1 :"+list5);
		
		System.out.println("collection userdefined class Using Lambda  sorting based on salry");
		Collections.sort(list5,(o1,o2)->(int)(o1.getSalary() - o2.getSalary()));
		System.out.println("List1 :"+list5);
		
		
		System.out.println("collection userdefined class Using Lambda  sorting based on id");
		Collections.sort(list5,(o1,o2)->(o1.getId() - o2.getId()));
		System.out.println("List1 :"+list5);
		
		System.out.println("collection userdefined class Using Streams  sorting based on custom which emp impl natural comparable");
		list5.stream().sorted().forEach(System.out::println);
		
		System.out.println("collection userdefined class Using Streams  sorting based Fucntion");
		list5.stream().sorted(Comparator.comparing(e1->e1.getSalary())).forEach(System.out::println);
		
		System.out.println("collection userdefined class Using Streams using lambda sorting based on id");
		list5.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).forEach(System.out::println);
		
		System.out.println("collection userdefined class Using Streams using then comparing if salary is equal for both then name sort");
		list5.stream().sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName)).forEach(System.out::println);
		
		System.out.println("collection userdefined class Using Streams using then comparing reversed");
		list5.stream().sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName).reversed()).forEach(System.out::println);
		
		//Find 2nd hieghest salry of employee
		Optional<Employee> emp = list5.stream()
		        .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();

		System.out.println("2nd hieghest salry of employee:"+emp.get());
		
		System.out.println("find the list of employees whoose name start with S:");
		//find the employee name whoose start with S
		list5.parallelStream().filter(e->e.getName().charAt(0)=='s').forEach(System.out::println);
		
		
		
		//array of sum
		int[] arr = {2,1,6,9};
		
		//count of array
		long count = Arrays.stream(arr).count();
		
		System.out.println("Count:"+count);
		
		
		 int sum = Arrays.stream(arr).reduce(0, Integer::sum);
		 System.out.println("sum:"+sum);
	}

}
