package com.test.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test {

	public static void main(String[] args) {

		List<String> asList = Arrays.asList("cricket","footbal","basketball","hocky","badmintion");
		List<String> list = new CopyOnWriteArrayList<>();
		list.addAll(asList);
		
		/*
		 * for (String string : list) { System.out.println("value:"+string);
		 * 
		 * if(string.equals("footbal")) { list.add("test"); } }
		 */
		 
		/*
		 * ListIterator<String> itr = list.listIterator(); while(itr.hasNext()) { String
		 * str = itr.next();
		 * 
		 * if(str.equals("footbal")) { list.add("test");
		 * 
		 * }
		 * 
		 * 
		 * }
		 */
		System.out.println(list);
	}

}
