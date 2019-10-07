package TestMainMethod;

public class TestClassA {

	public static void main(String[] args) {
		
		System.out.println("A --> Main Method");
		
		// can we call the main method of classB from classA , we call using the class name
		
		TestClassB b = new TestClassB();
		
		b.main(args);
		
		TestClassB.main(args);
	}

}
