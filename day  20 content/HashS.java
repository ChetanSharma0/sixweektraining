package com.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashS {
	
	
	public static void main(String[] args) {
		
		HashSet hashSet = new HashSet<>();
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
