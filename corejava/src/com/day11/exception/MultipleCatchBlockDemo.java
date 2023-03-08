package com.day11.exception;

public class MultipleCatchBlockDemo {
	public static void main(String[] args) {
		try {
			Integer in = new Integer("abc");
			in.intValue();

		} catch (ArithmeticException e) {
			System.out.println("Arithmetic " + e);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Number Format Exception " + e);
		}
	}

}
