package com.collection.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListBasic {

	public static void main(String[] args) {

		//declaring and Initializing an arrayList of Primitive Type
		ArrayList<String> friendsList=new ArrayList<String>();
		
		//Adding data to collection
		friendsList.add("sam");
		friendsList.add("john");
		friendsList.add("lily");
		
		//Checking the size of collection
		System.out.println("Size of "+friendsList.getClass().getName()+" is "+friendsList.size());
		
		//Iterating through the arraylist
		for(int i=0;i<friendsList.size();i++) {
			System.out.println(friendsList.get(i));
		}
		
		//Check if a value exist in an ArrayList
		System.out.println("Is lily a friend ? "+friendsList.contains("lily"));
		
		//Sort
		Collections.sort(friendsList);
		
		//Iterate Your list again
		
		Iterator<String> itr=friendsList.iterator();
		while(itr.hasNext()) {
			String frnd=itr.next();
			System.out.println(frnd);
		}
		
		//reverse
		Collections.reverse(friendsList);
		
		//Iterate once more
		for (Iterator<String> iter = friendsList.iterator(); iter.hasNext(); ) {
		    String element = iter.next();
		    System.out.println(element);
		}
		
	}

}
