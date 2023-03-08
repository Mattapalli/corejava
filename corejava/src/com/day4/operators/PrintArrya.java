package com.day4.operators;

public class PrintArrya {
	public static void main(String[] args) {
		int[][] a = new int[10][10];
		
		for (int i = 0; i < 10; i++) {
			
			for (int j = 0; j < 10; j++) {     //innner loop will repate how may time? 10
				System.out.printf("Java ", a[i][j]);
			}
			System.out.println();
		}
	}
}