package Final_Example;

public class FinallyConcept { 
	public static void main(String[] args) {
		
		test1();
		test2();
		div();
		division(10, 20);

	}
	
	public static void test1() { 
		try {
			System.out.println("Inside test1 method");
			throw new RuntimeException("Test");
		}catch (Exception e) {
			System.out.println("Inside catch block");
		}
				
		// Finally keyword is used with try catch block , and it gaurantees that the block after the exception is caughted
		finally
		{
			System.out.println("Inside finally block");
		}
	}
	
	// in case we use the finally block, no matter if exception is thrwon or not, the finally block will be executed
	
	public static void test2() {
		try {
			System.out.println("Inside test2 method");
		}
		finally {
			System.out.println("Finally code in test2 method");
		}
	}
	
	public static void div() {
		int i = 10;
		try {
			System.out.println("Inside the try bloc");
			int k = i/0;
		}catch (ArithmeticException e) {
			System.out.println("Inside catch block");
			System.out.println("Number cannot be divided by zero");
		}
		
		finally {
			System.out.println("This is finally block for div method");
		}

	}
	
	// Imp Question : In case when we catch arithematic expections with NullPointer catch block
	// finally will be called in all the cases
	
	public static void division(int a , int b) { 
		System.out.println("This is a division method");
		int x=100;
		int y=200;
		try {
			System.out.println("inside try block for division method");
			int res=(x+y)/0;
			System.out.println("The result is : " +res);
		}catch (NullPointerException e) {
		
			System.out.println("inside catch block");
			System.out.println("Cannot be divided by zero");
		}
	
		finally {
			System.out.println("execute the code even after any exception");
		}
	}
}
