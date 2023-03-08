package com.day2;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sr=new Scanner(System.in);
		System.out.println("Enter the value");
		
		//10,20 ,30   
		
		int a=sr.nextInt();
		
		if(a==20) {
			System.out.println("teen age");
		}else {
			System.out.println("given number is odd");
		}

	}

}
