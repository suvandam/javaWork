package com.collection.set.treeset;

import java.util.TreeSet;

public class TreeSetBasic {

	public static void main(String[] args) {
		TreeSet<String> linkedset = new TreeSet<String>();

		// Adding element to TreeSet
		linkedset.add("D");
		linkedset.add("B");
		linkedset.add("C");
		linkedset.add("D");

		// This will not add new element as A already exists
		linkedset.add("A");
		linkedset.add("E");

		System.out.println("Size of TreeSet = " + linkedset.size());
		System.out.println("Original TreeSet:" + linkedset);
		System.out.println("Removing D from TreeSet: " + linkedset.remove("D"));
		System.out.println("Trying to Remove Z which is not " + "present: " + linkedset.remove("Z"));
		System.out.println("Checking if A is present=" + linkedset.contains("A"));
		System.out.println("Updated TreeSet: " + linkedset);
	}

}
