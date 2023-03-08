package com.day12.collectionProcessingElements;

import java.util.*;

public class ForLoopExaple {
	public static void main(String[] args) {
		LinkedList<String> ls = new LinkedList<String>();
		ls.add("a");
		ls.add("b");
		ls.add("c");
		ls.add("d");
		for (String str : ls) {
			System.out.print(str + " ");
		}
		System.out.println("\n.................");
		System.out.println("Size"+ls.size());
		//or
		 for(int i = 0; i<ls.size(); i++)
		    {
		      System.out.print(ls.get(i)+" ");
		    }
	}
}
