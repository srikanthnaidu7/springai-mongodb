package com.test.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ReUseStreamsEx {

	public static void main(String[] args) {

		/*
		 * String[] arr = {"Sri","Siva","Hari","sri","Aravind"};
		 * 
		 * //conver as List //Stream<String> stream = Arrays.asList(arr).stream();
		 * 
		 * Stream<String> stream = Arrays.stream(arr);
		 * 
		 * stream.forEach(System.out::println);
		 * 
		 * //exception if use same stream again long count =
		 * stream.filter((str)->str.equals("sri")).count();
		 * 
		 * System.out.println("count:"+count);
		 * 
		 */
		String[] array = { "Sri", "Siva", "Hari", "sri", "Aravind" };

		Supplier<Stream<String>> supStream = () -> Stream.of(array);
		supStream.get().forEach(System.out::println);

		long count = supStream.get().filter((str) -> str.equalsIgnoreCase("sri")).count();
		System.out.println("count:"+count);
	}

}
