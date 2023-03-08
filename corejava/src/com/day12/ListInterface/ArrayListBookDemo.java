/**
 * 
 */
package com.day12.ListInterface;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hp
 *
 */
public class ArrayListBookDemo {
	public static void main(String[] args) {
		// Creating list of ArrayListArrayListBooks
		List<ArrayListBook> list = new ArrayList();
		// Creating ArrayListArrayListBooks
		ArrayListBook b1 = new ArrayListBook(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		ArrayListBook b2 = new ArrayListBook(102, "Data Communications and Networking", "Forouzan", "Mc Graw Hill", 4);
	    ArrayListBook b3 = new ArrayListBook(103, "Operating System", "Galvin", "Wiley", 6);
		// Adding ArrayListArrayListBooks to list
		list.add(b1);
		list.add(b2);
		list.add(b3);
		// Traversing list
		for (ArrayListBook b : list) {
			System.out.println(b.id + " " + 
		b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}
	}
}