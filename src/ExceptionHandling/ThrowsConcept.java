package ExceptionHandling;

public class ThrowsConcept {

	public static void main(String[] args) throws ArithmeticException{
		//2. Throw is used for handling exceptions, but we are not reporting the exception
		
		// JVM will accept the exception in case when the main method throws the exception
		
		ThrowsConcept obj1 = new ThrowsConcept();
		try {
			obj1.sum(); // calling method
		} catch (ArithmeticException e) {
			System.out.println("Exception caught");
		}
		System.out.println("Line after the exception is caught by JVM");
	}

	public void sum() throws ArithmeticException{
		div(); // called method
	}
	
	public void div() throws ArithmeticException{
		int i = 9/0;  // exception is coming here 
		System.out.println("Line after the exception thrown ");
	}
	
	// this is the exception hierarchy 
	
//	Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at ExceptionHandling.ThrowsConcept.div(ThrowsConcept.java:19)
//	at ExceptionHandling.ThrowsConcept.sum(ThrowsConcept.java:15)
//	at ExceptionHandling.ThrowsConcept.main(ThrowsConcept.java:11)
}
