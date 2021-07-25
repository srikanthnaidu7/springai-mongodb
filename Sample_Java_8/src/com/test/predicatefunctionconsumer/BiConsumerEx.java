package com.test.predicatefunctionconsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerEx {

	public static void main(String[] args) {

		//It will take two arg and won't return anything.
		BiConsumer<Employee1, Double> biCons = (e,d)-> e.salary= e.salary+d ;
		
		List<Employee1> list = new ArrayList<Employee1>();
		addEmployee(list);
		
		for(Employee1 emp: list) {
			biCons.accept(emp, 500.0);
		}
		
		for(Employee1 employee:list) {
			System.out.println(employee);
		}
	}

	private static void addEmployee(List<Employee1> list) {

		list.add(new Employee1(1, "sri", 4000));
		list.add(new Employee1(1, "shiva", 5000));
		list.add(new Employee1(1, "hari", 6000));
	}

}
