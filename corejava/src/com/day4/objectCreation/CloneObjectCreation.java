package com.day4.objectCreation;
public class CloneObjectCreation implements Cloneable {
	
	public String getName() {
		return "Creating object usingclone ";
		
		/// contteation tp ,
	}
	public static void main(String args[]) {
		try {
			CloneObjectCreation s1 = new CloneObjectCreation();  

			CloneObjectCreation s2 = (CloneObjectCreation) s1.clone();

			System.out.println(s1.getName());
			System.out.println("Rama is"+s2.getName());

		} catch (CloneNotSupportedException c) {
		}

	}
}