package OOPConceptsPART1;

public class LocalVsGlobalVar {
	
	//Class variable or Global variable : variables defined just after the class
	// the scope of global variables is throught out the program
	
	String name = "ROHAN"; // non static 
	int age = 23; // non static

	public static void main(String[] args) {
		
		int i = 10; // local variable for main method
		System.out.println(i);
		//System.out.println(age);
		
		// you cannot acess the global variables or class variables directly
		// we need to create an object of the class and use the non statis variables
		LocalVsGlobalVar obj = new LocalVsGlobalVar(); // copy of global variables and non static method are given to obj 
		System.out.println(obj.name);
		System.out.println(obj.age);
	}
	
	
	public int sum() {
		
		// the scope of these are variables are within the fucntion 
		int i=100; // i and j are local variable for sum() method
		int j=200;
		
		int c=i+j;
		return c;
	}

}
