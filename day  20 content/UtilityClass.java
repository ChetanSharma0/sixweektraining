package com.collection;

import java.util.Arrays;

public class UtilityClass {
public static void main(String[] args) {
	
	int[] a=new int[] {1,44,66,67,22,77,22,77,99};
	
	
	System.out.println("before sort:");
	for(int i:a)
	{
		System.out.println(i);
	}
	Arrays.sort(a);
	System.out.println("after sort:");
	for(int i:a)
	{
		System.out.println(i);
	}
	
	System.out.println(Arrays.binarySearch(a, 99));
	
	
	
	
	
	
	
}
}
