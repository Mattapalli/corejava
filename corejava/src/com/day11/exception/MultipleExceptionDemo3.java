package com.day11.exception;

public class MultipleExceptionDemo3 {

	public static void main(String[] args) {
		try {
			int arr[] = { 1, 2 };
			arr[2] = 3 / 0;                                      //   Arthmatics.._.>     exception
		} catch (ArrayIndexOutOfBoundsException e) // This block is unreachable
		{
			System.out.println("array index out of bound exception");
		}
		 catch (Exception e) // This block handles all Exception   child --->subchild-->super
		{
			System.out.println("Generic exception");
		}
	}
}
