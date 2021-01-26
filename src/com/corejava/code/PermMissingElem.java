package com.corejava.code;

import java.util.Arrays;

public class PermMissingElem {

	public static int getMissingElement(int [] A) {
		Arrays.sort(A);
		int min = 1;
		for (int i = 0; i < A.length; i++) {
			if(A[i]==min)
				min++;
		}
		return min;
	}
	public static void main(String[] args) {
		
          int [] A= {1,2,3,5};
          int a = getMissingElement(A);
          System.out.println("Missing Element "+a);
	}

}
