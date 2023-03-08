/**
 * 
 */
package com.day7MethodOverLoading;

/**
 * @author hp
 *
 */
public class PrototyDoesNotMatchMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		byte a = 25;
		PrototyDoesNotMatch obj = new PrototyDoesNotMatch();

		// it will go to
		// byte argument
		obj.show(a);

		// String
		obj.show("hello");

		// Int
		obj.show(250);

		// Since char is
		// not available, so the datatype
		// higher than char in terms of
		// range is int.
		obj.show('A');

		// String
		obj.show("A");

		// since float datatype
		// is not available and so it's higher
		// datatype, so at this step their
		// will be an error.
		//obj.show(7.5);
	}
}