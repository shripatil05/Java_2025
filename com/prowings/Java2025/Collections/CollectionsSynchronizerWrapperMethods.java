package com.prowings.Java2025.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsSynchronizerWrapperMethods {
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(100);
		numbers.add(200);
		numbers.add(300);
		numbers.add(400);
		numbers.add(500);
		
		List<Integer> syncNumbers = Collections.synchronizedList(numbers);
		
		Set set = Collections.synchronizedSet(new HashSet<>());
		Map map = Collections.synchronizedMap(new HashMap<>());
		
		System.out.println(syncNumbers);
	}

}
