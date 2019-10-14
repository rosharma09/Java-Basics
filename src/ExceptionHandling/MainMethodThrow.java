package ExceptionHandling;

public class MainMethodThrow {

	public static void main(String[] args) {
		
		try {
			sum();
		} catch (ArithmeticException e) {
			System.out.println("Exception caught");
		}
		
	}
	
	public static void sum() throws ArithmeticException{ 
		div();
	}
	
	public static void div() throws ArithmeticException{
		System.out.println("This method will throw an exception");
		int test = 100/0;
		System.out.println(test);
		System.out.println("line after the exception");
	}

}
