/**
 * 
 */
package com.day15.java8;

/**
 * @author Rama Krishna M
 *
 */
public interface DefaultAndStaticInterface {
	// Default method
		 default void print() {
			 System.out.println("Printing...default Method");
		 }
		 default void print2D() {
			 System.out.println("Printing 2D...Default Methods");
		 }
		 // Abstract methods
		 void print3D();
		 
		// Static method
		 static void printStatic() {
			 System.out.println("Printing...static method");
		 }
		 static void print2DStatic() {
			 System.out.println("Printing 2D...static method");
		 }
		 // Default Method
		 default void print3DStatic() {
			 System.out.println("Printing 3D..defult method.");
		 }
		 // Abstract Method
		 void getInfo();

}
