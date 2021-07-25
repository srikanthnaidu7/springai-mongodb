package com.test.streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringWithStreams {

	public static void main(String[] args) {
		
		//Find vowels in the given string
		
		String str = "hello hello";
		
		long count = str.chars().filter( x -> 
		{
			return (x == 'a' |x =='e'|x =='i'|x =='o'|x =='u');
					}).count();
		
		System.out.println("count:"+count);
		
		
		//Find duplicates in string
		
		Map<String, Long> collect = str.chars().mapToObj(x->(char)x).collect
				(Collectors.groupingBy(Object::toString,Collectors.counting()));
		
		collect.forEach((Key, value)->System.out.println(Key +" "+value));
		
		//Add string to [Hello-welcome-to-java] using StringJoiner Class
		
		String strj = "Hello welcome to java";
		String[] split = strj.split(" ");
		StringJoiner strJoin = new StringJoiner("-", "[", "]");
		
		for (String string : split) {
			strJoin.add(string);
		}
		
		System.out.println("print strJoin:"+strJoin);
		List<String> asList = Arrays.asList("Hello","welcome","to","java");
		System.out.println(asList);
		
		System.out.println("output with string data:"+asList.stream().collect(Collectors.joining("-")));
		
		String s= "hello";
		String s1 = new String(s);
		System.out.println(s.hashCode() +" "+s1.hashCode());
		System.out.println(s.hashCode() == s1.hashCode());
		
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("1", "sri");
		map.put(null,"test");
		map.put(null, "hello");
		
		map.forEach((key,value)->System.out.println(key+" "+value));
		
		String str1 = new String("sri");
		String st= str1;
		System.out.println(str1.hashCode() == st.hashCode());
		
		
		
	}

}
