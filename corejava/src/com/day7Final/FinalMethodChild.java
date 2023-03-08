/**
 * 
 */
package com.day7Final;

/**
 * @author hp
 *
 */
public class FinalMethodChild extends FinalMethodParent {

	void run() {
		System.out.println("running safely with 100kmph");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FinalMethodChild child = new FinalMethodChild();
		child.run();
	}

}
