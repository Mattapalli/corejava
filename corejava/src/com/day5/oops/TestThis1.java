/**
 * 
 */
package com.day5.oops;

/**
 * @author hp
 *
 */
class Student1 {
	int rollno;
	String name;
	float fee;

	Student1(int rollno, String name, float fee) {
		rollno = rollno;
		name = name;
		fee = fee;
	}

	/*
	 * Student1 (int rollno,String name,float fee){ this.rollno=rollno;
	 * this.name=name; this.fee=fee; }
	 */
	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}
}

class TestThis1 {
	public static void main(String args[]) {
		Student1 s1 = new Student1(111, "ankit", 5000f);
		Student1 s2 = new Student1(112, "sumit", 6000f);
		s1.display();
		s2.display();
	}
}
