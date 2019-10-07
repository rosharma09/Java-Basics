package TestMainMethod;

public class TestMainConcept {

	// Can we over load the main method : we can overload the main method 

	// Method OverLoading : Having multiple methods having the same name, but
	// different argument list

	// Duplicates methods are not allowed

	// JVM will try to find the exact main(String[] args) in the program, if not
	// found the the program will not be executed
	public static void main(String[] args) {

		System.out.println("Main Method");
		
		main("TEST");
		
		main(10);
		
		main(10, 20);
	}

	public static void main(String args) {

		System.out.println("Main Method having string parameter");
	}

	public static void main(int a) {

		System.out.println("Main Method with one argument");
	}

	public static void main(int a, int b) {

		System.out.println("Main Method with two arguments");
	}

}
