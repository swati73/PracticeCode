package com.corejava.code;

public class FrogJmp {

	public static int frogmMinJump(int X, int Y, int D) {
		int jumps = 0;

		if ((Y - X) < D) {
			jumps = 1;
		}
		if ((Y - X) % D == 0) {
			jumps = (Y - X) / D;
		} else {
			jumps = ((Y - X) / D) + 1;
		}
		return jumps;
	}
	
	public static void main(String args[]) {
		int x = 10;
		int y = 85;
		int d = 30;
		int jumps = frogmMinJump(x, y, d);
		System.out.println("Total frog jumps "+jumps);
	}
}
