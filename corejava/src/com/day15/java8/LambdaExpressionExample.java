/**
 * 
 */
package com.day15.java8;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rama Krishna M
 *
 */
public class LambdaExpressionExample{

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("1.....Adding Number with parameter.............");
		// Lambda expression with parameter.
		MathOperation addition = (int a, int b) -> a + b;
		System.out.println(addition.operation(5, 7));
		


		System.out.println("2.....Adding Number with out parameter.............");
		// Lambda expression without parameter.
		MathOperation addition1 =  (a,b)->a+b;
		System.out.println(addition1.operation(20, 25));

		System.out.println("3.....subtraction .................................");
		MathOperation subtraction = (a, b) -> a - b;
		System.out.println(subtraction.operation(35, 15));

		System.out.println("4.....multiplication .................................");
		// with return statement along with curly braces
		MathOperation multiplication = (int a, int b) -> {
			return a * b;
		};
		
		System.out.println(multiplication.operation(3, 5));

		System.out.println("5.....Division .................................");
		// without return statement and without curly braces

		MathOperation division = (int a, int b) -> a / b;
		System.out.println(division.operation(10, 2));

		System.out.println("6....String Message .................................");
		// without parenthesis
		GreetingService greetService1 = message -> System.out.println("Hello " + message);
		greetService1.sayMessage("Harish");
		// with parenthesis
		GreetingService greetService2 = (message) -> System.out.println("Hello " + message);
		greetService2.sayMessage("Lohith");

		GreetingService s1 = (message) -> {
			System.out.println(message);
			
		};
		s1.sayMessage("Welcome");

		System.out.println("7....Foreach Loop .................................");
		List<String> list = new ArrayList<String>();
		list.add("Sankar");
		list.add("Lohit");
		list.add("Mannaf");
		list.add("Harish");
		list.forEach((n) -> System.out.println(n));
		
		
	}
		
}
