package com.corejava.code;

import java.util.Arrays;

public class PermMissingElem {

	public static int getMissingElement(int [] A) {
		Arrays.sort(A);
		int min = A[0];
		for (int i = 0; i < A.length; i++) {
			if(A[i]==min)
				min++;
		}
		return min;
	}
	public static void main(String[] args) {
		  
          int [] A= {2,4,3,6};
          int a = getMissingElement(A);
          System.out.println("Missing Element "+a);
          
          String m = "banana";
          System.out.println(m.compareTo("apple"));
	}

}
