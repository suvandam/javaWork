package com.collection.map.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapIteration {

	public static void main(String[] args) {
		 HashMap<String, String> Geeks = new HashMap<>();
		 
	        // Adding values to HashMap as ("keys", "values")
	        Geeks.put("Language", "Java");
	        Geeks.put("Platform", "Geeks For geeks");
	        Geeks.put("Code", "HashMap");
	        Geeks.put("Learn", "More");
	        
	        Set<Entry<String,String>> mapSet=Geeks.entrySet();
	        
	        //Returns a Set view of the mappings contained in this map. 
	        //The set is backed by the map, so changes to the map are reflected in the set, and vice-versa.
	        
	        for(Iterator<Entry<String, String>> itr=mapSet.iterator();itr.hasNext();) {
	        		Entry<String,String> obj=itr.next();
	        		System.out.println(obj.getKey()+" - "+obj.getValue());
	        }
	        
	        Iterator it = Geeks.entrySet().iterator();
	        while (it.hasNext()) {
	            Map.Entry pair = (Map.Entry)it.next();
	            System.out.println(pair.getKey() + " = " + pair.getValue());
	            it.remove(); // avoids a ConcurrentModificationException
	        }
	}

}
