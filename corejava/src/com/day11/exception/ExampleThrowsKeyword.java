package com.day11.exception;

public class ExampleThrowsKeyword {

	static void check() throws ArithmeticException,NullPointerException{
		System.out.println("Inside check function");
		throw new ArithmeticException("Product is not avaiable ");
	}

	public static void main(String args[]) {
		try {
			check();
		} catch (ArithmeticException e) {
			System.out.println("caught:=" + e);
		}
	}
}