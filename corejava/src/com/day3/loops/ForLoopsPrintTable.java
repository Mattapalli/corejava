package com.day3.loops;

public class ForLoopsPrintTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{
			int n, i;
			n = 2;
			for (i = 1; i <= 10; i++) { 
				if(i==5) {
					break;
				}
				System.out.println(n + "*" + i + "=" + n * i);
			}

		}

	}
}



