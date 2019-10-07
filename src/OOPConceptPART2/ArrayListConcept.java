package OOPConceptPART2;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		// Dynamic array : the size of the array is based on the values that are being added in the array
		
		ArrayList ar = new ArrayList();
		
		// to add values in the array list
		ar.add(100);
		ar.add(200);
		ar.add(300);
		
		System.out.println(ar.size());
		
		// added two more values , the size will increase
		
		ar.add(400);
		ar.add(500);
		System.out.println(ar.size());
		ar.add(400.123);
		
		// stores the value based on the index 
		
		System.out.println(ar.get(4)); // we can use the get method to get the value at a specified index
		
		//System.out.println(ar.get(10)); // when we try to excess any value that is out of the range of the array , we will get array out of bound exception
		
		
	// To print all the values of the array s
		for (int i = 0 ; i< ar.size() ; i++) {
			System.out.println(ar.get(i));
		}
		
		// In array list we can add all the data types
		// To restrict the addition of values of a specific data type we need to define the array list as below
		
		ArrayList<Integer> ar1 = new ArrayList();
		
		ar1.add(100);
		//ar1.add('TOM'); // we can only add integer values 
		
		ArrayList<String> ar2 = new ArrayList();
		
		ar2.add("TEST");
		System.out.println(ar2.get(0));
		
		System.out.println(ar2.get(0));
		
		ar2.remove(0);

		System.out.println(ar2.get(0));

	}

}
