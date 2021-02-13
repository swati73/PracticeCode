package com.corejava.code;

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
	public static void main(String[] args) {

		String str = "HelloWorld";
		getEachCharacterCount(str);
	}

}
