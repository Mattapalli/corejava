/**
 * 
 */
package com.day14.mapInterface;

import java.util.Comparator;

/**
 * @author Rama Krishna M
 *
 */
public class AgeComparator implements Comparator<StudentOne> {

	@Override
	public int compare(StudentOne s1, StudentOne s2) {
		if (s1.age == s2.age)
			return 0;
		else if (s1.age > s2.age)
			return 1;
		else
			return -1;
	}
}
