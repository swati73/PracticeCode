package com.corejava.code;

public class TapeEquilibrium {

	public static int getMinDiff(int[] A) {
		int sum1 = A[0];
		int sum2 = 0;
		for (int i = 1; i < A.length; i++)
			sum2 += A[i];

		int diff = Math.abs(sum1 - sum2);
		System.out.println("diff " + diff);
		if (A.length > 2) {
			for (int i = 1; i < A.length; i++) {
				sum1 += A[i];
				sum2 -= A[i];
				System.out.println("sum1 " + sum1 + " sum2 " + sum2);
				int newdiff = Math.abs(sum1 - sum2);
				if (newdiff < diff)
					diff = newdiff;

				System.out.println("newDiff " + newdiff);
			}
		}
		return diff;
	}

	public static void main(String[] args) {

		int[] A = {-1000,1000};
		int a = getMinDiff(A);
		System.out.println("Minimum diff " + a);
	}

}
