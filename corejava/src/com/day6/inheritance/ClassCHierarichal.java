/**
 * 
 */
package com.day6.inheritance;

/**
 * @author hp
 *
 */
public class ClassCHierarichal  {

	public void show() {
		System.out.println("class c:=" + 20);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassCHierarichal c = new ClassCHierarichal();
		c.show();
				
		  ClassBHierarachal b = new ClassBHierarachal(); 
		  b.show(); b.showB();
		 
	}

}
