/**
 * 
 */
package com.day7MethodOverriding;

/**
 * @author hp
 *
 */
public class Rule1AccessModifierMain {

	public static void main(String[] args) {
		Rule1AccessModifierParent obj1 = new Rule1AccessModifierParent();
		obj1.m2();
		Rule1AccessModifierParent obj2 = new Rule1AccessModifierChild();
		obj2.m2();
				
		
	}

}
