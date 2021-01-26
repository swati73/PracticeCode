package com.corejava.code;

public class CyclicRotation {

	public static int[] rightShiftElements(int[] A, int K) {
		while(K>0) {
			for (int i = A.length -1; i > 0; i--) {
		           int temp = A[i];
		           A[i]=A[i-1];
		           A[i-1] =temp;
				}
			K--;
		}
		
		return A;
	}

	public static void main(String args[]) {
		int[] A = { 3, 8, 9, 7, 6 };
		int K = 3;
		int[] B = rightShiftElements(A, K);
		
		for(int a:B) {
			System.out.print(a+" ");
		}
	}

}
