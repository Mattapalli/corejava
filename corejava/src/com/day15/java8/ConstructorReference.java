/**
 * 
 */
package com.day15.java8;

/**
 * @author Rama Krishna M
 *
 */

interface Messageable {
	Message getMessage(String msg);
}

class Message {
	Message(String msg) {
		System.out.print(msg);
	}
}

public class ConstructorReference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   Messageable hello = Message::new;  
	        hello.getMessage("Hello");  

	}

}
