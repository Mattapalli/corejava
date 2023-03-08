/**
 * 
 */
package com.day8.Interface;

/**
 * @author hp
 *
 */
public class TyreMain implements MovibleIterfaceOne,RollableIterfaceTwo {
	int width;
	
	@Override
	public boolean isMoveable() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isRollable() {
		// TODO Auto-generated method stub
		return true;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TyreMain tr = new TyreMain();
  		System.out.println(tr.isMoveable());
  		System.out.println(tr.isRollable());

	}	

}
