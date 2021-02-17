package com.corejava.code;

import java.util.Arrays;

public class AnagramString {

	public static void checkAnagram(String str1, String str2) {
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
        if(ch1.length == ch2.length) {
        	if(Arrays.equals(ch1, ch2))
        		System.out.println("both strings are anagram");
        	else
        		System.out.println("both string are not anagram");
        }else {
        	System.out.println("both Strings are not anagram");
        }
	}

	public static void main(String args[]) {

		String str1 = "abccc";
		String str2 = "acbbc";
		checkAnagram(str1, str2);
	}
}
