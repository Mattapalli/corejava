/**
 * 
 */
package com.day15.java8;

/**
 * @author Rama Krishna M
 *
 */
public class FunctionInterFaceExampleDemo implements Sayable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionInterFaceExampleDemo fie = new FunctionInterFaceExampleDemo();
		fie.say("Hello there");
		fie.doIt();
		System.out.println(fie.equals(fie));
		System.out.println(fie.hashCode());
	}

	@Override
	public void say(String msg) {
		// TODO Auto-generated method stub
		System.out.println(msg);

	}

}
