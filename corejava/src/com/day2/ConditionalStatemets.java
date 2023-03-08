package com.day2;

import java.util.Scanner;

public class ConditionalStatemets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     Scanner sr=new Scanner(System.in);
	     System.out.println("Enter a value as integer ");
	     int a=sr.nextInt();
	     System.out.println("taking valalue"+a);
	     
	     System.out.println("Enter b value as integer ");
	     int b=sr.nextInt();
	     System.out.println("taking valalue"+b);
	     
		if(a!=b) {  //true 10!=20 ....>fales
			//10==10=true 
			System.out.println("inside if ");
			System.out.println("pass");
			
		}
		else {
			if(a!=10) { //10!==10
				System.out.println("a==10");
				
			}
			else {
				System.out.println("fail");
			}
			
		}

	}

}
