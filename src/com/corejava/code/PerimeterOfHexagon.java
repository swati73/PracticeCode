package com.corejava.code;

public class PerimeterOfHexagon {

	static void getPerimeterOfHexagon(double s) {
		// perimeter of regular hexagon
		double perimeter = s*6;
		System.out.println("Perimeter of Regular Hexagon "+perimeter);
	}
	public static void main(String[] args) {

		double s = 5.5;
		getPerimeterOfHexagon(s);
	}

}
