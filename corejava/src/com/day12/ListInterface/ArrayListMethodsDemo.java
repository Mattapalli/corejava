/**
 * 
 */
package com.day12.ListInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.*;

/**
 * @author hp
 *
 */
public class ArrayListMethodsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating an ArrayList
		System.out.println("..............Displaying All elements.......................");
		ArrayList<String> fruits = new ArrayList<String>();
		// Adding elements to ArrayList
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Berry");
	
		// Displaying ArrayList
		System.out.println(fruits);

		System.out.println("..............Remove.......................");
		// Removing Elements
		fruits.remove("Apple");
		System.out.println("After Deleting Elements: \n" + fruits);
		// Removing Second Element
		fruits.remove(1);
		System.out.println("After Deleting Elements: \n" + fruits);

		System.out.println(".............Processing Elements....................................");
		// Traversing ArrayList
		for (String element : fruits) {
			System.out.println(element);
		}
		System.out.println("..............Get Size of elements.......................");
		fruits.add("Orange");
		System.out.println("Total Elements: " + fruits.size());

		System.out.println("..............Sorting of elements.......................");
		Collections.sort(fruits);
		for (String value : fruits) {
			System.out.println(value);
		}

		System.out.println("Sorting numbers...");
		// Creating a list of numbers
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(21);
		list2.add(11);
		list2.add(51);
		list2.add(1);
		// Sorting the list
		Collections.sort(list2);
		// Traversing list through the for-each loop
		for (Integer number : list2) {
			System.out.println(number);
		}

		System.out.println("..............Set the elements.......................");
		// changing the element   Mango and org
		fruits.set(0, "Dates");
		System.out.println(fruits);
		System.out.println("..............GET the elements.......................");
		// Getting the element   dates ,org
		System.out.println(fruits.get(1));

		System.out.println("..............Processing elements ways.......................");
		ArrayList<String> list = new ArrayList<String>();// Creating arraylist
		list.add("Rama");// Adding object in arraylist
		list.add("Sankar");
		list.add("Lohith");
		list.add("Mannaf");
		list.add("Harish");
		list.add("Amar");
		list.add("Rama");

		System.out.println("Traversing list through List Iterator:");
		// Here, element iterates in reverse order
		ListIterator<String> list1 = list.listIterator(list.size());
		while (list1.hasPrevious()) {
			String str = list1.previous();
			System.out.println(str);
		}
		System.out.println("Traversing list through for loop:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("Traversing list through forEach() method:");
		// The forEach() method is a new feature, introduced in Java 8.
		list.forEach(a -> { // Here, we are using lambda expression
			System.out.println(a);
		});

		System.out.println("Traversing list through forEachRemaining() method:");
		Iterator<String> itr = list.iterator();
		itr.forEachRemaining(a -> // Here, we are using lambda expression
		{
			System.out.println(a);
		});

		System.out.println("8..............Convert Array to List.......................");
		
		String[] array = { "Java", "Python", "PHP", "C++" };
		System.out.println("Printing Array: " + Arrays.toString(array));
		// Converting Array to List
		List<String> listValues = new ArrayList<String>();
		
		//adding all arrays elements to List 
		for (String lang : array) {
			listValues.add(lang);
		}
		System.out.println("Printing List: " + listValues);
	
		System.out.println("9..............Convert List to Array.......................");
		 //Converting ArrayList to Array  
		 String[] arrayToList = listValues.toArray(new String[listValues.size()]);    
		 System.out.println("Printing Array: "+Arrays.toString(arrayToList));  
		 System.out.println("Printing List: "+listValues);  
		

		System.out.println(".......................END ....................................");

	}

}
