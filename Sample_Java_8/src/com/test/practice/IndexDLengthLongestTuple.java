package com.test.practice;

public class IndexDLengthLongestTuple {

	public static void main(String[] args) {
		
		String str = "aaaaaabbbbbbbbccdddddddddddd";
		
		int count = 0;
        int curCount = 1;
        int StartIndex = 0;
        
        for(int i=0;i<str.length()-1;i++) {
        	
        	if(str.charAt(i) == str.charAt(i+1)) {
        		curCount++;
        		if(curCount > count) {
        			count = curCount;
        		}
        	}else {
        		if(curCount > count) {
        			count = curCount;
        		}
        		curCount = 1;
        	}
        	
        }
        System.out.println("Longest tuple Length is :"+count);
	}

}
