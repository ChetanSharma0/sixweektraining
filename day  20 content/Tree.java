package com.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Tree {
	
	public static void main(String[] args) {
		TreeSet set = new TreeSet<>();
		
		set.add("rohit");
		set.add("ankit");
		set.add("aabb");
		set.add("aaabbb");
		set.add("paramveer");
		
		set.add("mohit");
		
		
		Iterator iterator = set.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
