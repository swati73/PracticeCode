package com.corejava.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryGap {
	public static int getHighestBinaryGap(int N) {
		List<Integer> list = new ArrayList<>();     
		char[] bs =Integer.toBinaryString(N).toCharArray();
		for(int i=0;i<bs.length;i++){

		    if(Character.toString(bs[i]).equals("1")){
		      list.add(i);
		    }
		}
		if(list.size()>1){
		    List<Integer> c=new ArrayList<>();
		    for(int i =1;i<list.size();i++){
		    int g =   list.get(i) - (list.get(i-1)+1);
		    c.add(g);
		    }
		    return Collections.max(c);
		}else{
		return 0;
		}
	}

	public static void main(String[] args) {
		int a = getHighestBinaryGap(1041);
		System.out.println("The highest binary gap is "+a);
	}

}
