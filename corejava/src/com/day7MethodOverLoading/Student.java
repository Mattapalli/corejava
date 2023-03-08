/**
 * 
 */
package com.day7MethodOverLoading;

/**
 * @author hp
 *
 */
public class Student {
	// Method 1 
    public void StudentId(String name, int roll_no)
    {
            System.out.println("Name :" + name + " " + "Roll-No :" + roll_no);
    }
    // Method 2
    public void StudentId(int roll_no, String name)
    {
        // Again printing name and id of person
        System.out.println("Roll-No :" + roll_no + " " + "Name :" + name);
    }
}
  