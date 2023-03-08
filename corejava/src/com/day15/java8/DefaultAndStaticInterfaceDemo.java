/**
 * 
 */
package com.day15.java8;

/**
 * @author Rama Krishna M
 *
 */
public class DefaultAndStaticInterfaceDemo implements DefaultAndStaticInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultAndStaticInterfaceDemo demo = new DefaultAndStaticInterfaceDemo();
		// Calling Default Methods

		// Calling Abstract Methods
		demo.print3D();

		// Calling static Methods

		demo.getInfo();

	}

	@Override
	public void print3D() {
		// TODO Auto-generated method stub
		System.out.println("priting 3d");

	}

	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		System.out.println("getting all information");

	}

}
