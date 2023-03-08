/**
 * 
 */
package com.day4.operators;

/**
 * @author hp
 *
 */
public class AssignmentOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 30;
		int b = 10;
		int c = 0;

		c = a + b;
		System.out.println("c = a + b = " + c);

		c += a;   //  c=c+a   40+30 =70
		System.out.println("c += a  = " + c);

		c -= a;   //c=c-a=70-30 =40
		System.out.println("c -= a = " + c);

		c *= a;  //c=c*a=  1200
		System.out.println("c *= a = " + c);

		a = 20;
		c = 25;
		c /= a;  //c=c/a= 25/20 =600
		System.out.println("c /= a = " + c);

		a = 20;
		c = 25;
		c %= a;    
		System.out.println("c %= a  = " + c);

		c <<= 2;
		System.out.println("c <<= 2 = " + c);

		c >>= 2;
		System.out.println("c >>= 2 = " + c);

		c >>= 2;
		System.out.println("c >>= 2 = " + c);

		c &= a;
		System.out.println("c &= a  = " + c);

		c ^= a;
		System.out.println("c ^= a   = " + c);

		c |= a;
		System.out.println("c |= a   = " + c);
	}
}
