/**
 * 
 */
package com.day6.inheritance;

/**
 * @author hp
 *
 */
public class Emp {
	int id;
	String name;
	Address address;

	public Emp(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	void display() {
		System.out.println(id + " " + name);
		System.out.println(address.city + " " + address.state + " " + address.country);
	}

	public static void main(String[] args) {
		Address address1 = new Address("USA", "State", "USA_tex");
		Address address2 = new Address("IND", "AP", "india");

		Emp e = new Emp(111, "Rama", address1);
		Emp e2 = new Emp(112, "Lohit", address2);

		e.display();
		e2.display();

	}
}
