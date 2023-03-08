package com.day1;

import java.util.ArrayList;
import java.util.List;

import com.day5.oops.Dog;

public class Test {     //test.class 
	int a=10; //Method area
	//Method area
	public void main1(String str) {
		System.out.println(str);
	}
	
	public void main2(String str) {
				
		System.out.println(str);
	}
	//Method area
	static public  void main(String[] arrs) {
		/*
		 * System.out.println("Rama........."); Test obj2=new Test(); Test obj=new
		 * Test(); Test obj1=new Test(); //heap Area
		 * 
		 * obj2.main2("Secound"); System.out.println("1"+obj1);
		 * System.out.println("2"+obj); obj.main1("hello");
		 */
		Dog dog = new Dog("tuffy", "papillon", 5, "white");
		dog.display(dog);
		
	
		
		
		
		
	}
	
	
	
	

}
