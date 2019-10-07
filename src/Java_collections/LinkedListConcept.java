package Java_collections;

import java.io.ObjectInputStream.GetField;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		// To create a linked list 
		LinkedList<String> l1 = new LinkedList<String>();
		
		// add elements in the linked list 
		
		l1.add("Test");
		l1.add("QTP");
		l1.add("selenium");
		l1.add("RBA");
		l1.add("ROHAN");
		
		// to print the content of the array
		
		System.out.println("The content of singe linked list is : " +l1);
		
		// add values at the head and tail
		
		l1.addFirst("header");
		l1.addLast("automation");
		
		System.out.println("The content of singe linked list is : " +l1);
		
		// to get the values , we use get method
		
		System.out.println(l1.get(0));
		
		// to set the value at an index , we use set() method
		
		l1.set(1, "SECOND");
		
		System.out.println("The content of singe linked list is : " +l1);

		// to remove the first and last element 
		l1.removeFirst();
		l1.removeLast();
		
		System.out.println("The content of singe linked list is : " +l1);
		
		// to remove the element at a particular index
		l1.remove(2);
		System.out.println("The content of singe linked list is : " +l1);

		// iterate the elements of a linked list 
		
		// 1. for loop
		
		System.out.println("Print the elements of an linked list using FOR LOOP");
		for (int i=0 ; i<l1.size();i++) {
			System.out.println(l1.get(i));
		}

		// 2. Using advance FOR LOOP
		
		for(String str : l1) {
			System.out.println(str);
		}
	}

}
