package com.day12.ListInterface;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethodsDemo {
	public static void main(String args[]) {
		LinkedList<String> al = new LinkedList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");

		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("1................Add Elements to LinkedList....................");
		// Creating LinkedList
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Delhi");
		linkedList.add("NewYork");
		linkedList.add("Moscow");
		linkedList.add("Dubai");
		// Displaying LinkedList
		System.out.println(linkedList);
		System.out.println("2................Removing Elements............................");
		// Removing Elements
		linkedList.remove("Moscow");
		System.out.println("After Deleting Elements: \n" + linkedList);
		// Removing Second Element
		linkedList.remove(1);
		System.out.println("After Deleting Elements: \n" + linkedList);

		System.out.println("3.........Traversing Elements of LinkedList...................");
		// Traversing ArrayList
		for (String element : linkedList) {
			System.out.println(element);
		}

		System.out.println("4.........Get size of LinkedList..............................");

		System.out.println("Total Elements: " + linkedList.size());

		System.out.println("5.........Sorting LinkedList Elements..........................");

		// Sorting elements
		Collections.sort(linkedList);
		// Traversing ArrayList
		for (String element : linkedList) {
			System.out.println(element);
		}

		System.out.println(linkedList.getLast());
		System.out.println(linkedList.getFirst());

		System.out.println("........End Of Linked List ....................................");
	}
}