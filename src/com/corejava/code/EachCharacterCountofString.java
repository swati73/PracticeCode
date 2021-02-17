package com.corejava.code;

import java.util.HashMap;
import java.util.Map;

public class EachCharacterCountofString {

	static final int MAX_CHAR = 256;
	static void getEachCharacterCount(String str) {
		int[] count = new int[MAX_CHAR];
		char[] ch = new char[str.length()];
		
		for(int i=0;i<str.length();i++)
			count[str.charAt(i)]++;
		
		for(int i=0;i<str.length();i++) {
			ch[i] = str.charAt(i);
			
			int find = 0;
			for(int j=0;j<=i;j++) {
				// if any matches found
				if(str.charAt(i)==ch[j]) {
					find++;
				}
				
			}
			if(find == 1)
				System.out.println("Number of occurance of "+str.charAt(i)+" is "+count[str.charAt(i)]);
		}

	}
	
	static void getEachCharacterCount2(String str) {
		char[] ch = str.toCharArray();
		Map<Character,Integer> map = new HashMap<>();
		for(Character ch1 : ch) {
		int count = map.containsKey(ch1) ? map.get(ch1):0;
		map.put(ch1,count+1);
		}
	    
		for(Character ch1 : map.keySet()) {
			System.out.println("Number count of character "+ch1+" is "+map.get(ch1));
		}

	}

	public static void main(String[] args) {

		String str = "Hello";
		getEachCharacterCount(str);
		getEachCharacterCount2(str);
	}

}
