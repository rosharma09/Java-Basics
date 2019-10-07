package OOPConceptsPART1;

public class StaticVsNonstatic {

	// Global variables
	
	String name = "Rohan"; // Non static global variable
	static int age = 23; // Static global variable
	
	public static void main(String[] args) {
		
		// How to call static method 
		//1. Direct calling
		sum();
		
		//2. Calling by className
		StaticVsNonstatic.sum();
		
		// How to call static variables
		//1. direct calling
		System.out.println(age);
		
		//2. Calling by className 
		System.out.println(StaticVsNonstatic.age);
		
		// How to call non static methods
		// we need to create an object of the class
		StaticVsNonstatic o1 = new StaticVsNonstatic();
		System.out.println(o1.name);
		o1.sndmail();
		
		// can we acess static methods by object refernce - YES
		
		o1.sum(); // one warning is given - static method should be acessed in static way(But it is not a good practice since the static methods are freely available)
		System.out.println(o1.age);
	}
	
	// Non static method
	public void sndmail() {
		System.out.println("send mail method");
	}
	
	//Static method
	public static void sum() {
		System.out.println("Sum method");
	}

}
