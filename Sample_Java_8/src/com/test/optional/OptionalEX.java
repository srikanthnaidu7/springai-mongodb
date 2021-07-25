package com.test.optional;

import java.util.Optional;
import java.util.function.Supplier;


public class OptionalEX {

	public static void main(String[] args) {
		
		Employee emp = null;
		Employee emp1 = new Employee();
		Optional<Employee> optional = Optional.ofNullable(emp);
		if(optional.isPresent()) {
			System.out.println("not null");
		}else {
			System.out.println("Is null");
		}
		
		
		Optional<Employee> optional1 = Optional.of(emp1);
		if(optional1.isPresent()) {
			System.out.println("not null");
		}else {
			System.out.println("Is null");
		}
		
		//using get()
		System.out.println("using get()::"+optional1.get());
		
		Supplier<Employee> sup = () ->  new Employee();
		
		System.out.println(optional1.orElseGet(sup));
	}

}
