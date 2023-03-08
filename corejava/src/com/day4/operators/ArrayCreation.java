package com.day4.operators;

public class ArrayCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = new int[5];
		int arr1[]= {1,2,3,4,5}; 
		System.out.println(arr1.length);
		for (int x : arr1) {
			System.out.println(x);
		}
		System.out.println("element at first index: " +arr1[6]);
	}

}
