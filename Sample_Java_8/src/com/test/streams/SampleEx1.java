package com.test.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SampleEx1 {

	public static void main(String[] args) {



		List<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(15);
		list.add(76);
		list.add(63);
		list.add(35);
		System.out.println(list);
		
		//filter()
		List<Integer> list1 =  list.stream().filter(i->i%2==0).collect(Collectors.toList());

		System.out.println("filter ex list :"+list1);

		//map()
		List<Integer> list2 =  list.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println("map example:"+list2);


		//count()
		long noOfStudentsFailed = list.stream().filter(i->i<35).count();
		System.out.println("No of students Failed:"+noOfStudentsFailed);


		//sorted()-natural sorting sorting
		List<Integer> list3 =  list.stream().sorted().collect(Collectors.toList());
		System.out.println("natural sorting sorting"+list3);

		//sorted()-customized sorting 
		List<Integer> list4 =  list.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
		System.out.println("customized sorting"+list4);

		//sorted(Comparator)-customized sorting sorting
		List<Integer> list5 =  list.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println("customized sorting:"+list5);
		List<Integer> myList = list.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
		myList.forEach(System.out::println);
		
		//min()-Natural sorting
		int minValue = list.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("Min value:"+minValue);



		//min()-custom sorting
		int minValue1 = list.stream().min((i1,i2)->-i1.compareTo(i2)).get();
		System.out.println("Min value:"+minValue1);

		//max()-custom sorting
		int maxValue = list.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("Max value:"+maxValue);
		
		
		//forEach(Function)
		list.stream().forEach(i->System.out.println("The sum of each value:"+i*i));
		
		
		Stream<Integer> s = Stream.of(9,99,999,9999,99999);
		s.forEach(System.out::println);
		//slicing
		
		
      		
	}

}
