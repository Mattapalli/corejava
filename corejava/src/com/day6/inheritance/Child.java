package com.day6.inheritance;

public class Child extends Parent {

	public void c1() {
		System.out.println("Child method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child childObj = new Child();
		childObj.c1();
		childObj.p1();

		Parent parentObjet = new Parent();
		parentObjet.p1();

	}

}
