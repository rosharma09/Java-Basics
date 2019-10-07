package OOPConceptsPART1;

public class MethodOverloading {
	
	public static void main(int i) {
		
	}
	
	public static void main(int i, int j) {
		
	}
	
	//  Note : We can over load main() method as well, but we usually dont overload main() method.
	public static void main(String[] args) {
		
		// calling methods
		
		MethodOverloading o1 = new MethodOverloading();
		
		o1.sum();
		o1.sum(1);
		o1.sum(10, 20);
		o1.sum(10.12);
		
	}
	
	// Methods are independent entities
	// IMP : we cannot create a method inside a method and we cannot create duplicate methods
	// methood overloading : creating multiple methods with the same method name but different parameter set
	// imp ques : differnce between method overloading and method overridding
	
	public void sum() {
		System.out.println("Method with no arguments");
		
	}
	
	public void sum(int i) {
		System.out.println("Method with one argument");
		System.out.println(i);
	}
	
	public void sum(int i , int j) {
		System.out.println("Method with two arguments");
		System.out.println(i+j);
	}
	
	public void sum(double i) {
		System.out.println("Method with different data type");
	}

}
