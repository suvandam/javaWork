package com.collection.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedArrayList {

	public static void main(String[] args) {

			//declaring and Initializing an arrayList of Primitive Type
			List<String> friendsList=new ArrayList<String>();
			
			//Adding data to collection
			friendsList.add("sam");
			friendsList.add("john");
			friendsList.add("lily");
			
			// Synchronizing ArrayList in Java
			friendsList= Collections.synchronizedList(friendsList);
			
			//Iterate once more
			synchronized(friendsList){
			for (Iterator<String> iter = friendsList.iterator(); iter.hasNext(); ) {
			    String element = iter.next();
			    System.out.println(element);
			}	
			}
		}
			
}
