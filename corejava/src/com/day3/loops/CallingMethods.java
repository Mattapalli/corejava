package com.day3.loops;

import java.util.Scanner;

public class CallingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter 1 adding of two numbers ");
		System.out.println("Enter 2 substract of two numbers ");
		System.out.println("Enter 3 multipication of two numbers ");
		System.out.println("Enter 4 divided of two numbers ");
		System.out.println("Enter invalied number to Exit from the programe ");
		System.out.println(".........................................................");
		Scanner sr=new Scanner(System.in);
		System.out.println("Enter the value for operation");
		int input=sr.nextInt();
		
		
		
		switch(input) {
		case 1:
			int add= 10+20;
			System.out.println("addition of two Numbers is ....="+add);
			System.out.println(".........................................................");
			break;
		case 2:
			int sub= 20-10;
			System.out.println("substract of two Numbers is ....="+sub);
			System.out.println(".........................................................");
			break;
		case 3:
			int mul= 10*20;
			System.out.println("multipication of two Numbers is ....="+mul);
			System.out.println(".........................................................");
			break;
		
			
		case 4:
			int div= 10+20;
			System.out.println("divided of two Numbers is ....="+div);
			System.out.println(".........................................................");
			break;
			
			default :
				System.out.println("Invalied operation and exit from the condtion");
				break;
			
		}

	}

}
