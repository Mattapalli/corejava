/**
 * 
 */
package com.day13.setInterface;

import java.util.*;

/**
 * @author hp
 *
 */
public class HashSetDemo {
	 public static void main(String args[]){  
		  //Creating HashSet and adding elements  
		  Set<String> set=new HashSet<String>();  
		  set.add("Ravi");  
		  set.add("Vijay");  
		  set.add("Ravi");  
		  set.add("Ajay");  
		  set.add(null);
		  System.out.println(set);

}
}