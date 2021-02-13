package com.corejava.code;

public class DistinctCharactersInString {

	static final int MAX_CHAR = 256;
	static void distinctCharsInString(String str) {
		int[] count = new int[MAX_CHAR];
		for(int i=0; i<str.length();i++) {
			count[str.charAt(i)]++;
		}
		
		for(int i=0;i<str.length();i++) {
			if(count[str.charAt(i)] == 1)
			System.out.print(str.charAt(i));
		}
	}
	public static void main(String[] args) {

		String str ="helloworldjava";
		distinctCharsInString(str);
	}

}
