/**
 * 
 */
package com.day7RuntimePolymorphism;

/**
 * @author hp
 *
 */
public class DynamicBindingParemtChild extends DynamicBindingParemt {

	void run() {
		System.out.println("Dynamic binding process in child...");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DynamicBindingParemt a = new DynamicBindingParemtChild();
		a.run();

	}

}
