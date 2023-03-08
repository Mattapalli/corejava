package com.day11.exception;

public class NestedTryExceptionDemo {

	public static void main(String[] args) {
		try {
			int arr[] = { 5, 0, 1, 2 };

			int x = arr[3] / arr[1];
			

			arr[5] = 3; /// grtting but
		} finally {
			System.out.println("Always main");
			
		}
	}
}
