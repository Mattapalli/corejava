/**
 * 
 */
package com.day12.collectionProcessingElements;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author hp
 *
 */
public class IteratorExample {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Sankar");
		list.add("Lohith");
		list.add("Harish");
		list.add("Manaff");
		Iterator it = list.iterator(); // Declaring Iterator
		// processing the elements one by one
		while (it.hasNext()) {
			System.out.println(it.next());

		}
		
		//remove some elements
		
	}

}
