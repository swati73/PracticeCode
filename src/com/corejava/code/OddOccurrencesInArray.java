package com.corejava.code;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {

	public static int getOddPair(int [] A) {
		Map<Integer,Integer> map = new HashMap<>();
		int odd = 0;
		for(Integer num : A) {
		int count = map.containsKey(num) ? map.get(num):0;
		map.put(num,count+1);
		}
		
		for(Integer num : map.keySet()) {
			if(map.get(num) % 2 !=0) {
				odd= num;
			}
		}
		return odd;
	}
	public static void main(String[] args) {

		int[] A = {9,3,9,7,7,3,9};
		int x = getOddPair(A);
		System.out.println("The odd pair"+x);
	}

}
