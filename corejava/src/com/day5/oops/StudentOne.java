/**
 * 
 */
package com.day5.oops;

/**
 * @author hp
 *
 */
public class StudentOne {
	int id;
	String name;
	int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	void dispay() {
		System.out.println("rama");
	}
	
	public static void main(String[] args) {
		
		StudentOne obj=new StudentOne();
		obj.setId(1);
		obj.setName("Harish");
		obj.setAge(23);
		System.out.println("Name:="+obj.getName());
		System.out.println("ID:="+obj.getId());
		System.out.println("Age:="+obj.getAge());
		
		System.out.println("----------------------------");
		StudentOne obj2=new StudentOne();
		obj2.setId(2);
		obj2.setName("Sankar");
		obj2.setAge(24);
		System.out.println("Name:="+obj2.getName());
		System.out.println("ID:="+obj2.getId());
		System.out.println("Age:="+obj2.getAge());
		
		
		
	}

}
