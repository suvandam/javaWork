package com.collection.list.inkedlist;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedLinkedList {

	public static void main(String[] args) {

			//declaring and Initializing an LinkedList of Primitive Type
			List<String> friendsList=new LinkedList<String>();
			
			//Adding data to collection
			friendsList.add("sam");
			friendsList.add("john");
			friendsList.add("lily");
			
			// Synchronizing LinkedList in Java
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
