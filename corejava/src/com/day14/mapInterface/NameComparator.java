/**
 * 
 */
package com.day14.mapInterface;

import java.util.Comparator;

/**
 * @author Rama Krishna M
 *
 */
public class NameComparator implements Comparator<StudentOne> {

	@Override
	public int compare(StudentOne s1, StudentOne s2) {
		return s1.name.compareTo(s2.name);
	}

}
