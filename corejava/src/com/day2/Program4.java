/*Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative". 
Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.*/
package com.day2;

import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input value: ");
		double input = in.nextDouble();

		if (input > 0) { 
			if (input < 1) { 
				System.out.println("Positive small number");
			} else if (input > 1000000) {
				System.out.println("Positive large number");
			} else {
				System.out.println("Positive number");
			}
		} else if (input < 0) {
			if (Math.abs(input) < 1) {
				System.out.println("Negative small number");
			} else if (Math.abs(input) > 1000000) {
				System.out.println("Negative large number");
			} else {
				System.out.println("Negative number");
			}
		} else {
			System.out.println("Zero");
		}
	}
}
