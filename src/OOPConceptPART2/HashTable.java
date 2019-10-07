package OOPConceptPART2;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {

		Hashtable h = new Hashtable();
		
		// In hash tables we have the concept of (key,value), where as in case of arrayList we are storing the values based on the array index
		
		// we have put method in case of hash tables, and we need to give the key and value
		
		h.put("A", "Test");
		h.put("B", "HELLO");
		h.put("C", "WORLD");
		
		System.out.println(h.size());
		
		h.put("2", "200");
		
		System.out.println(h.size());
		
		// to check the value for a particular key value
		
		System.out.println(h.get("A"));
		System.out.println(h.get("B"));
		System.out.println(h.get("C"));
		System.out.println(h.get("2"));
		
		// Hash table can store all data types, we can restrict the same
		
		Hashtable<Integer, Integer> h1 = new Hashtable();
		
		h1.put(1, 10); // we have to pass both key and value as integer 
		h1.put(2, 200);
		//h1.put(3, "TEST");
		//h1.put("4", 100);
		
		Hashtable<String, Integer> h3 = new Hashtable<>(); // the key is string and value is integer
		
		// To remove any element from arraylist or hastable , we can make use of remove method
		
		h.remove("A");
		
		System.out.println(h.size());
				
	}

}
