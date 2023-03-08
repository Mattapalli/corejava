/**
 * 
 */
package com.day7RuntimePolymorphism;

/**
 * @author hp
 *
 */
public class SplenderBikeChild extends BikeParent {

	void run() {
		System.out.println("running safely with 60km");
	}

	public static void main(String args[]) {
		BikeParent b = new SplenderBikeChild();// upcasting
		b.run();
	}
}
