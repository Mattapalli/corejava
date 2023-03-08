/**
 * 
 */
package com.day8.Interface;

/**
 * @author hp
 *
 */
public class MovibleMain implements Movible {

	@Override
	public void move() {
  		System.out.println("Average speed is:="+AVG_SPEED);
 	}

	public static void main(String[] arg) {
		MovibleMain vc = new MovibleMain();
		vc.move();
	}
}
