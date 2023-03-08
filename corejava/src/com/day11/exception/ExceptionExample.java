package com.day11.exception;

public class ExceptionExample {
	public static void main(String args[]) {
		try {
			// code that may raise exception
			int data = 100 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		// rest code of the program
		System.out.println("rest of the code...");
		int c=20+30;
		System.out.println(c);
	}
}
