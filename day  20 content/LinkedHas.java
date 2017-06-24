package com.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHas {
	
	public static void main(String[] args) {
		LinkedHashSet hashSet = new LinkedHashSet<>();
		hashSet.add("d");
		hashSet.add(2);
		hashSet.add(1);
		hashSet.add(3);
		hashSet.add(1);
		hashSet.add(2);
		
		
		Iterator iterator = hashSet.iterator();
		
		
		while (iterator.hasNext()) {

			System.out.print(iterator.next());
		}

		
		
		
		
		
		
		
		
		
		
		
	}

}
