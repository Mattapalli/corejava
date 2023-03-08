/**
 * 
 */
package com.day11.exception;

/**
 * @author hp
 *
 */
public class InvalidProdectMain {

	// method to check the age
	static void validateAge(int age) throws ArithmeticException {
		if (age < 18) {  

			// throw an object of user defined exception
			throw new ArithmeticException("age is not valid to vote");
		} else {
			System.out.println("welcome to vote");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// calling the method
			validateAge(13);
		} catch (ArithmeticException ex) {
			System.out.println("Caught the exception");

			// printing the message from InvalidAgeException object
			System.out.println("Exception occured: " + ex.getStackTrace());
		}

		System.out.println("rest of the code...");
	}
}