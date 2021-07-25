package com.test.predicatefunctionconsumer;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class BiFunctionEx {

	public static void main(String[] args) {

		BiFunction<Integer, String, Employee> biFun = (eno,ename)->new Employee(eno,ename);
		
		int a = 10;
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(biFun.apply(1, "Sri"));
		list.add(biFun.apply(2, "Shiva"));
		for(Employee emp:list) {
			System.out.println("Emp No:"+emp.no +"Emp name:"+emp.name);
		}
		
	}

}
