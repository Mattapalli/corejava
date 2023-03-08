/**
 * 
 */
package com.day11.exception;

/**
 * @author hp
 *
 */
public class ExampleThrowKeyWord {

	static void avg() {

		throw new ArithmeticException("product id is not avaliable....!");

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		avg();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("rama: "+e);
		}

	}

}
