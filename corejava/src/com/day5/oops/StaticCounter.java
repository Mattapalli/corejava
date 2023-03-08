/**
 * 
 */
package com.day5.oops;

/**
 * @author hp
 *
 */
public class StaticCounter {

	int count=0;//will get memory each time when the instance is created  
	//static int count=0;//will get memory only once and retain its value  
	  
	StaticCounter(){  
	count++;//incrementing value  
	System.out.println(count);  
	}  
	  
	public static void main(String args[]){  
	//Creating objects  
		StaticCounter c1=new StaticCounter();  
		StaticCounter c2=new StaticCounter();  
		StaticCounter c3=new StaticCounter();  
	}  
	}  
