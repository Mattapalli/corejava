package com.day3.loops;

public class BreakLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 10; i++) {
			if (i == 8) {
				System.out.println(" Break the value is after:=" + i);
				break;
			}
			System.out.println(i);
			
		}
	}
}
