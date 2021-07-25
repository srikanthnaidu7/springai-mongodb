package com.test.streams.mapvsflatmap;

import java.util.List;
import java.util.stream.Collectors;

public class MapVSFlatMap {

	public static void main(String[] args) {

		/*
		 * Both methods are intermediate methods return the another stream as part of
		 * the output
		 * 
		 * map() used for transformation
		 * 
		 * flatMap() used for transformation + flattering
		 * 
		 * ->flatMap() -> map()+flattering
		 * 
		 * map- > Stream <R> map(Stream<T> input){}
		 * 
		 * this called one-one mapping
		 * 
		 * flatMap- > Stream <R> map(Stream<<Stream<T> input){}
		 * 
		 * this called one-many mapping
		 */

		List<Customer> customers = SampleData.getAll();

		// Using the map() flattering the data with one stream one-one
		List<String> emails = customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
		System.out.println("using map:" + emails);

		// Using the map() flattering the data with one stream one-may
		List<List<String>> phoneNums = customers.stream().map(customer -> customer.getPhoneNum())
				.collect(Collectors.toList());
		System.out.println("using map list of list:" + phoneNums);

		// Using the map() flattering the data with one stream one-may
		List<String> flatMapphoneNums = customers.stream().flatMap(customer -> customer.getPhoneNum().stream())
				.collect(Collectors.toList());
		System.out.println("using flatmap() list of list:" + flatMapphoneNums);
	}

}
