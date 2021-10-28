package com.test.interviewquestions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ModificationExpectionTest {

	public static void main(String[] args) {

		Map hm = new HashMap<String, Integer>();
		hm.put("sri", 1);
		hm.put("siva", 2);
		hm.put("vasu", 3);
		hm.put("hari", 4);
		
		Iterator iterator = hm.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<String, Integer> it = (Entry<String, Integer>) iterator.next();
			System.out.println("key:"+it.getKey());
			System.out.println("value:"+it.getValue());
			
			if(it.getValue()==2) {
				hm.put("sai", 5);
			}
		}
	}

}
