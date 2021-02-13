package com.corejava.code;

public class AreaOfHexagon {

	// area of regular hexagon
	static void getAreaOfHexagon(double s) {
		double area = (3*Math.sqrt(3)*(s*s))/2;
		System.out.println("area of hexagon "+ area);
	}
	public static void main(String[] args) {
		double s = 3;
		getAreaOfHexagon(s);
	}
}
