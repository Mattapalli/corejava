package com.day4.objectCreation;

import java.lang.reflect.InvocationTargetException;

public class ConstructorObject {
	
	public String nameValue() {
		return "Creating object for GetConstructor ";
	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		
		ConstructorObject obje = ConstructorObject.class.getConstructor().newInstance();
		System.out.println(obje.nameValue());
		

	}

}
