package com.day5.oops;

// Class Declaration

public class Dog {
	// Instance Variables
	String name;
	String breed;
	int age;
	String color;

	// Constructor Declaration of Class
	public Dog(String name, String breed, int age, String color) {
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
	}

	// method 1
	public String getName() {
		return name;
	}

	// method 2
	public String getBreed() {
		return breed;
	}

	// method 3
	public int getAge() {
		return age;
	}

	// method 4
	public String getColor() {
		return color;
	}

	public String display(Dog dog) {
		System.out.println("doing somethiing");
		
		if(4%2==0) {
			System.out.println("Even");
		}
		return dog.toString();
	}
	
	
	
	
	
	
	@Override
	public String toString() {
		return ("Hi my name is " + this.getName() + ".\nMy breed,age and color are " + this.getBreed() + ","
				+ this.getAge() + "," + this.getColor());
	}

	public static void main(String[] args) {
		Dog obj = new Dog("tuffy", "papillon", 5, "white");
		System.out.println(obj.toString());
		System.out.println(StudentOne.class);
		System.out.println(obj.getClass());
		System.out.println(Math.pow(2, 2));
		obj.display(obj);
		
		
		
		Dog obj2 = new Dog("tuffy", "papillon", 5, "white");
		

		
	}
}
