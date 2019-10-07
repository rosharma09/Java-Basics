package Final_Example;

public class FinalizeConcept {
	
	// finalize is not a keyword, it is a method that is used to clean up the java memory
	
	public void finalize() {
		System.out.println("Finalize method");
	}


	public static void main(String[] args) {
		
	
		// create objects of class FinalizeConcept
		
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		
		// inside the memory, two objects will be created with f1 and f2 refering to these two objects respectively 
		
		f1=null;
		f2=null;
		
		// now the reference variable f1 and f2 are pointing to nothing, therefore in the java memory we will have two blank objects that are not pointed to by anything
		
		// garbage collector : will remove all the objects that are not having any reference
		// In Java , when there are objects having no name, then the garabage collector is called to remove those objects and those are removed from the java memory
		// we can use the finalize() method to call the garbage collector
		
		// to clean up the process
		System.gc(); // to call the garbage collector to free up the memory
		
		// final --> keyword
		// finally --> block 
		// finalize --> method 
	}

}
