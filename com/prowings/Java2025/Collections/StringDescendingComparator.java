package com.prowings.Java2025.Collections;

import java.util.Comparator;

public class StringDescendingComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		
		if(s1.compareTo(s2) > 0)
			return -1;
		else if(s1.compareTo(s2) < 0)
			return 1;
		else
		   return 0;
	}

}
