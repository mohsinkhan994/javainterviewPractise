package com.coding.pratice;

import java.util.HashMap;
import java.util.Map;

public class CountOccurence {

	
	public static void printOccurence(String s) {
		
	
	char [] arr = s.toCharArray();
	
	Map<Character, Integer> countMap = new HashMap<>(); 
	
	for(char c: arr) {
		if(countMap.containsKey(c)) {
		countMap.put(c, countMap.get(c)+1);
		}
		else {
			countMap.put(c,1);
		}
		}
	System.out.println(countMap);
	}
	public static void main(String[] args) {
		
		String name = "afbfgkcjfgfgjffkjgdjjkfjn";
		
		CountOccurence.printOccurence(name);
	
	}

}
