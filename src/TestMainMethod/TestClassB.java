package TestMainMethod;

public class TestClassB {

	public static void main(String[] args) {
		
		System.out.println("B --> Main Method");
		
		TestClassA.main(args);
	}

}
